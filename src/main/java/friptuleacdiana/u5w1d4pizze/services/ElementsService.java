package friptuleacdiana.u5w1d4pizze.services;


import friptuleacdiana.u5w1d4pizze.entities.Bevande;
import friptuleacdiana.u5w1d4pizze.entities.Pizze;
import friptuleacdiana.u5w1d4pizze.entities.Toppings;
import friptuleacdiana.u5w1d4pizze.repositories.BevandeRepository;
import friptuleacdiana.u5w1d4pizze.repositories.PizzeRepository;
import friptuleacdiana.u5w1d4pizze.repositories.ToppingsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ElementsService {
    @Autowired
    public PizzeRepository pizzeRepository;

    @Autowired
    private ToppingsRepository toppingsRepository;

    @Autowired
    private BevandeRepository bevandeRepository;

    // Metodi save che chiamo poi nel runner
    public void saveToppings(List<Toppings> toppings) {
        toppings.forEach(topping -> {
            if (topping.getPrezzo() > 0) {
                toppingsRepository.save(topping);
                log.info("Salvato topping: {}", topping.getNome());
            } else {
                log.warn("Prezzo non valido per il topping: {}", topping.getNome());
            }
        });
    }


    public void savePizze(List<Pizze> pizze) {
        pizze.forEach(pizza -> {
            if (pizza.getPrezzo() > 2) {
                pizzeRepository.save(pizza);
                log.info("Salvata pizza: {}", pizza.getNome());
            } else {
                log.warn("Prezzo troppo basso per la pizza: {}", pizza.getNome());
            }
        });
    }

    public void saveBevande(List<Bevande> bevande) {
        bevande.forEach(bevanda -> {
            bevandeRepository.save(bevanda);
            log.info("Salvata bevanda: {}", bevanda.getNome());
        });
    }


    public List<Pizze> getAllPizzeByFormato(String formatoPizza) {
        log.info("Pizze per il fomato cercato: {}", formatoPizza);
        return pizzeRepository.findByFormatoPizza(formatoPizza);
    }

    public List<Toppings> getToppingsByPrezzo(double prezzo) {
        log.info("toppings con prezzo maggiore di: {}", prezzo);
        return toppingsRepository.findByPrezzoGreaterThan(prezzo);
    }

    public List<Bevande> getBevandeByQuantita(double quantita) {
        log.info("bevande con quantita selezionata: {}", quantita);
        return bevandeRepository.findByQuantita(quantita);
    }
}
