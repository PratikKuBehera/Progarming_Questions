package CodingQuestionByCompany;

import java.util.Scanner;


class Circle{

    private double radius;

    public Circle( double radius ){

        this.radius = radius;

    }

    public double getRadius(){
        double area =3.14f*radius*radius;

        return area;
    }


}


public class Company2 {
    public static void main(String[] args) {
        // Program to find area of a circle, with Circle class and method area in it to calculate
        // Formula : pi*r*r

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius :");
        int radius = sc.nextInt();

        Circle c =new Circle(radius);
        System.out.println("The Area Of Circle is :"+ c.getRadius());
    }
}
