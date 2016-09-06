import java.util.Date;

/**
 * Created by Kovacs Ferenc on 2016-09-06.
 */
public class Milk {

    private int volume;
    private String manufacturer;
    private Date expiryDate;
    private double fatContent;
    private long price;

    public Milk(int volume, String manufacturer, Date expiryDate, double fatContent, long price) {

    };

    public boolean isItGood() {
        return true;
    };

    public int getVolume() {
        return volume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public double getFatContent() {
        return fatContent;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "volume=" + volume +
                ", manufacturer='" + manufacturer + '\'' +
                ", expiryDate=" + expiryDate +
                ", fatContent=" + fatContent +
                ", price=" + price +
                '}';
    }
}
