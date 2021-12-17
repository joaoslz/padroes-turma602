package roteiro02;

import java.time.LocalDate;
import java.util.Locale;

public class Pagamento {

    private String pagador;
    private String cnpjPagador;
    private LocalDate data;
    private double valor;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getPagador() {
        return pagador;
    }

    public void setPagador(String pagador) {
        this.pagador = pagador;
    }

    public String getCnpjPagador() {
        return cnpjPagador;
    }

    public void setCnpjPagador(String cnpjPagador) {
        this.cnpjPagador = cnpjPagador;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

