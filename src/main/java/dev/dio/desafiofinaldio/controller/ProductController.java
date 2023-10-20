package dev.dio.desafiofinaldio.controller;

import dev.dio.desafiofinaldio.entities.FoodType;
import dev.dio.desafiofinaldio.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @GetMapping
    public List<Product> getProductList() {
        Product p1 = new Product(1234567891L,"Hambúrguer", 20.00, 2L, "Fast Food");
        Product p2 = new Product(1234567892L,"Macarrão com queijo",15.00,3L,"Prato Principal");
        Product p3 = new Product(1234567893L, "Sorvete", 10.00, 4L, "Sobremesa");
        Product p4 = new Product(1234567894L, "Café", 5.00, 5L, "Bebida");
        List<Product> list = Arrays.asList(p1,p2,p3,p4);
        return list;
    }
}


//    List<Product> productList2;
//
//    @PostMapping
//    public void addProduct(Long id, String name, Double price, Long foodID, String foodName) {
//        productList2.add(new Product(id, name, price, foodID, foodName));
