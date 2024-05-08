import fabrica.FabricaFiguraGeometrica;
import exceptions.ExceptionValorInvalido;
import formas_geometricas.FiguraGeometrica;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestQuadrado {
    private FiguraGeometrica quadrado;
    private FiguraGeometrica quadrado2;

    @BeforeEach
    public void setUp() throws ExceptionValorInvalido {
        quadrado = FabricaFiguraGeometrica.getQuadrado(4);
        quadrado2 = FabricaFiguraGeometrica.getQuadrado(5);
    }

    // QUADRADO 1

    @Test
    public void testAreaQuadrado() {
        assertEquals(16.00, quadrado.getArea(), 1);
    }


    @Test
    public void testPerimetroQuadrado() {
        assertEquals(16.00, quadrado.getPerimetro(), 1);
    }

    //QUADRADO 2

    @Test
    public void testAreaQuadrado2() {
        assertEquals(25.00, quadrado2.getArea(), 1);
    }


    @Test
    public void testPerimetroQuadrado2() {
        assertEquals(20.00, quadrado2.getPerimetro(), 1);
    }
}