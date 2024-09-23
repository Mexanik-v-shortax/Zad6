
public class Practicum {
    public static void main(String[] args) {
        Figure circle = new Circle(); // Создаем объект Circle, наследующий от Figure
        Figure square = new Square();
        Figure rectangle = new Rectangle();
        Ellipse ellipse = new Ellipse();

        circle.drawCircle();
        square.drawSquare();
        rectangle.drawRectangle();
        ellipse.drawCircle(); // Вызываем метод drawCircle() из класса Ellipse
        ellipse.circleToEllipse();
    }

    static class Circle extends Figure { // Circle наследуется от Figure
    }

    static class Square extends Figure { // Square наследуется от Figure
    }

    static class Rectangle extends Figure { // Rectangle наследуется от Figure
    }
}