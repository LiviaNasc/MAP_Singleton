package formas_geometricas;


import exceptions.ExceptionValorInvalido;

public class Circulo implements FiguraGeometrica {

    private static Circulo instanceUnica = null;
    private double raio;

    private Circulo(double raio) throws ExceptionValorInvalido {
        if (raio <= 0) throw new ExceptionValorInvalido();
        this.raio = raio;
    }

    public static Circulo getInstance(double raio) throws ExceptionValorInvalido {
        if (instanceUnica == null) {
            instanceUnica = new Circulo(raio);
        }
        return instanceUnica;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        return "O círculo criado tem raio de tamanho: " + raio;
    }
}
