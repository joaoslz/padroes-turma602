package roteiro02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Divida {
    private double total;
    private String credor;
    private CNPJ cnpjCredor;

    private Pagamentos pagamentos = new Pagamentos();


    public Pagamentos getPagamentos() {
        return pagamentos;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getValorAPagar() {
        return this.total - this.pagamentos.getValorPago();
    }

    public String getCredor() {
        return this.credor;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }

    public CNPJ getCnpjCredor() {
        return cnpjCredor;
    }

    public void setCnpjCredor(CNPJ cnpjCredor) {
        this.cnpjCredor = cnpjCredor;
    }

    // método de delegação
    public void registra(Pagamento pagamento) {
        pagamentos.registra(pagamento);
    }

}
