package roteiro03;

public class Divida {
    private double total;
    private String credor;
    private CNPJ cnpjCredor;

    private HistoricoPagamentos pagamentos = new HistoricoPagamentos();


    public HistoricoPagamentos getPagamentos() {
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
