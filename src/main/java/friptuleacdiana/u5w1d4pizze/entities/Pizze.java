package friptuleacdiana.u5w1d4pizze.entities;

import java.util.List;

public class Pizze extends GenericClass {
    private List<String> toppings;
    private String formatoPizza;
    private String pomodoro;
    private String mozzarella;

    public Pizze(String nome, double prezzo, int calorie, List<String> toppings, String formatoPizza) {
        super(nome, prezzo, calorie);
        this.toppings = toppings;
        this.formatoPizza = formatoPizza;
        this.pomodoro = "Pomodoro";
        this.mozzarella = "Mozzarella";
    }

    @Override
    public String toString() {
        return "Nome: '" + nome + '\'' +
                ", Prezzo: " + prezzo + "€ , Calorie: " + calorie +
                ", Condimenti: '" + pomodoro + '\'' + ", '" + mozzarella + '\'' +
                ", Condimento aggiunto: " + (toppings.isEmpty() ? "nessuno" : String.join(", ", toppings)) +
                ", Formato pizza: " + formatoPizza;
    }
}

