import java.util.Scanner;

public class _5_runtimePolymorphism {
    public static void main(String[] args){

        // Runtime Polymorphism (Dynamic Polymorphism) : When the method that gets executed is decided.
        //                                               at runtime based on the actual type of the object

        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.print("Would you like a dog or a cat (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }
    }
}

//                  Animal
//              Dog       Cat

