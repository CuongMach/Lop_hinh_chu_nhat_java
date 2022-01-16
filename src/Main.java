import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        rectangle.setHeight(scanner.nextDouble());
        System.out.println("Nhập chiều rộng: ");
        rectangle.setWidth(scanner.nextDouble());
        System.out.println(rectangle);
        System.out.println("Diện tích = " + rectangle.getArea());
        System.out.println("Chu vi = "+ rectangle.getPerimeter());
    }
}
