package HinhChuNhat;

import java.util.Scanner;

public class Rectangle1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a width");
        double width=scanner.nextDouble();
        System.out.println("enter a height");
        double height=scanner.nextDouble();
        Rectangle rectangle=new Rectangle(width,height);
        System.out.println("your rectangle "+rectangle.display());
        System.out.println("perimeter of the rectangle: "+rectangle.getPerimeter());
        System.out.println("area of the rectangle: "+rectangle.getArea());
    }
}
