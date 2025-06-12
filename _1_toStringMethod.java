public class _1_toStringMethod {
    public static void main(String[] args){

        // .toString() : method inherited from the Object class
        //               used to return a string representation of an object.
        //               by default, it returns a hash code as a unique identifier.
        //               it can be overridden to provide meaningful details.

        Car car1 = new Car("Ford", "Mustang", 2025, "Blue");
        Car car2 = new Car("Chevrolet", "Corvette", 2026, "Red");


        System.out.println(car1);    // Car@8efb846
        // System.out.println(car.color + " " + car.year + " " + car.make + " " + car.model);  // Blue 2025 Ford Mustang

        System.out.println(car1);    // Blue 2025 Ford Mustang
        System.out.println(car2);    // Red 2026 Chevrolet Corvette


    }
}

// Car class
