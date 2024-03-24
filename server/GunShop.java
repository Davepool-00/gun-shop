import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface GunShop extends Remote {
    List<Gun> getAvailableGuns() throws RemoteException;
    void addToCart(int gunIndex) throws RemoteException;
    List<Gun> viewCart() throws RemoteException;
}
