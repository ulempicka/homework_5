package triangle;

public class Type {
    boolean isRightTriangle(Triangle triangle){
        boolean isRight = (triangle.a * triangle.a) + (triangle.b * triangle.b) == triangle.c * triangle.c;
        boolean condition = isRight && triangle.c > triangle.a && triangle.c > triangle.b;
        if(condition){
            return true;
        }else
            return false;
    }

    void notify(Triangle triangle){
        System.out.println("Czy ten trójkąt jest prostokątny? " + isRightTriangle(triangle));
    }
}
