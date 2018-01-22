package br.com.jordano.domain;

import br.com.jordano.domain.br.com.jordano.domain.enums.EstadoPagamento;

/**
 * Created by jordano on 22/01/2018.
 */
public class PagamentoCartao extends Pagamento {

    private Integer parcela;

    public PagamentoCartao() {
    }

    public PagamentoCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer parcela) {
        super(id, estado, pedido);
        this.parcela = parcela;
    }

    public Integer getParcela() {
        return parcela;
    }

    public void setParcela(Integer parcela) {
        this.parcela = parcela;
    }
}
