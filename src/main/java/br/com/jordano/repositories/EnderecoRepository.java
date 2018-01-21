package br.com.jordano.repositories;


import br.com.jordano.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jordano on 21/01/2018.
 */
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {


}
