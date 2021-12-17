package roteiro02;

import java.util.HashMap;

public class BalancoEmpresa {
  private HashMap<CNPJ, Divida> dividas = new HashMap<>();

  public void registraDivida(String credor, String cnpjCredor, double valor) {
    Divida divida = new Divida();
    divida.setTotal(valor);
    divida.setCredor(credor);
    divida.setCnpjCredor(new CNPJ(cnpjCredor) );

    dividas.put(divida.getCnpjCredor(), divida);
  }

  public void efetuaPagamento(CNPJ cnpjCredor, Pagamento pagamento ) {
    Divida divida = dividas.get(cnpjCredor );

    if (divida != null ) {
      // divida.adiciona(pagamento );
      // divida.paga(pagamento.getValor()  );

      divida.registra(pagamento );

    } else {
      throw new IllegalArgumentException("Nao existe dívida associado a esse CNPJ" );
    }

}

}

