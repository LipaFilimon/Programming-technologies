import java.util.Date;
import java.util.Objects;

public class FoodItem extends GenericItem {
    public Date dateOfIncome;
    public short expires; // срок годности

    @Override
    void printAll() {
        super.printAll();
        System.out.printf("Date Of income:%s, Expires: %-10d \n", dateOfIncome, expires);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        FoodItem foodItem = (FoodItem) obj;
        return expires == foodItem.expires &&
                Objects.equals(dateOfIncome, foodItem.dateOfIncome);
    }

    @Override
    public Object clone() {
        FoodItem clone = new FoodItem();
        clone.ID = this.ID;
        clone.name = this.name;
        clone.price = this.price;
        clone.category = this.category;
        clone.dateOfIncome = this.dateOfIncome;
        clone.expires = this.expires;
        return clone;
    }

    @Override
    public String toString() {
        return (super.toString() + "Date Of income: " + dateOfIncome +
                ", Expires: " + expires + "\n");
    }
}
