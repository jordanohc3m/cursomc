package br.com.jordano.domain.br.com.jordano.domain.enums;

/**
 * Created by jordano on 21/01/2018.
 */
public enum EstadoPagamento {

    PENDENTE(1, "Pendente"),
    QUITADO(2, "Quitado"),
    CANCELADO(3, "Cancelado");

    private int codigo;
    private String descricao;

    EstadoPagamento(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static EstadoPagamento toEnum(Integer id) {
        if (id == null) {
            return null;
        }

        for (EstadoPagamento t : EstadoPagamento.values()) {
            if (id.equals(t.getCodigo())) {
                return t;
            }
        }
        throw new IllegalArgumentException("Id inválido: " + id);
    }

}
