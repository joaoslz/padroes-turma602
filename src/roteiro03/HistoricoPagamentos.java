package roteiro03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HistoricoPagamentos {

    private double valorPago;
    private List<Pagamento> pagamentos = new ArrayList<>();

    public double getValorPago() {
        return valorPago;
    }

    public Iterable<Pagamento> getPagamentos() {
        return this.pagamentos;
    }


    public void registra(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
        this.paga(pagamento.getValor());
    }

    private void paga(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O Valor não pode ser negativo!!");
        }
        if (valor >= 1000) {
            valor = valor - 5;
        }
        this.valorPago = this.valorPago + valor;
    }

    public List<Pagamento> pagamentosAntesDe(LocalDate data) {

        List<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();

        for (Pagamento pagamento : pagamentos) {
            if (pagamento.getData().isBefore(data) ) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;

    }

    public List<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {

        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : pagamentos ) {
            if (pagamento.getValor() > valorMinimo) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
}
