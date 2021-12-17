package roteiro02;

public class CNPJ {

    private final String valor;

    public CNPJ(String valor) {
        if (ehValido(valor ))
           this.valor = valor;
        else
            throw new IllegalArgumentException("CNPJ Inválido!!!" );
    }

    public boolean ehValido(String valor ) {
        return primeiroDigitoVerificadorDoCnpj() == primeiroDigitoCorretoParaCnpj() &&
                segundoDigitoVerificadorDoCnpj() == segundoDigitoCorretoParaCnpj();
    }

    private boolean segundoDigitoCorretoParaCnpj() {
        return true;
    }

    private boolean segundoDigitoVerificadorDoCnpj() {
        return true;
    }

    private boolean primeiroDigitoCorretoParaCnpj() {
        return true;
    }

    private boolean primeiroDigitoVerificadorDoCnpj() {
        return true;
    }

}
