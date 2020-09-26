import java.util.Scanner;
public class example07_16{
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.print("Input the number:");
int a = in.nextInt();
int b = a - 1;
int c = a + 1;
int d = (a + b + c) * (a + b + c);
System.out.printf(b +"; " +a +"; " +c +"; " +d);
in.close();
}
}