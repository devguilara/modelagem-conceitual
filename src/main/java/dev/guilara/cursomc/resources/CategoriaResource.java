package dev.guilara.cursomc.resources;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RestController é uma especialização da anotação @Controller.
//Na verdade, é um controlador anotado com @Controller e @ResponseBody.
@RestController
@RequestMapping("/categorias")//mapeamento de rotas/endpoint
public class CategoriaResource {


    @RequestMapping(method = RequestMethod.GET)
    public String listar(){
        return "Rest esta funcionando";
    }


}
