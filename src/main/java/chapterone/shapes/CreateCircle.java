package chapterone.shapes;

public class CreateCircle {

    public static void main(String[] args) {

        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        Square smallSquare = new Square();

        circle.changeColor("yellow");
        circle.moveHorizontal(100);
        circle.moveUp();

        triangle.changeColor("green");
        triangle.changeSize(65,105);
        triangle.moveHorizontal(30);
        triangle.moveUp();
        triangle.moveUp();

        square.changeColor("red");
        square.changeSize(80);
        square.moveHorizontal(-110);
        square.moveVertical(45);

        square.makeVisible();
        triangle.makeVisible();
        circle.makeVisible();


    }
}
