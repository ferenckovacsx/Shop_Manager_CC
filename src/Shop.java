import java.util.Vector;

/**
 * Created by Kovacs Ferenc on 2016-09-06.
 */
public class Shop {

    private String name;
    private String address;
    private String owner;
    private Milk dairySection;
    private int flag;

    public Shop(String name, String address, String owner, Vector dairySection) {
        this.name = name;
        this.address = address;
        this.owner = owner;

    }

    public Shop(String name, String address, String owner) {
        this.name = name;
        this.address = address;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getOwner() {
        return owner;
    }

    public boolean isMilkAvailable() {
        return true;
    }

    public Milk buyMilk(Milk m) {
        return dairySection;
    }

    public void fillWithMilk(Milk m) {

    }
}
