package friptuleacdiana.u5w1d4pizze.entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@MappedSuperclass //non mi prea la tabella nel DB xke e una superclasse (non viene mappata come una tabella)
@NoArgsConstructor
public abstract class GenericClass {
    @Column(name = "nome")
    protected String nome;
    @Column(name = "prezzo")
    protected double prezzo;
    @Column(name = "calorie")
    protected int calorie;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public GenericClass(String nome, double prezzo, int calorie) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.calorie = calorie;
    }


}