package model;

public class Token {
    private Integer id;
    private String codigo;
    private Integer fk_contato;


    public Token(Integer id, String codigo, Integer fk_contato) {
        this.id = id;
        this.codigo = codigo;
        this.fk_contato = fk_contato;
    }

    public Token(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getFk_contato() {
        return fk_contato;
    }

    public void setFk_contato(Integer fk_contato) {
        this.fk_contato = fk_contato;
    }
}
