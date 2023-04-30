public class Quadrado implements FiguraGeometrica2D{
    public double lado;
    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double areaFigura() {
        double area = lado * lado;
        return area;
    }

    @Override
    public double perimetroFigura() {
        double perimetro = lado * 4;
        return perimetro;
    }

    @Override
    public String tipoFigura() {
        String tipo = "Quadrado";
        return tipo;
    }

    public int compareTo(FiguraGeometrica2D figura){
        return Double.compare(this.areaFigura(), figura.areaFigura());
    }
}