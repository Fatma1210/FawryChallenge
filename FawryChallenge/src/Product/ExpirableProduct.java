package Product;
import java.time.LocalDate;
public abstract class ExpirableProduct extends ShippableProduct {
    protected LocalDate expireDate ;
    protected LocalDate ManufactureDate = LocalDate.now();

    public void setManufactureDate(LocalDate ManufactureDate) {
        this.ManufactureDate = ManufactureDate;
    }
    public LocalDate getExpireDate() {
        return expireDate;
    }
    public LocalDate getManufactureDate() {
        return this.ManufactureDate;
    }
}
