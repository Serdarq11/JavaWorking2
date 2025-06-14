import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _10_ArrayList {
    public static void main(String[] args){

        // ArrayList : A resizeable array that stores objects (autoboxing).
        //             Arrays are fixed in size, but ArrayLists can change.

        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(1);
        list.add(2);

        System.out.println(list);   // [3, 1, 2]

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("coconut");

        // fruits.remove(0);    [orange, banana, coconut]
        // fruits.set(0, "Pineapple"); // [Pineapple, orange, banana, coconut]


        // System.out.println(fruits); // [apple, orange, banana, coconut]
        // System.out.println(fruits.get(3));  // coconut
        // System.out.println(fruits.size());  // 4

        // Collections.sort(fruits);   // [apple, banana, coconut, orange]
        //System.out.println(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numOfFood; i++){
            System.out.print("Enter food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);



        scanner.close();
    }
}
