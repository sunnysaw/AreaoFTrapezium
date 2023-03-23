/*
Question : Problem Description
Given the dimensions of a trapezium, find out its area.
_______________________________________________________________
Problem Solution
The area of a trapezium can be calculated using the formula:

Area = (sum of parallel sides)*(height)/2.
_____________________________________________________________________
Case 1 (Simple Test Case):

Enter the length of the two parallel sides and the height of the trapezium
13.765
23.555
8.0
Area = 149.28
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1,side2,sum, height,Area;
        System.out.println("Enter the first base of trapezium : ");
        side1 = sc.nextDouble();
        System.out.println("Enter the second base of trapezium :");
        side2 = sc.nextDouble();
        System.out.println("At last enter the height of trapezium :");
        height = sc.nextDouble();
        sum = side1 + side2;
        Area = (sum * height) / 2;
        System.out.println("Printing the result : " + Area);
    }
}