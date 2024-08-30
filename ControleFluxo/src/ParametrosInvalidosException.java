public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super("O segundo número deve ser maior que o primeiro");
    }
}

