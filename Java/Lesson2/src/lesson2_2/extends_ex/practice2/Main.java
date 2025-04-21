package lesson2_2.extends_ex.practice2;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle(2.0);
        Rectangle rectangle = new Rectangle(4.0, 5.0);

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Rectangle area: " + rectangle.getArea());

	}

}
