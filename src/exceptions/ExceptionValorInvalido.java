package exceptions;

public class ExceptionValorInvalido extends Exception {
    public ExceptionValorInvalido() {
        super("Valor invalido", new Throwable("valor < 0 ou valor = 0"));
    }
}