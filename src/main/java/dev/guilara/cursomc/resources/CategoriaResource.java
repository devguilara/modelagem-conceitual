package dev.guilara.cursomc.resources;


import dev.guilara.cursomc.model.Categoria;
import dev.guilara.cursomc.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//@RestController é uma especialização da anotação @Controller.
//Na verdade, é um controlador anotado com @Controller e @ResponseBody.
@RestController
@RequestMapping(value="/categorias")//mapeamento de rotas/endpoint
public class CategoriaResource {

    @Autowired
    private CategoriaService service;


    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id){

        Categoria obj = service.search(id);
        return ResponseEntity.ok().body(obj);

    }
}
