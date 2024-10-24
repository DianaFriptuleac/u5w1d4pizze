package friptuleacdiana.u5w1d4pizze.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "pizze")
@Getter
@Setter
@NoArgsConstructor
public class Pizze extends GenericClass {
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Toppings> toppings;
    @Column(name = "formato_pizza")
    private String formatoPizza;

    @Column(name = "pomodoro")
    private String pomodoro;

    @Column(name = "mozzarella")
    private String mozzarella;

    public Pizze(String nome, double prezzo, int calorie, List<Toppings> toppings, String formatoPizza) {
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
                ", Condimento aggiunto: " + (toppings.isEmpty() ? "nessuno" : toppings) +
                ", Formato pizza: " + formatoPizza;
    }
}

