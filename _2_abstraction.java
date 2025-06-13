public class _2_abstraction {
    public static void main(String[] args){

        // abstraction : used to define abstract classes and methods.
        //               abstraction is the process of hiding implementation details and showing only the essential features.
        //               abstract classes cannot be instantiated directly
        //               can contain 'abstract' methods (which must be implemented)
        //               can contain 'concrete' methods (which are inherited)

        // Shape shape = new Shape();  // 'Shape' is abstract; cannot be instantiated

        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(4,5);
        Triangle triangle = new Triangle(6, 7);

        circle.display();   // This is a shape
        rectangle.display();   // This is a shape
        triangle.display();   // This is a shape

        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(triangle.area());



    }
}
