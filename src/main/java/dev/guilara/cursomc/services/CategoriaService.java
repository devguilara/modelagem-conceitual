package dev.guilara.cursomc.services;


import dev.guilara.cursomc.model.Categoria;
import dev.guilara.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    // Essa dependencia é automaticamente instanciada pelo Spring
    // injeção de dependencias ou inversão de controle
    private CategoriaRepository categoriaRepository;

    public Categoria search(Integer id){
        Categoria obj = categoriaRepository.findById(id).get();
        return obj;
    }
}
