import java.rmi.Naming;
import java.util.List;

public class GunShopClient {
    public static void main(String[] args) {
        try {
            GunShop shop = (GunShop) Naming.lookup("//localhost/GunShop");
            List<Gun> guns = shop.getAvailableGuns();
            for (int i = 0; i < guns.size(); i++) {
                System.out.println(i + ". " + guns.get(i).getName() + " - $" + guns.get(i).getPrice());
            }

            shop.addToCart(0);
            shop.addToCart(1);

            List<Gun> cart = shop.viewCart();
            System.out.println("\nItems in Cart:");
            for (int i = 0; i < cart.size(); i++) {
                System.out.println(i + ". " + cart.get(i).getName() + " - $" + cart.get(i).getPrice());
            }
        } catch (Exception e) {
            System.err.println("Exception in GunShopClient: " + e.toString());
            e.printStackTrace();
        }
    }
}
