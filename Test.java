public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat(false, "dry cat food", 4, "blue");

        System.out.println("Cat is Vegetarian?" + cat.isVegetarian());
        System.out.println("Cat eats " + cat.getEats());
        System.out.println("Cat has " + cat.getNoOfLegs() + " legs.");
        System.out.println("Cat color is " + cat.getColor());

        Cat cat1 = new Cat("white");
        System.out.println("Cat is Vegetarian?" + cat1.isVegetarian());
        System.out.println("Cat eats " + cat1.getEats());
        System.out.println("Cat has " + cat1.getNoOfLegs() + " legs.");
        System.out.println("Cat color is " + cat1.getColor());

    }


    }

