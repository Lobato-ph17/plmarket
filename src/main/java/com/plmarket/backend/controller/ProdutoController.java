package com.plmarket.backend.controller;

import com.plmarket.backend.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProdutoController {

    @GetMapping("/api/produtos")
    public List<Produto> listarProdutos() {
        Produto p1 = new Produto(1L, "Teclado Mecânico Custom", "Switch Yellow, RGB e conexão Double-Shot Keycaps.", 549.90, "https://placehold.co/600x400");
        Produto p2 = new Produto(2L, "Mouse Gamer Wireless", "Sensor Pixart 3395, ultra leve com 49g e 26000 DPI.", 389.00, "https://placehold.co/600x400");
        Produto p3 = new Produto(3L, "Monitor Monitor Premium 27'", "Painel IPS, 165Hz, 1ms de resposta com fidelidade de cor excepcional.", 1299.90, "https://placehold.co/600x400");

        return Arrays.asList(p1, p2, p3);
    }
}