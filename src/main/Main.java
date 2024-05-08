package main;

import formas_geometricas.FiguraGeometrica;
import fabrica.FabricaFiguraGeometrica;
import exceptions.ExceptionValorInvalido;

public class Main{

    public static void main(String[] args) throws ExceptionValorInvalido {
        System.out.println("---------------CÍRCULO---------------");
        System.out.println("Criando primeiro Círculo de raio 5");
        FiguraGeometrica circulo = FabricaFiguraGeometrica.getCirculo(5);
        System.out.println(circulo);
        System.out.printf("Área: %.2f\n", circulo.getArea());
        System.out.printf("Perímetro: %.2f\n", circulo.getPerimetro());

        System.out.println("\nCriando segundo Círculo de raio 10");
        circulo = FabricaFiguraGeometrica.getCirculo(10);
        System.out.println(circulo);
        System.out.printf("Área: %.2f\n", circulo.getArea());
        System.out.printf("Perímetro: %.2f\n", circulo.getPerimetro());

        System.out.println("\n---------------TRIÂNGULOS---------------");

        System.out.println("Criando primeiro Triangulo equilátero de lados 10, 10, 10");
        FiguraGeometrica equilatero = FabricaFiguraGeometrica.getTriangulo(10, 10, 10);
        System.out.println(equilatero);
        System.out.printf("Área: %.2f\n", equilatero.getArea());
        System.out.printf("Perímetro: %.2f\n", equilatero.getPerimetro());

        System.out.println("\nCriando segundo Triangulo equilátero de lados 20, 20, 20");
        equilatero = FabricaFiguraGeometrica.getTriangulo(20, 20, 20);
        System.out.println(equilatero);
        System.out.printf("Área: %.2f\n", equilatero.getArea());
        System.out.printf("Perímetro: %.2f\n", equilatero.getPerimetro());

        System.out.println("\nCriando primeiro Triangulo isoceles de lados 10, 10, 6");
        FiguraGeometrica isosceles = FabricaFiguraGeometrica.getTriangulo(10, 10, 6);
        System.out.println(isosceles);
        System.out.printf("Área: %.2f\n", isosceles.getArea());
        System.out.printf("Perímetro: %.2f\n", isosceles.getPerimetro());

        System.out.println("\nCriando segundo Triangulo isoceles de lados 20, 20, 12");
        isosceles = FabricaFiguraGeometrica.getTriangulo(10, 10, 12);
        System.out.println(isosceles);
        System.out.printf("Área: %.2f\n", isosceles.getArea());
        System.out.printf("Perímetro: %.2f\n", isosceles.getPerimetro());

        System.out.println("\nCriando primeiro Triangulo retangulo de lados 3, 4, 5");
        FiguraGeometrica retangulo = FabricaFiguraGeometrica.getTriangulo(3, 4, 5);
        System.out.println(retangulo);
        System.out.printf("Área: %.2f\n", retangulo.getArea());
        System.out.printf("Perímetro: %.2f\n", retangulo.getPerimetro());

        System.out.println("\nCriando segundo Triangulo retangulo de lados 6, 8, 10");
        retangulo = FabricaFiguraGeometrica.getTriangulo(6, 8, 10);
        System.out.println(retangulo);
        System.out.printf("Área: %.2f\n", retangulo.getArea());
        System.out.printf("Perímetro: %.2f\n", retangulo.getPerimetro());


        System.out.println("\n---------------QUADRADOS---------------");

        System.out.println("Criando primeiro Quadrado de lado 4");
        FiguraGeometrica  quadrado = FabricaFiguraGeometrica.getQuadrado(4);
        System.out.println(quadrado);
        System.out.printf("Área: %.2f\n", quadrado.getArea());
        System.out.printf("Perímetro: %.2f\n", quadrado.getPerimetro());

        System.out.println("\nCriando segundo Quadrado de lado 5");
        quadrado = FabricaFiguraGeometrica.getQuadrado(5);
        System.out.println(quadrado);
        System.out.printf("Área: %.2f\n", quadrado.getArea());
        System.out.printf("Perímetro: %.2f\n", quadrado.getPerimetro());

        System.out.println("\nCriando terceiro Quadrado de lado 8");
        quadrado = FabricaFiguraGeometrica.getQuadrado(8);
        System.out.println(quadrado);
        System.out.printf("Área: %.2f\n", quadrado.getArea());
        System.out.printf("Perímetro: %.2f\n", quadrado.getPerimetro());

        System.out.println("\nCriando quarto Quadrado de lado 10");
        quadrado = FabricaFiguraGeometrica.getQuadrado(10);
        System.out.println(quadrado);
        System.out.printf("Área: %.2f\n", quadrado.getArea());
        System.out.printf("Perímetro: %.2f\n", quadrado.getPerimetro());
    }

}