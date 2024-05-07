package fabrica;

import exceptions.ExceptionValorNegativoOuZero;
import formas_geometricas.Circulo;
import formas_geometricas.Quadrado;
import formas_geometricas.Triangulo;

public class FabricaFiguraGeometrica {

    public static Circulo getCirculo(double raio) throws ExceptionValorNegativoOuZero {
        return Circulo.getInstance(raio);
    }

    public static Quadrado getQuadrado(double lado) throws ExceptionValorNegativoOuZero {
        return new Quadrado(lado);
    }

    public static Triangulo getTriangulo(double a, double b, double c) throws ExceptionValorNegativoOuZero {
        return Triangulo.getInstance(a, b, c);
    }


}