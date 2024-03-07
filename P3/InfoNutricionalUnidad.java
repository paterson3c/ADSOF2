package P3;

public class InfoNutricionalUnidad extends InfoNutricional{
    public InfoNutricionalUnidad(double calorias, double carbohidratos, double grasasTotales, double grasasSaturadas, double proteinas, double azucares, double fibra, double sodio) {
        super(calorias, carbohidratos, grasasTotales, grasasSaturadas, proteinas, azucares, fibra, sodio);
    }

    /* INFORMACION NUTRICIONAL POR UNIDAD -> Valor energetico: 14.00 kcal, Hidratos de
carbono: 2.20 g, Grasas: 0.20 g, Saturadas: 0.00 g, Proteinas: 0.70 g, Azucares: 2.04 g, Fibra: 1.00 g, Sodio:
4.00 mg. */
    @Override
    public String toString() {
        return "Valor energetico: " + this.getCalorias() + " kcal, Hidratos de carbono: " + this.getCarbohidratos() + " g, Grasas: " + this.getGrasasTotales() + " g, Saturadas: " + this.getGrasasSaturadas() + " g, Proteinas: " + this.getProteinas() + " g, Azucares: " + this.getAzucares() + " g, Fibra: " + this.getFibra() + " g, Sodio: " + this.getSodio() + " mg.";
    }
}
