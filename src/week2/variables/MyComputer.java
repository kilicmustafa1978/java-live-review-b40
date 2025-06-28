package week2.variables;

public class MyComputer {
    public static void main(String[] args) {
        String model = "Acer Nitro V Gaming Laptop";
        String cpu = "Intel Core i7-13620H";
        int ram = 16;
        String storage = "512GB Gen 4 SSD";
        double price = 699.99;
        boolean onSale = true;

        System.out.println("model = " + model);
        System.out.println("cpu = " + cpu);
        System.out.println("ram = " + ram);
        System.out.println("storage = " + storage);
        System.out.println("price = " + price);
        System.out.println("onSale = " + onSale);

        model = "Apple 2024 MacBook Pro";
        cpu = "M4 Pro, 12-core";
        ram = 24;
        storage = "512GB SSD";
        price = 1760.33;
        onSale = true;

        //Apple 2024 MacBook Pro Laptop with M4 Pro, 12-core CPU, 24GB Unified Memory, 512GB SSD Storage, $1760.33
        System.out.println(model + " Laptop with " + cpu + " CPU, "+ ram +"GB Unified Memory, " +
                storage + " Storage, $" + price);
    }
}
