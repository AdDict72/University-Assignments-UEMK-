import java.util.Scanner;

class Vehicle {
protected String regnNumber;
protected int speed;
protected String color;
protected String ownerName;

public Vehicle(String regnNumber, int speed, String color, String ownerName) {
this.regnNumber = regnNumber;
this.speed = speed;
this.color = color;
this.ownerName = ownerName;
}
protected void showData() {
System.out.println("This is a vehicle class");
}
}
class Bus extends Vehicle {
private int routeNumber;
public Bus(String regnNumber, int speed, String color, String ownerName, int routeNumber) {
super(regnNumber, speed, color, ownerName);
this.routeNumber = routeNumber;
}
@Override
protected void showData() {
super.showData();
System.out.println("Regn Number: " + regnNumber);
System.out.println("Speed: " + speed);
System.out.println("Color: " + color);
System.out.println("Owner Name: " + ownerName);
System.out.println("Route Number: " + routeNumber);
}
}
class Car extends Vehicle {
private String manufacturerName;

public Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
super(regnNumber, speed, color, ownerName);
this.manufacturerName = manufacturerName;
}

@Override
protected void showData() {
super.showData();
System.out.println("Regn Number: " + regnNumber);
System.out.println("Speed: " + speed);
System.out.println("Color: " + color);
System.out.println("Owner Name: " + ownerName);
System.out.println("Manufacturer Name: " + manufacturerName);
}
}
public class Q_6 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter Bus details:");
System.out.print("Regn Number: ");
String busRegnNumber = scanner.nextLine();
System.out.print("Speed: ");
int busSpeed = scanner.nextInt();
scanner.nextLine();
System.out.print("Color: ");
String busColor = scanner.nextLine();
System.out.print("Owner Name: ");
String busOwnerName = scanner.nextLine();
System.out.print("Route Number: ");
int routeNumber = scanner.nextInt();
Bus myBus = new Bus(busRegnNumber, busSpeed, busColor, busOwnerName, routeNumber);


System.out.println("\nEnter Car details:");
System.out.print("Regn Number: ");
String carRegnNumber = scanner.next();
System.out.print("Speed: ");
int carSpeed = scanner.nextInt();
scanner.nextLine();
System.out.print("Color: ");
String carColor = scanner.nextLine();
System.out.print("Owner Name: ");
String carOwnerName = scanner.nextLine();
System.out.print("Manufacturer Name: ");
String manufacturerName = scanner.nextLine();

Car myCar = new Car(carRegnNumber, carSpeed, carColor, carOwnerName, manufacturerName);

System.out.println("\nBus Details:");
myBus.showData();

System.out.println("\nCar Details:");
myCar.showData();

scanner.close();
}
}
 
