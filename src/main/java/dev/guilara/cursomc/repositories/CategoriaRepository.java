package dev.guilara.cursomc.repositories;


import dev.guilara.cursomc.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/*
@Repository -> Esse 'bean' indica que a classe é responsável por realizar operações de persistência, como:
consultas, atualizações, inserções e deleções, geralmente sobre uma entidade.
 */
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
