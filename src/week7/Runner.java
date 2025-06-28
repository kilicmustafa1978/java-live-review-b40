package week7;

public class Runner {
    public static void main(String[] args) {
        System.out.println("-------APP OBJECTS------");
        App uberApp = new App();
        uberApp.name = "Uber";
        uberApp.version = 4.0;
        uberApp.isFree = true;
        uberApp.run();
        uberApp.update();
        System.out.println(uberApp);

        System.out.println("App name = " + uberApp.name);

        App app = new App();
        app.name = "Google Maps";
        app.version = 34.5;
        app.isFree = true;

        System.out.println(app.toString()); //toString() method call - not needed
        app.update();
        System.out.println(app); //calls toString() automatically
        app.run();

        System.out.println("Uber app version = " + uberApp.version);
        System.out.println("Google maps version = " + app.version);

        System.out.println("-------BICYCLE OBJECTS------");
        Bicycle bike = new Bicycle();
        System.out.println(bike);
        //assign values to instance variables
        bike.brand = "Trek";
        bike.gear = 10;
        System.out.println(bike);

        bike.ride();

        bike.changeGear(8);

        bike.ride();

        bike.changeGear(13);

        bike.ride();
    }
}
