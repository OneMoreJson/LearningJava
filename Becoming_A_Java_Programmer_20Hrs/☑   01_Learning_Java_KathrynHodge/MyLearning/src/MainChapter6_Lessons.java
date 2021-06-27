
public class MainChapter6_Lessons {


    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);

        double triangleAArea = triangleA.findArea();
        System.out.println("The area of Triangle A is " + triangleAArea);

        double triangleBArea = triangleB.findArea();
        System.out.println("The area of Triangle B is " + triangleBArea);

        System.out.println("The 3rd Side of triangle A is " +triangleA.sideLenThree);
        System.out.println("The Base of triangle B is " + triangleB.base);

        System.out.println("The number of sides in a triangle are: " + Triangle.numOfSides);
    }
}