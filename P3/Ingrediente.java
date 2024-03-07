package P3;

import java.util.*;

public class Ingrediente {
    private String name;
    private Object type;
    private InfoNutricional info;
    private List<Alergeno> alergenos;

    public Ingrediente(String name, Object type, InfoNutricional info) {
        this.name = name;
        this. type = type;
        this.info = info;
        this.alergenos = new ArrayList<>();
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

    public List<Alergeno> getAlergenos() {
        return this.alergenos;
    }
    public void setAlergenos(List<Alergeno> alergenos) {
        this.alergenos = alergenos;
    }

    public Ingrediente tieneAlergenos(Alergeno... alergenos) {
        this.alergenos = Arrays.asList(alergenos);
        return this;
    }

    /* * [Huevo] Huevo: INFORMACION NUTRICIONAL POR UNIDAD -> Valor energetico: 84.60 kcal, Hidratos de carbono: 0.35 g,
Grasas: 6.30 g, Saturadas: 0.20 g, Proteinas: 6.60 g, Azucares: 0.60 g, Fibra: 0.00 g, Sodio: 0.10 mg. CONTIENE
huevo */
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

}