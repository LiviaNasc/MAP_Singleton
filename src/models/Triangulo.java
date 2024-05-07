package models;

import exceptions.ExceptionValorNegativoOuZero;

public class Triangulo implements FiguraGeometrica {

    private double a, b, c;

    public Triangulo(double a, double b, double c) throws ExceptionValorNegativoOuZero {
        if (a <=0 || b <=0 || c <=0 ) {
            throw new ExceptionValorNegativoOuZero();
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public double getPerimetro() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "O triângulo criado tem lados de tamanho: " + a + ", " + b + ", " + c;
    }
}
