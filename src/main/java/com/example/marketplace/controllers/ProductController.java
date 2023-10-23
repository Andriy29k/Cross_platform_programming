package com.example.marketplace.controllers;

import com.example.marketplace.services.ProductService;
import com.example.marketplace.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/")
    public String products(/*Model model*/) {
        //model.addAttribute("products", productService.listProducts());
        return "resources/templates/products.html";
    }

    /*@PostMapping("/product/create")
    public String createProduct(Product product) {
        productService.saveProduct(product);
        return "redirect:/";
    }*/

    /*public String productInfo(@PathVariable Long id, Model model){
        model.addAttribute("product", productService.getProductById(id));
        return "templates/product-info.html";
    }*/

    /*@PostMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
    productService.deleteProduct(id);
    return "redirect:/";
    }*/

    @GetMapping("/error")
    public String error(){
        return "error";
    }
}
