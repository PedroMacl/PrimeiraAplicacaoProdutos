package br.com.maciel.PrimeiraAplicacao.Model;
import jakarta.persistence.*;


@Entity // Informa ao Spring que essa classe armazena um BD
@Table(name="produtos_info")
public class Produto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private double preco;
    private String codigo_barras;

    public Produto (){} // Construtor vazio que ajuda na criação de objetos automaticamente

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCodigo_barras() {
        return codigo_barras;
    }

    public void setCodigo_barras(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }
}
