package br.com.jordano.services;

import br.com.jordano.domain.Categoria;
import br.com.jordano.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jordano on 20/01/2018.
 */
@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria find(Integer id) {
        return categoriaRepository.findOne(id);
    }


}
