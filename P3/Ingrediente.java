package P3;

import java.util.*;

import P3.Info.InfoNutricional;

public class Ingrediente extends Comida{
    private Object type;
    private double cantidad;

    public Ingrediente(String name, Object type, InfoNutricional info) {
        super.name = name;
        this. type = type;
        this.info = info;
        this.alergenos = new HashSet<Alergeno>();
    }
    
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Object getType() {
        return this.type;
    }
    public void setType(TipoIngrediente type) {
        this.type = type;
    }

    public InfoNutricional getInfo() {
        return this.info;
    }
    public void setInfo(InfoNutricional info) {
        this.info = info;
    }

    public HashSet<Alergeno> getAlergenos() {
        return this.alergenos;
    }
    public void setAlergenos(HashSet<Alergeno> alergenos) {
        this.alergenos = alergenos;
    }

    public Ingrediente tieneAlergenos(Alergeno... alergenos) {
        this.alergenos = new HashSet<Alergeno>(Arrays.asList(alergenos));
        return this;
    }

    @Override
    public String toString() {
        String ret;
        ret = "[" + this.type + "] " + this.name + ": " + this.info.toString();
        if (this.alergenos.size() < 1) 
            return ret;
        
        ret += " CONTIENE ";
        for (Alergeno alergeno : this.alergenos) {
            ret += alergeno.toString().toLowerCase() + ", ";
        }
        return ret.substring(0, ret.length() - 2);
    }

    public double getCantidad() {
        return this.cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}