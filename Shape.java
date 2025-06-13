public abstract class Shape {

    abstract double area(); // abstract method

    void display(){ // concrete method -> we don't need to override and implement it, it's inherited.
        System.out.println("This is a shape");
    }
}
