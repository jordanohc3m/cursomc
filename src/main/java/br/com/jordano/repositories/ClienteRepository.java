package br.com.jordano.repositories;


import br.com.jordano.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jordano on 21/01/2018.
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {


}
