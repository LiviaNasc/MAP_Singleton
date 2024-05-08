package fabrica;

import exceptions.ExceptionValorInvalido;
import formas_geometricas.Circulo;
import formas_geometricas.Quadrado;
import formas_geometricas.Triangulo;

public class FabricaFiguraGeometrica {

    public static Circulo getCirculo(double raio) throws ExceptionValorInvalido {
        return Circulo.getInstance(raio);
    }

    public static Quadrado getQuadrado(double lado) throws ExceptionValorInvalido {
        return new Quadrado(lado);
    }

    public static Triangulo getTriangulo(double a, double b, double c) throws ExceptionValorInvalido {
        return Triangulo.getInstance(a, b, c);
    }


}