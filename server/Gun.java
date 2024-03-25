import java.io.Serializable;

public class Gun implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private double price;
    private String description;

    public Gun(String name, double price, String description) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
