package com.nossaloja.service;

import com.nossaloja.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

public List<Product> findAll() {
    return List.of(
            new Product(1L, "Camiseta World of Warcraft", "Camiseta temática da franquia Warcraft", 99.99),
            new Product(2L, "Tênis Nike Air Max", "Tênis esportivo para uso diário", 399.99),
            new Product(3L, "Tênis Adidas Ultraboost", "Tênis confortável para corrida", 449.99),
            new Product(4L, "Margarina Qualy", "Pote de margarina 500g", 8.99),
            new Product(5L, "Picles em Conserva", "Picles crocante em conserva", 12.99),
            new Product(6L, "Armário Multiuso", "Armário organizador para escritório", 299.99),
            new Product(7L, "Mesa Gamer RGB", "Mesa gamer com iluminação RGB", 799.99),
            new Product(8L, "Calça Jeans Slim", "Calça jeans masculina modelo slim", 129.99),
            new Product(9L, "Queijo Parmesão", "Queijo parmesão maturado", 34.99),
            new Product(10L, "Boneco Lich King", "Action figure do Lich King", 189.99),
            new Product(11L, "Frostmourne", "Espada lendária do Lich King", 999.99),
            new Product(12L, "Monitor Gamer 27", "Monitor Full HD para jogos", 1199.99),
            new Product(13L, "Teclado Mecânico RGB", "Teclado mecânico com iluminação RGB", 249.99),
            new Product(14L, "Mouse Gamer Pro", "Mouse de alta precisão para jogos", 149.99),
            new Product(15L, "Headset Gamer", "Headset com áudio surround", 199.99),
            new Product(16L, "Cadeira Gamer", "Cadeira ergonômica para longas sessões", 899.99),
            new Product(17L, "SSD 1TB", "Unidade SSD de alta velocidade", 499.99),
            new Product(18L, "Memória RAM 32GB", "Kit de memória DDR5", 699.99),
            new Product(19L, "Placa de Vídeo RTX", "Placa gráfica para alto desempenho", 3499.99),
            new Product(20L, "Notebook Gamer", "Notebook para jogos e produtividade", 5999.99)
    );
}
}