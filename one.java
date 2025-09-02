import java.util.Scanner;
public class one{
public static void main(String[] args) {
System.out.print("-----------------Electric Bill Calculator------------------------\n");
Scanner scan = new Scanner(System.in);
System.out.print("Enter the Consumer Number : ");
int cno = scan.nextInt();
scan.nextLine();
System.out.print("Enter the Consumer Name : ");
String name = scan.nextLine();
System.out.print("Enter the commertial type\n 1.) Domestic\n 2.) Commercial\nEnter Your Answer : ");
int type = scan.nextInt();
System.out.print("Enter the Readings of this Month : ");
double read = scan.nextDouble();
double amount=0;
if (type == 1) {
if (read >= 0 && read <= 100) {
amount = read * 2;
} else if (read >= 101 && read <= 200) {
amount = read * 4.50;
} else if (read >= 201 && read <= 500) {
amount = read * 6;
} else if (read >= 501) {
amount = read * 7;
}
}else{
System.out.println("Invalid Type please Enter weather Option 1 or 2 ,And try Again..!");
scan.close();
return;
}
System.out.println("--------Electricity Bill--------");
System.out.println("Counsumer Name: "+name);
System.out.println("Consumer Number: "+cno);
System.out.println("This Month reading: ");
System.out.println("Total Bill Amount:" +amount);
System.out.print("------------------------------Thank You------------------------------\n");
scan.close();
}
}
