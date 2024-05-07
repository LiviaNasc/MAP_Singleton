package formas_geometricas;

import exceptions.ExceptionValorNegativoOuZero;

public class Triangulo implements FiguraGeometrica {

    private static Triangulo[] instance = {null, null, null};
    private double a, b, c;

    private Triangulo(double a, double b, double c) throws ExceptionValorNegativoOuZero {
        if (a <=0 || b <=0 || c <=0 ) {
            throw new ExceptionValorNegativoOuZero();
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static Triangulo getInstance(double a, double b, double c) throws ExceptionValorNegativoOuZero {
        if (a <=0 || b <=0 || c <=0 ) {
            throw new ExceptionValorNegativoOuZero();
        }
        if (!isTriangle(a, b, c)) {
            return null;
        } else if (isEquilateral(a,b,c)) {
            if(instance[0] == null){
                instance[0] = new Triangulo(a, b, c);
            }
            return instance[0];
        }else if (isRectangle(a,b,c)) {
            if(instance[1] == null){
                instance[1] = new Triangulo(a, b, c);
            }
            return instance[1];
        }else if (isIsosceles(a,b,c)) {
            if(instance[2] == null){
                instance[2] = new Triangulo(a, b, c);
            }
            return instance[2];
        }else {
            return null;
        }
    }
    private static boolean isTriangle(double a, double b, double c) {
        return (a < b + c) && (b < a + c) && (c < a + b);
    }

    private static boolean isEquilateral(double a, double b, double c) {
        return a == b && b == c;
    }
    private static boolean isRectangle(double a, double b, double c) {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }

    private static boolean isIsosceles(double a, double b, double c) {
        return a == b || a == c || b == c;
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
