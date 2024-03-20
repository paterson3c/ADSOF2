package P3;

import java.util.*;
import P3.Info.*;

public class Plato extends Comida {
    private HashSet<Ingrediente> ingredientes;
    private HashSet<Plato> platos;

    public Plato(String name) {
        this.name = name;
        this.ingredientes = new HashSet<Ingrediente>();
        this.platos = new HashSet<Plato>();
        this.alergenos = new HashSet<Alergeno>();
        this.info = new InfoNutricionalPlato(0, 0, 0, 0, 0, 0, 0, 0);
    }

    public HashSet<Ingrediente> getIngredientes() {
        return this.ingredientes;
    }
    public HashSet<Plato> getPlatos() {
        return this.platos;
    }

    public void setIngredientes(HashSet<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
    public void setPlatos(HashSet<Plato> platos) {
        this.platos = platos;
    }

    public boolean addIngrediente(Ingrediente ingrediente, double quantity) {
        boolean ret;
        ingrediente.setCantidad(quantity);
        ret = this.ingredientes.add(ingrediente);
        if (ret) {
            if(quantity > 9) {
                quantity = quantity / 100;
            }
            this.info.setCalorias(this.info.getCalorias() + (ingrediente.getInfo().getCalorias() * quantity));
            this.info.setCarbohidratos(this.info.getCarbohidratos() + (ingrediente.getInfo().getCarbohidratos() * quantity));
            this.info.setGrasasTotales(this.info.getGrasasTotales() + (ingrediente.getInfo().getGrasasTotales() * quantity));
            this.info.setGrasasSaturadas(this.info.getGrasasSaturadas() + (ingrediente.getInfo().getGrasasSaturadas() * quantity));
            this.info.setProteinas(this.info.getProteinas() + (ingrediente.getInfo().getProteinas() * quantity));
            this.info.setAzucares(this.info.getAzucares() + (ingrediente.getInfo().getAzucares() * quantity));
            this.info.setFibra(this.info.getFibra() + (ingrediente.getInfo().getFibra() * quantity));
            this.info.setSodio(this.info.getSodio() + (ingrediente.getInfo().getSodio() * quantity));

            this.alergenos.addAll(ingrediente.getAlergenos());
        }

        return ret;
    }

    public boolean addPlato(Plato plato) {
        boolean ret;
        ret = this.platos.add(plato);
        if (ret) {
            this.info.setCalorias(this.info.getCalorias() + plato.getInfoNutricional().getCalorias());
            this.info.setCarbohidratos(this.info.getCarbohidratos() + plato.getInfoNutricional().getCarbohidratos());
            this.info.setGrasasTotales(this.info.getGrasasTotales() + plato.getInfoNutricional().getGrasasTotales());
            this.info.setGrasasSaturadas(this.info.getGrasasSaturadas() + plato.getInfoNutricional().getGrasasSaturadas());
            this.info.setProteinas(this.info.getProteinas() + plato.getInfoNutricional().getProteinas());
            this.info.setAzucares(this.info.getAzucares() + plato.getInfoNutricional().getAzucares());
            this.info.setFibra(this.info.getFibra() + plato.getInfoNutricional().getFibra());
            this.info.setSodio(this.info.getSodio() + plato.getInfoNutricional().getSodio());

            this.alergenos.addAll(plato.getAlergenos());
        }

        return ret;
    }

    /** [Plato] Tortilla: INFORMACION NUTRICIONAL DEL PLATO -> Valor energetico: 385.20 kcal, Hidratos de carbono:
    27.10 g, Grasas: 22.75 g, Saturadas: 1.68 g, Proteinas: 16.20 g, Azucares: 1.20 g, Fibra: 3.90 g, Sodio: 3.40 mg.
    CONTIENE huevo
    */
    @Override
    public String toString() {
        String ret;
        ret = "[" + this.getClass().getSimpleName() + "] " + this.name + ": INFORMACION NUTRICIONAL DEL PLATO -> " + this.info.toString();
        if (this.alergenos.size() < 1) 
            return ret;
        
        ret += " CONTIENE ";
        for (Alergeno alergeno : this.alergenos) {
            ret += alergeno.toString().toLowerCase() + ", ";
        }
        return ret.substring(0, ret.length() - 2);
    }
    
}
