import java.util.Scanner;
public class example07_12{
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.print("Input your year of birth:");
int a = in.nextInt();
int b = 2020;
int c = b - a;
System.out.printf("Your age is: " +c +" old ");
in.close();
}
}