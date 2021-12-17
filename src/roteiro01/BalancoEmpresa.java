package roteiro01;

import java.util.ArrayList;
import java.util.HashMap;

public class BalancoEmpresa {
  private HashMap<String, Divida> dividas = new HashMap<String,
                                                        Divida>();

  public void registraDivida(String credor, String cnpjCredor, double valor) {
    Divida divida = new Divida();
    divida.setTotal(valor);
    divida.setCredor(credor);
    divida.setCnpjCredor(cnpjCredor);
    dividas.put(cnpjCredor, divida);
  }

  public void efetuaPagamento(String cnpjCredor, Pagamento pagamento ) {
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

