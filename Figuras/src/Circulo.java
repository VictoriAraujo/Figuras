import java.util.Collection;
import java.util.Collections;

public class Circulo implements FiguraGeometrica2D{

    private double raio;
    public Circulo(double raio){
        super();
        this.raio = raio;
    }

    @Override
    public double areaFigura() {
        double area = Math.PI * Math.pow(raio,2);
        return area;
    }

    @Override
    public double perimetroFigura() {
       double perimetro = 2* Math.PI * raio;
       return perimetro;
    }

    @Override
    public String tipoFigura() {
        String tipo = "Circulo";
        return tipo;
    }

    public int compareTo(FiguraGeometrica2D figura){
        return Double.compare(this.areaFigura(), figura.areaFigura());
    }
}
