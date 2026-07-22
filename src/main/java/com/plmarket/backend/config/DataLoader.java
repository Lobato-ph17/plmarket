package com.plmarket.backend.config;

import com.plmarket.backend.model.Produto;
import com.plmarket.backend.repository.ProdutoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {

    private final ProdutoRepository produtoRepository;

    public DataLoader(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Limpa o banco e insere dados reais ao iniciar
        produtoRepository.deleteAll();

        Produto p1 = new Produto(
            null, 
            "Teclado Mecânico Custom", 
            "Switch Yellow, RGB e conexão Double-Shot Keycaps.", 
            549.90, 
            "https://images.unsplash.com/photo-1618384887929-16ec33fab9ef?q=80&w=600&auto=format&fit=crop",
            "Periféricos"
        );

        Produto p2 = new Produto(
            null, 
            "Mouse Gamer Wireless", 
            "Sensor Pixart 3395, ultra leve com 49g e 26000 DPI.", 
            389.00, 
            "https://images.unsplash.com/photo-1615663245857-ac93bb7c39e7?q=80&w=600&auto=format&fit=crop",
            "Periféricos"
        );

        Produto p3 = new Produto(
            null, 
            "Monitor Premium 27'", 
            "Painel IPS, 165Hz, 1ms de resposta com fidelidade de cor excepcional.", 
            1299.90, 
            "https://images.unsplash.com/photo-1527443224154-c4a3942d3acf?q=80&w=600&auto=format&fit=crop",
            "Monitores"
        );

        produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
        System.out.println(">>> Banco de Dados H2 populado com sucesso! <<<");
    }
}