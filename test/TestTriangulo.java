import fabrica.FabricaFiguraGeometrica;
import exceptions.ExceptionValorInvalido;
import formas_geometricas.FiguraGeometrica;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestTriangulo {
    private FiguraGeometrica triangulo;

    @BeforeEach
    public void setUp() throws ExceptionValorInvalido {
        triangulo = FabricaFiguraGeometrica.getTriangulo(3, 4, 5);
    }

    @Test
    public void testAreaTriangulo() {
        assertEquals(6.00, triangulo.getArea(), 1);
    }


    @Test
    public void testPerimetroTriangulo() {
        assertEquals(12.00, triangulo.getPerimetro(), 1);
    }

    @Test
    public void testTriangulo() throws ExceptionValorInvalido {
        assertNotNull(FabricaFiguraGeometrica.getTriangulo(3, 4, 5));
    }

    @Test
    public void testTriangulo2() throws ExceptionValorInvalido {
        assertNotNull(FabricaFiguraGeometrica.getTriangulo(5, 5, 5));
    }

    @Test
    public void testTrianguloEquilatero() throws ExceptionValorInvalido {
        assertNotNull(FabricaFiguraGeometrica.getTriangulo(10, 10, 10));
    }

    @Test
    public void testTrianguloEquilatero2() throws ExceptionValorInvalido {
        assertNotNull(FabricaFiguraGeometrica.getTriangulo(3, 3, 3));
    }


    @Test
    public void testTrianguloIsosceles1() throws ExceptionValorInvalido {
        assertNotNull(FabricaFiguraGeometrica.getTriangulo(4, 3, 4));
    }

    @Test
    public void testTrianguloIsosceles2() throws ExceptionValorInvalido {
        assertNotNull(FabricaFiguraGeometrica.getTriangulo(10, 10, 6));

    }

    @Test
    public void testTrianguloRetangulo1() throws ExceptionValorInvalido {
        assertNotNull(FabricaFiguraGeometrica.getTriangulo(18, 24, 30));
    }

    @Test
    public void testTrianguloRetangulo2() throws ExceptionValorInvalido {
        assertNotNull(FabricaFiguraGeometrica.getTriangulo(7, 24, 25));
    }
}