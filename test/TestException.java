import models.FiguraGeometrica;
import controller.FabricaFiguraGeometrica;
import exceptions.ExceptionValorNegativoOuZero;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertThrows;


public class TestException {
    static FiguraGeometrica circuloException;
    static FiguraGeometrica quadradoException;
    static FiguraGeometrica trianguloException;


    @Test
    public void testException(){
        assertThrows(ExceptionValorNegativoOuZero.class, () -> {
            circuloException = FabricaFiguraGeometrica.getCirculo(-2);
            quadradoException = FabricaFiguraGeometrica.getQuadrado(-1);
            trianguloException = FabricaFiguraGeometrica.getTriangulo(-1, 0, 30);
        });
    }
}
