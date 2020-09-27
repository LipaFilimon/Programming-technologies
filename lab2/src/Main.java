import java.util.Date;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println("\t\tTask 1");

        GenericItem bmw = new GenericItem();
        bmw.ID = 1;
        bmw.name = "BMW";
        bmw.price = 2000000;

        GenericItem mercedes = new GenericItem();
        mercedes.ID = 2;
        mercedes.name = "Mercedes-Benz";
        mercedes.price = 2554999;

        GenericItem opel = new GenericItem();
        opel.ID = 3;
        opel.name = "Opel";
        opel.price = 1200000;

        bmw.printAll();
        mercedes.printAll();
        opel.printAll();

        System.out.println("\t\tTask 2");

        FoodItem shaverma = new FoodItem();
        shaverma.ID = 4;
        shaverma.name = "Shaverma";
        shaverma.price = 165;
        shaverma.category = Category.FOOD;
        shaverma.dateOfIncome = new Date();
        shaverma.expires = 1;

        TechnicalItem mobile = new TechnicalItem();
        mobile.ID = 5;
        mobile.name = "Samsung";
        mobile.price = 50000;
        mobile.warrantyTime = 24;

        GenericItem items[] = {shaverma, mobile};
        for(GenericItem genericItem : items){
            genericItem.printAll();
        }

        System.out.println("\t\tTask 2-2");

        FoodItem burger = new FoodItem();
        burger.ID = 5;
        burger.name = "burger";
        burger.price = 300;
        burger.category = Category.FOOD;
        burger.dateOfIncome = new Date();
        burger.expires = 1;

        FoodItem salat = new FoodItem();
        salat.ID = 6;
        salat.name = "salat";
        salat.price = 150;
        salat.category = Category.FOOD;
        salat.dateOfIncome = new Date();
        salat.expires = 1;

        System.out.println(burger.equals(salat));

        FoodItem anotherBurger = (FoodItem) burger.clone();
        burger.printAll();
        anotherBurger.printAll();
        System.out.println(burger.equals(anotherBurger) + "\n");

       try {
            Object mercedesClone = mercedes.clone();
            System.out.printf("%b\n", mercedes.equals(mercedesClone));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
