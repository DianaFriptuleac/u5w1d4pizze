package friptuleacdiana.u5w1d4pizze.repositories;

import friptuleacdiana.u5w1d4pizze.entities.Pizze;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PizzeRepository extends JpaRepository<Pizze, Long> {
    //Derived query- cerco pizza per formato
    List<Pizze> findByFormatoPizza(String formatoPizza);

}
