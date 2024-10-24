package friptuleacdiana.u5w1d4pizze.repositories;

import friptuleacdiana.u5w1d4pizze.entities.Toppings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToppingsRepository extends JpaRepository<Toppings, Long> {
    // i toppings con un prezzo maggiore di un certo valore
    List<Toppings> findByPrezzoGreaterThan(double prezzo);
}
