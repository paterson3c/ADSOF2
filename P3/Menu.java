package P3;

import java.util.*;
import P3.Info.*;

public class Menu extends Comida {
    private static int i = 1;
    private final int id;
    private HashSet<Plato> platos;

    public Menu(Plato... platos){
        this.id = i++;
        this.platos = new HashSet<Plato>(Arrays.asList(platos));
        this.alergenos = new HashSet<Alergeno>();
        this.info = new InfoNutricionalPlato(0, 0, 0, 0, 0, 0, 0, 0);
        for (Plato plato : platos) {
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
    }

    public HashSet<Plato> getPlatos() {
        return this.platos;
    }

    public void addPlato(Plato plato) {
        this.platos.add(plato);
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
    
    @Override
    public String toString() {
        String ret;
        ret = "Menu " + this.id + " [";
        for (Plato plato : this.platos) {
            ret += plato.getName() + ", ";
        }
        ret = ret.substring(0, ret.length() - 2) + "]: " + this.info.toString();
        if (this.alergenos.size() < 1) 
            return ret;
        ret += " CONTIENE ";
        for (Alergeno alergeno : this.alergenos) {
            ret += alergeno + ", ";
        }
        return ret.substring(0, ret.length() - 2);
    }
}
