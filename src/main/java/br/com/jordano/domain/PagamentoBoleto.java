package br.com.jordano.domain;

import br.com.jordano.domain.br.com.jordano.domain.enums.EstadoPagamento;

import java.util.Date;

/**
 * Created by jordano on 22/01/2018.
 */
public class PagamentoBoleto extends Pagamento {

    private Date dataVencimento;
    private Date dataPagamento;

    public PagamentoBoleto() {

    }

    public PagamentoBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
        super(id, estado, pedido);
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
