package com.company.Creational.Builder;

public class Burger {
    private final String bread;
    private final String condiments;
    private final String veggies;
    private final String fillings;

    public Burger(BurgerBuilder burgerBuilder){
        this.bread = burgerBuilder.bread;
        this.condiments = burgerBuilder.condiments;
        this.veggies = burgerBuilder.veggies;
        this.fillings = burgerBuilder.fillings;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getVeggies() {
        return veggies;
    }

    public String getFillings() {
        return fillings;
    }

    public static class BurgerBuilder{
        private String bread;
        private String condiments;
        private String veggies;
        private String fillings;

        public BurgerBuilder(String bread){
            this.bread = bread;
        }

        public BurgerBuilder setCondiments(String condiments){
            this.condiments = condiments;
            return this;
        }

        public BurgerBuilder setVeggies(String veggies) {
            this.veggies = veggies;
            return this;
        }

        public BurgerBuilder setFillings(String fillings) {
            this.fillings = fillings;
            return this;
        }

        public Burger build(){
            Burger burger = new Burger(this);
            return burger;
        }
    }
}
