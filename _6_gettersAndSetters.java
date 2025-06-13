public class _6_gettersAndSetters {
    public static void main(String[] args){

        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS : Methods that make a field READABLE.
        // SETTERS : Methods that make a field WRITEABLE

        Carrr car = new Carrr("Charger", "yellow", 10000);

        car.setColor("Blue");
        car.setPrice(-20);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());  // yellow Charger 10000

    }
}

// Because of they are private in their class, we use get methods to recall them.
// Because of they are private we cannot change their value unless we use set methods
