package ch.heigvd.gen2019;

import ch.heigvd.gen2019.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<Product>();
    private int id;

    public Order(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return id;
    }

    public int getProductsCount() {
        return products.size();
    }

    public Product getProduct(int j) {
        return products.get(j);
    }

    public List<Product> getProducts(){
        return this.products;
    }

    public void AddProduct(Product product) {
        products.add(product);
    }
}
