package friptuleacdiana.u5w1d4pizze.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "toppings")
@Setter
@NoArgsConstructor
public class Toppings extends GenericClass {

    public Toppings(String nome, double prezzo, int calorie) {
        super(nome, prezzo, calorie);
    }


    @Override
    public String toString() {
        return nome + " - Prezzo: " + prezzo + "€ , Calorie: " + calorie;
    }
}
