package friptuleacdiana.u5w1d4pizze.repositories;

import friptuleacdiana.u5w1d4pizze.entities.Bevande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BevandeRepository extends JpaRepository<Bevande, Long> {


}
