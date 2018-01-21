package br.com.jordano;

import br.com.jordano.domain.*;
import br.com.jordano.domain.br.com.jordano.domain.enums.TipoCliente;
import br.com.jordano.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private CidadeRepository cidadeRepository;

    @Autowired
    private EstadoRepository estadoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    public static void main(String[] args) {
        SpringApplication.run(CursomcApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

        Categoria categoria1 = new Categoria(null, "Informática");
        Categoria categoria2 = new Categoria(null, "Escritório");

        Produto produto1 = new Produto(null, "Computador", 2000.00);
        Produto produto2 = new Produto(null, "Impressora", 800.00);
        Produto produto3 = new Produto(null, "Mouse", 80.00);

        categoria1.getProdutos().addAll(Arrays.asList(produto1, produto2, produto3));
        categoria2.getProdutos().addAll(Arrays.asList(produto2));

        produto1.getCategorias().addAll(Arrays.asList(categoria1));
        produto2.getCategorias().addAll(Arrays.asList(categoria1, categoria2));
        produto3.getCategorias().addAll(Arrays.asList(categoria1));

        categoriaRepository.save(Arrays.asList(categoria1, categoria2));
        produtoRepository.save(Arrays.asList(produto1, produto2, produto3));

        Estado estado1 = new Estado("Minas Gerais");
        Estado estado2 = new Estado("São Paulo");

        Cidade cidade1 = new Cidade("Uberlândia", estado1);
        Cidade cidade2 = new Cidade("São Paulo", estado2);
        Cidade cidade3 = new Cidade("Campinas", estado2);

        estado1.getCidades().addAll(Arrays.asList(cidade1));
        estado2.getCidades().addAll(Arrays.asList(cidade2, cidade3));

        estadoRepository.save(Arrays.asList(estado1, estado2));
        cidadeRepository.save(Arrays.asList(cidade1, cidade2, cidade3));


        Cliente cliente = new Cliente("Maria Silva", "mariasilva@email.com", "32329909", TipoCliente.PESSOAFISICA);

        cliente.getTelefones().addAll(Arrays.asList("32362825", "32026301"));

        Endereco endereco = new Endereco("Rua das Flores", "300", "Apto 303", "Jardim", "38220834", cliente, cidade1);
        Endereco endereco2 = new Endereco("Avenida Matos", "105", "Sala 800", "Centro", "38777012", cliente, cidade2);

        cliente.getEnderecos().addAll(Arrays.asList(endereco, endereco2));

        clienteRepository.save(Arrays.asList(cliente));

        enderecoRepository.save(Arrays.asList(endereco, endereco2));


    }
}
