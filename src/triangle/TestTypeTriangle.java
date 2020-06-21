package triangle;

public class TestTypeTriangle {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(4,3,5);
        Triangle triangle2 = new Triangle(5,5,5);
        Type type = new Type();

        type.notify(triangle1);
        type.notify(triangle2);
    }
}
