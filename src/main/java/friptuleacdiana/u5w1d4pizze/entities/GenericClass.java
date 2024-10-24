package friptuleacdiana.u5w1d4pizze.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class GenericClass {
    protected String nome;
    protected double prezzo;
    protected int calorie;
}
