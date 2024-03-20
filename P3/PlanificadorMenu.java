package P3;

import java.util.*;

public class PlanificadorMenu {
    private List<Plato> platos;
    private Map<ElementoNutricional, Double> maximos = new HashMap<>();
    private Set<Alergeno> alergenos = new HashSet<>();

    public PlanificadorMenu(List<Plato> platos) {
        this.platos = platos;
        for (ElementoNutricional elemento : ElementoNutricional.values()) {
            this.maximos.put(elemento, Double.MAX_VALUE);
        }
    }

    public PlanificadorMenu conMaximo(ElementoNutricional elemento, double maximo) {
        this.maximos.put(elemento, maximo);
        return this;
    }

    public PlanificadorMenu sinAlergenos(Alergeno... alergenos) {
        this.alergenos = new HashSet<>(Arrays.asList(alergenos));
        return this;
    }

    public Menu planificar(int minCalorias, int maxCalorias) {
        List<Plato> best = null;
        int bestCalorias = Integer.MAX_VALUE;

        for (int i = 0; i < (1 << this.platos.size()); i++) {
            List<Plato> current = new ArrayList<>();
            int currentCalorias = 0;
            double currentGrasaSaturada = 0;
            double currentAzucares = 0;
            Set<Alergeno> currentAlergenos = new HashSet<>();

            for (int j = 0; j < this.platos.size(); j++) {
                if ((i & (1 << j)) > 0) {
                    Plato plato = this.platos.get(j);
                    current.add(plato);
                    currentCalorias += plato.getInfoNutricional().getCalorias();
                    currentGrasaSaturada += plato.getInfoNutricional().getGrasasSaturadas();
                    currentAzucares += plato.getInfoNutricional().getAzucares();
                    currentAlergenos.addAll(plato.getAlergenos());
                }
            }

            if (currentCalorias >= minCalorias && currentCalorias <= maxCalorias) {
                boolean valid = true;
                for (ElementoNutricional elemento : ElementoNutricional.values()) {
                    if (this.maximos.get(elemento) < Double.MAX_VALUE) {
                        double currentElemento = 0;
                        switch (elemento) {
                            case GRASA_SATURADA:
                                currentElemento = currentGrasaSaturada;
                                break;
                            case AZUCARES:
                                currentElemento = currentAzucares;
                                break;
                            default:
                                break;
                        }
                        if (currentElemento > this.maximos.get(elemento)) {
                            valid = false;
                            break;
                        }
                    }
                }
                if (valid && !currentAlergenos.containsAll(this.alergenos)) {
                    if (currentCalorias < bestCalorias) {
                        best = current;
                        bestCalorias = currentCalorias;
                    }
                }
            }
        }

        if (best == null) {
            return null;
        }

        Menu menu = new Menu(best.toArray(new Plato[0]));
        return menu;
    }
}
