package ua.edu.ucu.apps.flowerstore.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.edu.ucu.apps.flowerstore.flower.Flower;
import ua.edu.ucu.apps.flowerstore.flower.FlowerColor;
import ua.edu.ucu.apps.flowerstore.flower.FlowerType;

import java.util.List;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {
    @GetMapping("/list")
    public List<Flower> getFlowers() {
        return List.of(new Flower(45, FlowerColor.RED, 0.8, FlowerType.ROSE));
    }

    @GetMapping("/")  // Add this mapping for the root URL
    public String welcome() {
        return "Welcome to the Flower Store API!";
    }
}
