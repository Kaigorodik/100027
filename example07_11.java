import java.util.Scanner;
public class example07_11{
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.print("Input the name of the month:");
String month = in.nextLine();
System.out.print("Input the number of days in a month:");
int day = in.nextInt();
System.out.printf(month +" contains " +day +" days");
in.close();
}
}