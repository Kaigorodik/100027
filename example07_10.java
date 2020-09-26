import java.util.Scanner;
public class example07_10{
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.print("Input the name of the day of the week:");
String name_of_day = in.nextLine();
System.out.print("Input the name of the month:");
String month = in.nextLine();
System.out.print("Input the number of the day in the month:");
int day = in.nextInt();
System.out.printf("Today is: "+name_of_day+" " +day+" " +month);
in.close();
}
}