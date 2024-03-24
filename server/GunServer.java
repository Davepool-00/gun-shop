import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class GunServer {
    public static void main(String[] args) {
        try {
            GunShop shop = new GunShopImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("GunShop", shop);
            System.out.println("GunShop server is ready.");
        } catch (Exception e) {
            System.err.println("Exception in GunShop server: " + e.toString());
            e.printStackTrace();
        }
    }
}
