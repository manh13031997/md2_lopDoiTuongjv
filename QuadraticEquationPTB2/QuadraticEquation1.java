package QuadraticEquationPTB2;

import java.util.Scanner;

public class QuadraticEquation1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a a");
        double a = scanner.nextDouble();
        System.out.println("enter a b");
        double b = scanner.nextDouble();
        System.out.println("enter a c");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0){
            System.out.print("quadraticEquation has two roots : " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        }else if (delta==0){

            System.out.print("Equation has one root : " + quadraticEquation.getRoot1());
        }else {
            System.out.print("Equation has no real roots");
        }
    }
}
