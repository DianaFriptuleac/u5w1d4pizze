package friptuleacdiana.u5w1d4pizze.repositories;

import friptuleacdiana.u5w1d4pizze.entities.Toppings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToppingsRepository extends JpaRepository<Toppings, Long> {
}
