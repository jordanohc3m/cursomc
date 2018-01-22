package br.com.jordano.domain;

import br.com.jordano.domain.br.com.jordano.domain.enums.EstadoPagamento;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jordano on 22/01/2018.
 */
@Entity
public class Pagamento implements Serializable {

    @Id
    private Integer id;
    private EstadoPagamento estado;

    @OneToOne
    @JoinColumn(name = "pedido_id")
    @MapsId
    private Pedido pedido;

    public Pagamento() {
    }

    public Pagamento(Integer id, EstadoPagamento estado, Pedido pedido) {
        this.id = id;
        this.estado = estado;
        this.pedido = pedido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EstadoPagamento getEstado() {
        return estado;
    }

    public void setEstado(EstadoPagamento estado) {
        this.estado = estado;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pagamento)) return false;

        Pagamento pagamento = (Pagamento) o;

        return getId() != null ? getId().equals(pagamento.getId()) : pagamento.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }
}
