package ua.edu.ucu.apps.flowerstore.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import ua.edu.ucu.apps.flowerstore.spring.flower.Flower;

import java.util.List;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {
    private FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping("/list")
    public List<Flower> getFlowers() {
        return flowerService.getFlowers();
    }
    @PostMapping("/add")
    public void addFlower(@RequestBody Flower flower) {
        flowerService.add(flower);
    }
}
