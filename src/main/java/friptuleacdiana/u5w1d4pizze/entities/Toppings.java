package friptuleacdiana.u5w1d4pizze.entities;

public class Toppings extends GenericClass {

    public Toppings(String nome, double prezzo, int calorie) {
        super(nome, prezzo, calorie);
    }

    @Override
    public String toString() {
        return nome + " - Prezzo: " + prezzo + "€ , Calorie: " + calorie;
    }
}
