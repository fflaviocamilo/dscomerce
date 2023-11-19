package com.devsuperior.dscomerce.entities;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order_item")
public class OrderItem {

    @EmbeddedId
    private  OrderItemPK id = new OrderItemPK();

    private Integer quantity;
    private Double preco;

    public OrderItem(){

    }

    public OrderItem(Order order, Product product, Integer quantity, Double preco) {
        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantity;
        this.preco = preco;
    }

    public Order getOrder() {
        return id.getOrder();
    }

    public void setOrder(Order order) {
        id.setOrder(order);
    }

    public Product getProduct() {
        return id.getProduct();
    }

    public void setProduct(Product product) {
        id.setProduct(product);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
