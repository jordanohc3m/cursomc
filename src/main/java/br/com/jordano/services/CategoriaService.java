package br.com.jordano.services;

import br.com.jordano.domain.Categoria;
import br.com.jordano.repositories.CategoriaRepository;
import br.com.jordano.services.br.com.jordano.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * Created by jordano on 20/01/2018.
 */
@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria find(Integer id) {
        Categoria categoria = categoriaRepository.findOne(id);
        if (Objects.isNull(categoria)) {
            throw new ObjectNotFoundException("Objeto não encontrado, id: " + id + ", tipo: " + Categoria.class.getName());
        }
        return categoria;
    }


}
