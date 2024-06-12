package practicesession;


import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String size;
    private String crust;
    private List<String> toppings;

    public static class Builder {
        private String size;
        private String crust;
        private List<String> toppings = new ArrayList<>();

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Builder crust(String crust) {
            this.crust = crust;
            return this;
        }

        public Builder addTopping(String topping) {
            this.toppings.add(topping);
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    private Pizza(Builder builder) {
        this.size = builder.size;
        this.crust = builder.crust;
        this.toppings = builder.toppings;
    }

    public static void main(String[] args) {
        Pizza pizza = new Builder().size("Large").crust("Thin White").addTopping("Pepperoni").addTopping("Puff").build();
        System.out.println(pizza.size);
        System.out.println(pizza.crust);
        System.out.println(pizza.toppings);
    }
    // Getters and other methods
}

