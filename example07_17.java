import java.util.Scanner;
public class example07_17{
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.print("Input the first number:");
int a = in.nextInt();
System.out.print("Input the second number:");
int b = in.nextInt();
int c = b + a;
int d = b - a;
System.out.printf("The sum of two numbers: " +c +"; ");
System.out.printf(" the difference of two numbers: " +d);
in.close();
}
}