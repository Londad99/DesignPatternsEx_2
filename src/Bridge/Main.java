package Bridge;

public class Main {
    public static void main(String[] args) {
        PrepareFood pizza = new PreparePizza(new Pepperoni());
        pizza.obtain();

        pizza.setImplementor(new Vegetarian());
        pizza.obtain();
    }

}
