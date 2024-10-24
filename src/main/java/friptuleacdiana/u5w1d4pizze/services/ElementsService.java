package friptuleacdiana.u5w1d4pizze.services;


import friptuleacdiana.u5w1d4pizze.entities.Pizze;
import friptuleacdiana.u5w1d4pizze.repositories.PizzeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ElementsService {
    @Autowired
    public PizzeRepository pizzeRepository;

    public List<Pizze> getAllPizzeByFormato(String formatoPizza) {
        log.info("Pizze per il fomato cercato: ", formatoPizza);
        return pizzeRepository.findByFormatoPizza(formatoPizza);
    }

}
