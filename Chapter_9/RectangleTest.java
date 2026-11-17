public class RectangleTest {
    public static void main(String[] args) throws Exception {
        Rectangle r1 = new Rectangle(4,40);
        Rectangle r2 = new Rectangle(3.5,35.9);
        System.out.println("Rectangle 1:");
        System.out.println("The width is "+r1.width);
        System.out.println("The height is "+r1.height);
        System.out.println("The area is "+r1.getArea());
        System.out.println("The perimeter is "+r1.getPerimeter());
        System.out.println("Rectangle 2:");
        System.out.println("The width is "+r2.width);
        System.out.println("The height is "+r2.height);
        System.out.println("The area is "+r2.getArea());
        System.out.println("The perimeter is "+r2.getPerimeter());
    }
}

class Rectangle {
    double width = 1;
    double height = 1;

    Rectangle() {
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width*height;
    }

    double getPerimeter() {
        return width*2+height*2;
    }
}