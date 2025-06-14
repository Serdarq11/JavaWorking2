import java.util.InputMismatchException;
import java.util.Scanner;

public class _11_Exception {
    public static void main(String[] args){

        // Exception : an event that interrupts the normal flow of a program
        //             (dividing by zero, file not found, mismatch input type)
        //             Surround any dangerous code with a try{} block
        //             try{}, catch{}, finally{}

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        }
        catch(InputMismatchException e){    // we need to import this.
            System.out.println("That was not a number!");
        }
        catch(ArithmeticException e){
            System.out.println("YOU CANNOT DIVIDE BY ZERO!");
        }
        catch(Exception e){ // general exception
            // SAFETY NET
            System.out.println("Something went wrong!");
        }
        finally{
            scanner.close();
            System.out.println("This always executes.");
        }


     }
}

// It is better to know what kind of exception is.