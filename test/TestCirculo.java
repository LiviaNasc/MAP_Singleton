import fabrica.FabricaFiguraGeometrica;
import exceptions.ExceptionValorNegativoOuZero;
import formas_geometricas.FiguraGeometrica;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCirculo{
    static FiguraGeometrica circulo;

    @BeforeAll
    public static void setUp() throws ExceptionValorNegativoOuZero {
        circulo = FabricaFiguraGeometrica.getCirculo(3);
    }

    @Test
    public void testAreaCirculo(){
        assertEquals(28.27, circulo.getArea(), 1);
    }

    @Test
    public void testPerimetroCirculo(){
        assertEquals(18.85, circulo.getPerimetro(), 1);
    }
}