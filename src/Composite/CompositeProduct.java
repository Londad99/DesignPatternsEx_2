package Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeProduct extends AbstractProduct{
    private List<AbstractProduct> products = new ArrayList<>();

    public CompositeProduct(String name) {
        super(name, 0);
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (AbstractProduct product : products) {
            price += product.getPrice();
        }
        return price;
    }

    @Override
    public void setPrice(double price) {
    }

    public void addProduct(AbstractProduct product) {
        products.add(product);
    }

    public void removeProduct(AbstractProduct product) {
        products.remove(product);
    }
}
