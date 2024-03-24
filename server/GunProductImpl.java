import java.rmi.RemoteException; //!! to use the RemoteException

public class GunProductImpl implements GunProduct {
    // !! Attribute of Products

    public String name;
    public String desc;
    public double price;

    public GunProductImpl(String Newname, String Newdesc, double Newprice) throws RemoteException {
        this.name = Newname;
        this.desc = Newdesc;
        this.price = Newprice;
    }

    public String Getname() throws RemoteException {
        return this.name;
    }

    public String Getdesc() throws RemoteException {
        return this.desc;
    }

    public double Getprice() throws RemoteException {
        return this.price;
    }

}