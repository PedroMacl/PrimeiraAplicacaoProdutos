package br.com.maciel.PrimeiraAplicacao.Repository;
import br.com.maciel.PrimeiraAplicacao.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RepositoryProduto extends JpaRepository<Produto,Long> {


}
