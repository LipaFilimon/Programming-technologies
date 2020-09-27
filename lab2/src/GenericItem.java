import javax.lang.model.element.Name;
import java.util.Objects;

public class GenericItem {
    public int ID;
    public String name;
    public float price;
    public Category category = Category.GENERAL;
    public GenericItem analog = this;

    void printAll(){
        System.out.printf("ID: %d, Name: %s, price: %5.2f, Category: %s \n",
                           ID, name, price, category);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        GenericItem that = (GenericItem) obj;
        return ID == that.ID &&
                Float.compare(that.price, price) == 0 &&
                Objects.equals(name, that.name) &&
                category == that.category;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        GenericItem clone = new GenericItem();
        clone.ID = this.ID;
        clone.name = this.name;
        clone.price = this.price;
        return clone;
    }

    @Override
    public String toString() {
        return "ID: " + ID + ", Name: " + name + ", price: " + price +
                ", Category: " + category + "\n";
    }
}

