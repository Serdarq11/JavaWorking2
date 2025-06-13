public class _4_polymorphism {
    public static void main(String[] args){

        // polymorphism : "POLY" = "MANY",      "MORPH" = "SHAPE"
        //                Objects can identify as other objects
        //                Objects can be treated as objects of a common superclass

        Carr car = new Carr();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }

        // You drive the car
        //You ride the bike
        //You sail the boat


    }
}

// Also we can make the Vehicle interface instead of being a class!!!!!!!

//                          Vehicle
//                  Carr     Bike       Boat


