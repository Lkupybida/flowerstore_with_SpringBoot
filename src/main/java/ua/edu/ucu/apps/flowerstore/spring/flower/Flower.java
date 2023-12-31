package ua.edu.ucu.apps.flowerstore.spring.flower;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@ToString
@Entity
@NoArgsConstructor
@SuppressWarnings("HiddenField")
public class Flower {
    private double sepalLength;
    @Getter
    private double price;
    private FlowerColor flowerColor;
    private FlowerType flowerType;
    @Getter
    @Id
    private Long id;

    public Flower(double sepalLength, FlowerColor flowerColor,
                  double price, FlowerType flowerType) {
        this.sepalLength = sepalLength;
        this.flowerColor = flowerColor;
        this.price = price;
        this.flowerType = flowerType;
    }

    public void setColor(FlowerColor color) {
        this.flowerColor = color;
    }

    public String getColor() {
        return flowerColor.toString();
    }

    public String getHeaders() {
        return "sepalLength" + ","
                + "color" + ","
                + "price" + ","
                + "flowerType";
    }

    public void setId(Long id) {
        this.id = id;
    }

}
