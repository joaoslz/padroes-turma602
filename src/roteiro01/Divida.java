package roteiro01;

import java.util.ArrayList;
import java.util.List;

public class Divida {
  private double total;
  private double valorPago;
  private String credor;
  private String cnpjCredor;

  List<Pagamento> pagamentos = new ArrayList<>();

  public List<Pagamento> getPagamentos() {
    return pagamentos;
  }

  public double getTotal() {
    return this.total;
  }
  public void setTotal(double total) {
    this.total = total;
  }
  public double getValorPago() {
    return this.valorPago;
  }

  public String getCredor() {
    return this.credor;
  }
  public void setCredor(String credor) {
    this.credor = credor;
  }
  public String getCnpjCredor() {
    return this.cnpjCredor;
  }
  public void setCnpjCredor(String cnpjCredor) {
    this.cnpjCredor = cnpjCredor;
  }

  public void registra( Pagamento pagamento ) {
    this.pagamentos.add( pagamento );
    this.paga (pagamento.getValor() );
  }

  private void paga(double valor ) {
    if (valor  <= 0 ) {
      throw new IllegalArgumentException("O Valor não pode ser negativo!!");
    }
    if (valor >= 1000) {
      valor = valor - 5;
    }
    this.valorPago = this.valorPago + valor;
  }
}
