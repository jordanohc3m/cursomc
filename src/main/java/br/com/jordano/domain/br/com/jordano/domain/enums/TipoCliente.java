package br.com.jordano.domain.br.com.jordano.domain.enums;

/**
 * Created by jordano on 21/01/2018.
 */
public enum TipoCliente {

    PESSOAFISICA(1, "Pessoa Física"),
    PESSOAJURIDICA(2, "Pessoa Jurídica");

    private int codigo;
    private String descricao;

    TipoCliente(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoCliente toEnum(Integer id) {
        if (id == null) {
            return null;
        }

        for (TipoCliente t : TipoCliente.values()) {
            if (id.equals(t.getCodigo())) {
                return t;
            }
        }
        throw new IllegalArgumentException("Id inválido: " + id);
    }

}
