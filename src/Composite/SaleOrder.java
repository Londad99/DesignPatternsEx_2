package Composite;

import java.util.ArrayList;
import java.util.List;

public class SaleOrder {
    private String orderNumber;
    private double total;
    private String customer;
    private String date;
    private List<AbstractProduct> products = new ArrayList<>();

    public SaleOrder(String orderNumber, String customer, String date) {
        super();
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.date = date;
    }

    public void addProduct(AbstractProduct product) {
        products.add(product);
    }

    public void removeProduct(AbstractProduct product) {
        products.remove(product);
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<AbstractProduct> getProducts() {
        return products;
    }

    public void setProducts(List<AbstractProduct> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "SaleOrder{" + "orderNumber=" + orderNumber + ", total=" + total + ", customer=" + customer + ", date=" + date + ", products=" + products + '}';
    }
}
