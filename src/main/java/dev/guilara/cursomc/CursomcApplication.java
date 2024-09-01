package dev.guilara.cursomc;

import dev.guilara.cursomc.model.Categoria;
import dev.guilara.cursomc.model.Produto;
import dev.guilara.cursomc.repositories.CategoriaRepository;
import dev.guilara.cursomc.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.Arrays;


@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

    @Autowired
    CategoriaRepository catRepository;

    @Autowired
    ProdutoRepository prodRepository;

    public static void main(String[] args) {
        SpringApplication.run(CursomcApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {// Criação de novas categorias
        Categoria cat1 = new Categoria(null, "Financeiro");
        Categoria cat2 = new Categoria(null, "Recursos Humanos");
        Categoria cat3 = new Categoria(null, "Marketing");
        Categoria cat4 = new Categoria(null, "Logística");
        Categoria cat5 = new Categoria(null, "Jurídico");



        Produto p1 = new Produto("Computador", "Computador Dell Insprion M580", 2000.00);
        Produto p2 = new Produto("Impressora", "Impressora Epson L82", 1000.00);
        Produto p3 = new Produto("HeadSet", "HeadSet Mancer Cracter", 162.00);

//Adicionando associação de produtos
        cat1.getProdutos().addAll(Arrays.asList(p1,p2));
        cat3.getProdutos().addAll(Arrays.asList(p3));

        p1.getCategorias().addAll(Arrays.asList(cat1));
        p2.getCategorias().addAll(Arrays.asList(cat1));
        p3.getCategorias().addAll(Arrays.asList(cat3));


// Salvando todas as categorias de uma vez
        catRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5));
        prodRepository.saveAll(Arrays.asList(p1,p2,p3));
    }
}
