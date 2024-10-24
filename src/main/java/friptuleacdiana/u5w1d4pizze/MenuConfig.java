package friptuleacdiana.u5w1d4pizze;

import friptuleacdiana.u5w1d4pizze.entities.Bevande;
import friptuleacdiana.u5w1d4pizze.entities.Pizze;
import friptuleacdiana.u5w1d4pizze.entities.Toppings;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MenuConfig {

    // Pizze
    @Bean(name = "pizzaMargherita")
    public Pizze margherita() {
        // La Margherita non ha topping aggiuntivi, solo pomodoro e mozzarella di base
        return new Pizze("Margherita", 6.50, 1104, new ArrayList<>(), "Classica");
    }

    @Bean(name = "pizzaSalamePiccante")
    public Pizze salamePiccante(@Qualifier("toppingSalamePiccante") Toppings tSalamePiccante) {
        // Passo direttamente il bean Toppings, non il suo nome
        return new Pizze("Salame Piccante", 7.50, 1160, new ArrayList<>(List.of(tSalamePiccante)), "XL");
    }

    @Bean(name = "pizzaBuffala")
    public Pizze buffala(@Qualifier("toppingBuffala") Toppings tBuffala, @Qualifier("toppingRucola") Toppings tRucola) {
        // Passo i toppings Buffala e Rucola come oggetti Toppings
        return new Pizze("Buffala", 8.50, 1200, new ArrayList<>(List.of(tBuffala, tRucola)), "Classica");
    }

    // Toppings
    @Bean(name = "toppingBuffala")
    public Toppings tBuffala() {
        return new Toppings("Buffala", 1.50, 102);
    }

    @Bean(name = "toppingSalamePiccante")
    public Toppings tSalamePiccante() {
        return new Toppings("Salame Piccante", 1.00, 90);
    }

    @Bean(name = "toppingFunghi")
    public Toppings tFunghi() {
        return new Toppings("Funghi", 1.00, 70);
    }

    @Bean(name = "toppingRucola")
    public Toppings tRucola() {
        return new Toppings("Rucola", 0.50, 20);
    }

    // Bevande
    @Bean(name = "bevandaCocaCola")
    public Bevande cocaCola() {
        return new Bevande("Coca-Cola", 3.00, 150, 0.33);
    }

    @Bean(name = "bevandaBirra")
    public Bevande birra() {
        return new Bevande("Birra", 4.50, 120, 0.66);
    }

    @Bean(name = "bevandaAcqua")
    public Bevande acqua() {
        return new Bevande("Acqua", 1.50, 0, 0.5);
    }
}


    /*Creo il menu
    @Bean
    public Menu myMenu() {
        List<Pizze> allPizze = new ArrayList<>(List.of(margherita(), salamePiccante(), buffala()));
        List<Toppings> allToppings = new ArrayList<>(List.of(tFunghi(), tSalamePiccante(), tBuffala(), tRucola()));
        List<Bevande> allBevande = new ArrayList<>(List.of(cocaCola(), birra(), acqua()));


        return new Menu(allPizze, allToppings, allBevande);
    }
    */





