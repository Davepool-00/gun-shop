import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Gun> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Gun gun) {
        items.add(gun);
    }

    public List<Gun> getItems() {
        return items;
    }
}
