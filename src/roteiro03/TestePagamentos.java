package roteiro03;

import java.time.LocalDate;

public class TestePagamentos {

    public static void main(String[] args) {
        HistoricoPagamentos historicoPagamentos = new HistoricoPagamentos();

        Pagamento pagamento1 = new Pagamento();
        pagamento1.setData(LocalDate.now() );
        pagamento1.setValor(500);

        Pagamento pagamento2 = new Pagamento();
        pagamento2.setData(LocalDate.now() );
        pagamento2.setValor(500);

        historicoPagamentos.registra(pagamento1 );
        historicoPagamentos.registra(pagamento2 );

        //historicoPagamentos.getPagamentos().clear();
        //historicoPagamentos.getPagamentos().remove(pagamento1 );

        for(Pagamento p: historicoPagamentos.getPagamentos() ) {
            System.out.println(p.getData() + "::" + p.getValor() );
        }




    }}
