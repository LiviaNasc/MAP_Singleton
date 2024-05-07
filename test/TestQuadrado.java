import controller.FabricaFiguraGeometrica;
import exceptions.ExceptionValorNegativoOuZero;
import models.FiguraGeometrica;
import models.Quadrado;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestQuadrado {
    static FiguraGeometrica quadrado, quadrado2;

    @BeforeAll
    public static void setUp() throws ExceptionValorNegativoOuZero {
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