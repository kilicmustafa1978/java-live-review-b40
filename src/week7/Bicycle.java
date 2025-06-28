package week7;

public class Bicycle {
    String brand;
    int gear;

    public void ride() {
        System.out.println("Riding " + brand + " bicycle at gear " + gear);
    }

    public void changeGear(int newGear) {
        if (newGear > gear) {
            System.out.println("Gearing up to " + newGear);
        } else {
            System.out.println("Gearing down to " + newGear);
        }
        gear = newGear;
    }

    public String toString() {
        return "Bicycle{" +
                "brand='" + brand + '\'' +
                ", gear=" + gear +
                '}';
    }
}
