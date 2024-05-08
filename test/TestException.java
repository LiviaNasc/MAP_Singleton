import fabrica.FabricaFiguraGeometrica;
import exceptions.ExceptionValorInvalido;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertThrows;


public class TestException {
    @Test
    public void testCirculoException() {
        assertThrows(ExceptionValorInvalido.class, () -> FabricaFiguraGeometrica.getCirculo(-2));
    }

    @Test
    public void testQuadradoException() {
        assertThrows(ExceptionValorInvalido.class, () -> FabricaFiguraGeometrica.getQuadrado(-1));
    }

    @Test
    public void testTrianguloException() {
        assertThrows(ExceptionValorInvalido.class, () -> FabricaFiguraGeometrica.getTriangulo(-1, 0, 30));
    }

}
