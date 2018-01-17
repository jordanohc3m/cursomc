package br.com.jordano.domain;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jordano on 17/01/2018.
 */
@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @GetMapping
    public String listar(){
        return "OK";
    }
}
