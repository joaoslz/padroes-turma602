package roteiro03;

import java.time.LocalDate;

public class TestaDividia {

    public static void main(String[] args) {

        Divida divida = new Divida();

        divida.setCnpjCredor(new CNPJ("4324234324") );
        divida.setTotal(10000);
        divida.setCredor("Empresa XYZ");

        Pagamento pagamento = new Pagamento();
        pagamento.setData(LocalDate.now() );
        pagamento.setValor(500);

        divida.registra(pagamento );


    }
}
