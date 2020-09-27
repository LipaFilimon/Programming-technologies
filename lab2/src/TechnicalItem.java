import java.util.Objects;

public class TechnicalItem extends GenericItem {
    public short warrantyTime; //гарантийный срок

    @Override
    void printAll() {
        super.printAll();
        System.out.printf("warranty time: %d \n", warrantyTime);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TechnicalItem that = (TechnicalItem) o;
        return warrantyTime == that.warrantyTime;
    }

    @Override
    public Object clone(){
        TechnicalItem clone = new TechnicalItem();
        clone.ID = this.ID;
        clone.name = this.name;
        clone.price = this.price;
        clone.category = this.category;
        clone.warrantyTime = this.warrantyTime;
        return clone;
    }

    @Override
    public String toString() {
        return (super.toString() + "warranty time: " + warrantyTime + "\n");
    }
}
