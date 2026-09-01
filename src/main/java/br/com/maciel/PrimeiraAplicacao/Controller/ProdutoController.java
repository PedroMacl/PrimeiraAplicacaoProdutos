package br.com.maciel.PrimeiraAplicacao.Controller;
import br.com.maciel.PrimeiraAplicacao.Model.Produto;
import br.com.maciel.PrimeiraAplicacao.Repository.RepositoryProduto;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private RepositoryProduto repositoryProduto;

    public ProdutoController(RepositoryProduto repositoryProduto ){
        this.repositoryProduto=repositoryProduto;
    }
    @GetMapping
    public List<Produto> listarProdutos(){
        return repositoryProduto.findAll();
    }

    @GetMapping("/{id}")
     public Produto buscarProduto(@PathVariable Long id){
        return repositoryProduto.findById(id).orElse(null);
    }

    @PostMapping
    public Produto cadastrarProduto(@RequestBody Produto produto){
        return repositoryProduto.save(produto);
    }

}
