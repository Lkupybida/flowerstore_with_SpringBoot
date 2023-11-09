package ua.edu.ucu.apps.flowerstore.spring;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.edu.ucu.apps.flowerstore.spring.flower.Flower;

public interface FlowerRepository extends JpaRepository<Flower, Integer> {

}
