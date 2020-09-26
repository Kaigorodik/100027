import java.util.Scanner;
class example07_08{
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.print("Input name: ");
String name = in.nextLine();
System.out.printf("Hello " +name);
in.close();
}
}