package friptuleacdiana.u5w1d4pizze.runners;

import friptuleacdiana.u5w1d4pizze.entities.Bevande;
import friptuleacdiana.u5w1d4pizze.entities.Pizze;
import friptuleacdiana.u5w1d4pizze.entities.Toppings;
import friptuleacdiana.u5w1d4pizze.repositories.BevandeRepository;
import friptuleacdiana.u5w1d4pizze.repositories.PizzeRepository;
import friptuleacdiana.u5w1d4pizze.repositories.ToppingsRepository;
import friptuleacdiana.u5w1d4pizze.services.ElementsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component //i runner devono essere component
@Slf4j
public class ElemetsRunners implements CommandLineRunner {

    private final ElementsService elementsService;


    @Autowired
    private BevandeRepository bevandeRepository;

    @Autowired
    private PizzeRepository pizzeRepository;

    @Autowired
    private ToppingsRepository toppingsRepository;

    @Autowired
    private ApplicationContext context;

    public ElemetsRunners(ElementsService elementsService) {
        this.elementsService = elementsService;
    }

    @Override
    public void run(String... args) throws Exception {

        //recupero i Bean e salvo elementi den db
        Toppings toppingBuffala = (Toppings) context.getBean("toppingBuffala");
        Toppings toppingSalamePiccante = (Toppings) context.getBean("toppingSalamePiccante");
        Toppings toppingFunghi = (Toppings) context.getBean("toppingFunghi");
        Toppings toppingRucola = (Toppings) context.getBean("toppingRucola");
        //elementsService.saveToppings(List.of(toppingBuffala, toppingSalamePiccante, toppingFunghi, toppingRucola));

        Pizze pizzaMargherita = (Pizze) context.getBean("pizzaMargherita");
        Pizze pizzaSalamePiccante = (Pizze) context.getBean("pizzaSalamePiccante");
        Pizze pizzaBuffala = (Pizze) context.getBean("pizzaBuffala");
        // elementsService.savePizze(List.of(pizzaMargherita, pizzaSalamePiccante, pizzaBuffala));


        Bevande cocaCola = (Bevande) context.getBean("bevandaCocaCola");
        Bevande birra = (Bevande) context.getBean("bevandaBirra");
        Bevande acqua = (Bevande) context.getBean("bevandaAcqua");

        // elementsService.saveBevande(List.of(cocaCola, birra, acqua));
        //log.info("Gli elementi sono stati salvati correttamente nel db!");


        List<Pizze> pizzeXL = elementsService.getAllPizzeByFormato("XL");
        log.info("Pizze XL trovate: {}", pizzeXL);


        List<Toppings> toppingsCostosi = elementsService.getToppingsByPrezzo(1.00);
        log.info("Toppings con prezzo maggiore di 1.00:{} ", toppingsCostosi);

        List<Bevande> bevandeTrovate = elementsService.getBevandeByQuantita(0.33);
        log.info("Bevande con quantità di 0.33 litri:{} ", bevandeTrovate);
    }

}
