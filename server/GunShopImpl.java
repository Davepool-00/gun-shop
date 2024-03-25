import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class GunShopImpl extends UnicastRemoteObject implements GunShop {
    private List<Gun> guns;
    private List<Gun> cart;

    protected GunShopImpl() throws RemoteException {
        super();
        guns = new ArrayList<>();
        guns.add(new Gun("AK-47", 1200, "gun 1"));
        guns.add(new Gun("M16", 1500, "gun 2"));
        cart = new ArrayList<>();
    }

    public List<Gun> getAvailableGuns() throws RemoteException {
        return guns;
    }

    public void addToCart(int gunIndex) throws RemoteException {
        if (gunIndex >= 0 && gunIndex < guns.size()) {
            cart.add(guns.get(gunIndex));
        }
    }

    public List<Gun> viewCart() throws RemoteException {
        return cart;
    }
}
