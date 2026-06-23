package com.nossaloja.controller;

import com.nossaloja.model.Product;
import com.nossaloja.service.CartService;
import com.nossaloja.service.ProductService;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    private final CartService cartService;
    private final ProductService productService;

    public CartController(
            CartService cartService,
            ProductService productService) {

        this.cartService = cartService;
        this.productService = productService;
    }

    @PostMapping("/add/{id}")
    public List<Product> addProduct(
            @PathVariable Long id,
            HttpSession session) {

        cartService.addProduct(id, session);

        return getCart(session);
    }

    @GetMapping
    public List<Product> getCart(HttpSession session) {

        List<Long> ids = cartService.getCart(session);

        return productService.findAll()
                .stream()
                .filter(product -> ids.contains(product.id()))
                .toList();
    }

    @DeleteMapping
    public String clearCart(HttpSession session) {

        cartService.clear(session);

        return "Carrinho limpo";
    }
}