package P3;

import java.util.*;
import P3.Info.*;

public abstract class Comida {
    protected InfoNutricional info;
    protected HashSet<Alergeno> alergenos;
    protected String name;

    public HashSet<Alergeno> getAlergenos() {
        return this.alergenos;
    }

    public InfoNutricional getInfoNutricional() {
        return this.info;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
