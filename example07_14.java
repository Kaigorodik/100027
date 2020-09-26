import java.util.Scanner;
public class example07_14{
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.print("Input your age:");
int a = in.nextInt();
int b = 2020;
int c = b - a;
System.out.printf("Your year of birth: " +c);
in.close();
}
}