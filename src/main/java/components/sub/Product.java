package components.sub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component(value = "product")
public class Product {

    @Value("Iphone")
    private String name;
    @Value("55000.0")
    private Double price;

    @Autowired // field injection
    private Discount discount; // product has dependency on discount bean

    public Discount getDiscount() {
        return discount;
    }

    //@Autowired // setter injection
    public void setDiscount(Discount discount) {
        System.out.println("Setter DI discount");
        this.discount = discount;
    }

    //@Autowired
    public Product(Discount discount) {
        System.out.println("Consructor DI discount");
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "components.sub.Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", discount=" + discount +

                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product(@Value("demo") String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {

    }
}
