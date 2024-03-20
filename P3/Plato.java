package P3;

import java.util.*;

public class Plato {
    private String name;
    private Set<Ingrediente> ingredientes;

    public Plato(String name) {
        this.name = name;
        this.ingredientes = new HashSet<>();
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Set<Ingrediente> getIngredientes() {
        return this.ingredientes;
    }
    public void setIngredientes(Set<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }


    public boolean addIngrediente(Ingrediente ingrediente, int cantidad) {
        boolean ret = false;
        ret = this.ingredientes.add(ingrediente);
        this.infoUpdate();
        return ret;
    }

    public boolean addPlato(Plato plato) {
        boolean ret = false;
        ret = this.ingredientes.addAll(plato.getIngredientes());
        this.infoUpdate();
        return ret;
    }

    public void infoUpdate() {
        double calorias = 0;
        double carbohidratos = 0;
        double grasasTotales = 0;
        double grasasSaturadas = 0;
        double proteinas = 0;
        double azucares = 0;
        double fibra = 0;
        double sodio = 0;
        for (Ingrediente ingrediente : this.ingredientes) {
            InfoNutricional info = ingrediente.getInfo();
            calorias += info.getCalorias();
            carbohidratos += info.getCarbohidratos();
            grasasTotales += info.getGrasasTotales();
            grasasSaturadas += info.getGrasasSaturadas();
            proteinas += info.getProteinas();
            azucares += info.getAzucares();
            fibra += info.getFibra();
            sodio += info.getSodio();
        }
        InfoNutricional info = new InfoNutricionalPeso(calorias, carbohidratos, grasasTotales, grasasSaturadas, proteinas, azucares, fibra, sodio);
        for (Ingrediente ingrediente : this.ingredientes) {
            ingrediente.setInfo(info);
        }
    }


    @Override
    /** [Plato] Tortilla: INFORMACION NUTRICIONAL DEL PLATO -> Valor energetico: 385.20 kcal, Hidratos de carbono:
27.10 g, Grasas: 22.75 g, Saturadas: 1.68 g, Proteinas: 16.20 g, Azucares: 1.20 g, Fibra: 3.90 g, Sodio: 3.40 mg.
CONTIENE huevo */
    public String toString() {
        String ret;
        ret = "[" + this.getClass().getSimpleName() + "] " + this.name + ": INFORMACION NUTRICIONAL DEL PLATO -> ";
        for (Ingrediente ingrediente : this.ingredientes) {
            ret += ingrediente.getInfo().toString();
        }
        return ret;
    }
    
}
