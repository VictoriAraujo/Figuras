import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RepositorioDeFigura2D {
    private List<FiguraGeometrica2D> figuras = new ArrayList<>();

    public boolean adicionaFigura(FiguraGeometrica2D figura){
        return figuras.add(figura);
    }
    public FiguraGeometrica2D removerFigura( int posicao){
        return figuras.remove(posicao);
    }
    public double recuperarArea(int posicao){
        return figuras.get(posicao).areaFigura();
    }
    public double recuperarPerimetro(int posicao){
        return figuras.get(posicao).perimetroFigura();
    }
    public String recuperaTipo(int posicao){
        return figuras.get(posicao).tipoFigura();
    }
    public void ordenarFiguras(){
        Collections.sort(figuras);
    }
}
