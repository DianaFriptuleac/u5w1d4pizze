package friptuleacdiana.u5w1d4pizze.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "bevande")
@NoArgsConstructor
public class Bevande extends GenericClass {
    @Column(name = "quantita")
    private double quantita;

    public Bevande(String nome, double prezzo, int calorie, double quantita) {
        super(nome, prezzo, calorie);
        this.quantita = quantita;
    }

    @Override
    public String toString() {
        return nome + " (" + quantita + "L) - Prezzo: " + prezzo + "€, Calorie: " + calorie;
    }
}
