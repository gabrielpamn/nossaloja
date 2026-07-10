package com.nossaloja.service;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {

    private static final String CART_KEY = "cart";

    @SuppressWarnings("unchecked")
    public List<Long> getCart(HttpSession session) {

        List<Long> cart =
                (List<Long>) session.getAttribute(CART_KEY);

        if (cart == null) {
            cart = new ArrayList<>();
            session.setAttribute(CART_KEY, cart);
        }

        return cart;
    }

    public void addProduct(Long productId, HttpSession session) {
        List<Long> cart = getCart(session);
        cart.add(productId);
        session.setAttribute(CART_KEY, cart);
    }

    public void clear(HttpSession session) {
        session.removeAttribute(CART_KEY);
    }
}
