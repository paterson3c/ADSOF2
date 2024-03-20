package P3.Info;

public class InfoNutricionalPeso extends InfoNutricional{
    public InfoNutricionalPeso(double calorias, double carbohidratos, double grasasTotales, double grasasSaturadas, double proteinas, double azucares, double fibra, double sodio) {
        super(calorias, carbohidratos, grasasTotales, grasasSaturadas, proteinas, azucares, fibra, sodio);
    }


    /* INFORMACION NUTRICIONAL POR 100 g -> Valor energetico: 885.00 kcal, Hidratos de carbono: 0.00
g, Grasas: 100.00 g, Saturadas: 12.81 g, Proteinas: 0.00 g, Azucares: 0.00 g, Fibra: 0.00 g, Sodio: 2.00 mg. */
    @Override
    public String toString() {
        return "INFORMACION NUTRICIONAL POR 100 g -> " + super.toString();
    }
    
}