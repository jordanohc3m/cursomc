package br.com.jordano.services;

import br.com.jordano.domain.Cliente;
import br.com.jordano.repositories.ClienteRepository;
import br.com.jordano.services.br.com.jordano.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * Created by jordano on 21/01/2018.
 */
@Service
public class ClienteService {

    @Autowired
    private ClienteRepository categoriaRepository;

    public Cliente find(Integer id) {
        Cliente cliente = categoriaRepository.findOne(id);
        if (Objects.isNull(cliente)) {
            throw new ObjectNotFoundException("Objeto não encontrado, id: " + id + ", tipo: " + Cliente.class.getName());
        }
        return cliente;
    }


}
