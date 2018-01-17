package br.com.jordano.resource;

import br.com.jordano.domain.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jordano on 17/01/2018.
 */
@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @GetMapping
    public List<Categoria> listar(){

        Categoria categoria = new Categoria(1, "Informática");
        Categoria categoria1 = new Categoria(1, "Escritório");

        List<Categoria> categorias = new ArrayList<>();
        categorias.add(categoria);
        categorias.add(categoria1);
        return categorias;
    }
}
