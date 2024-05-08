import fabrica.FabricaFiguraGeometrica;
import exceptions.ExceptionValorInvalido;
import formas_geometricas.FiguraGeometrica;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCirculo{
    private FiguraGeometrica circulo;

    @BeforeEach
    public void setUp() throws ExceptionValorInvalido {
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