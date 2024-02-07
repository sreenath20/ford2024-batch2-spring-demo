package components.sub;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("discount")
public class Discount {
    @Value("Festival")
    private String name;
    @Value("5.0")
    private Double percentage;

    @Override
    public String toString() {
        return "Discount{" +
                "name='" + name + '\'' +
                ", percentage=" + percentage +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public Discount(String name, Double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public Discount() {
    }
}
