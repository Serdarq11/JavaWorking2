public class _3_interfaces {
    public static void main(String[] args){

        // interface : a blueprint for a class that specifies a set of abstract methods that implementing classes MUST define.
        //             supports multiple inheritance -like behavior.


        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();  // *The rabbit is running away*
        hawk.hunt();    // *The hawk is hunting*
        fish.hunt();    // *The fish is hunting*
        fish.flee();    // *The fish is swimming away*
    }
}

//              Prey        Predator
//       Rabbit        Fish           Hawk


