package P3.Info;

public abstract class InfoNutricional {
    
    private double calorias;
    private double carbohidratos;
    private double grasasTotales;
    private double grasasSaturadas;
    private double proteinas;
    private double azucares;
    private double fibra;
    private double sodio;

    public InfoNutricional(double calorias, double carbohidratos, double grasasTotales, double grasasSaturadas, double proteinas, double azucares, double fibra, double sodio) {
        this.calorias = calorias;
        this.carbohidratos = carbohidratos;
        this.grasasTotales = grasasTotales;
        this.grasasSaturadas = grasasSaturadas;
        this.proteinas = proteinas;
        this.azucares = azucares;
        this.fibra = fibra;
        this.sodio = sodio;
    }

     public double getCalorias() {
        return this.calorias;
    }
    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getCarbohidratos() {
        return this.carbohidratos;
    }
    public void setCarbohidratos(double carbohidratos) {
        this.carbohidratos = carbohidratos;
    }

    public double getGrasasTotales() {
        return this.grasasTotales;
    }
    public void setGrasasTotales(double grasasTotales) {
        this.grasasTotales = grasasTotales;
    }

    public double getGrasasSaturadas() {
        return this.grasasSaturadas;
    }
    public void setGrasasSaturadas(double grasasSaturadas) {
        this.grasasSaturadas = grasasSaturadas;
    }

    public double getProteinas() {
        return this.proteinas;
    }
    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public double getAzucares() {
        return this.azucares;
    }
    public void setAzucares(double azucares) {
        this.azucares = azucares;
    }

    public double getFibra() {
        return this.fibra;
    }
    public void setFibra(double fibra) {
        this.fibra = fibra;
    }

    public double getSodio() {
        return this.sodio;
    }
    public void setSodio(double sodio) {
        this.sodio = sodio;
    }

    public String toString() {
        return "Valor energetico: " + String.format("%.2f", calorias) + " kcal, Hidratos de carbono: " +
        String.format("%.2f", carbohidratos) + " g, Grasas: " + String.format("%.2f", grasasTotales) + " g, Saturadas: " +
        String.format("%.2f", grasasSaturadas) + " g, Proteinas: " + String.format("%.2f", proteinas) + " g, Azucares: " +
        String.format("%.2f", azucares) + " g, Fibra: " + String.format("%.2f", fibra) + " g, Sodio: " + String.format("%.2f", sodio) + " mg.";
    }

}
