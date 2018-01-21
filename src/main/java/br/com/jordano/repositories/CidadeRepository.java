package br.com.jordano.repositories;


import br.com.jordano.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jordano on 20/01/2018.
 */
@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {


}
