import java.util.ArrayList;
import java.util.Scanner;

class Staff {
protected String code;
protected String name;
public Staff(String code, String name) {
this.code = code;
this.name = name;
}
public void displayInfo() {
System.out.println("Code: " + code);
System.out.println("Name: " + name);
}
}
class Teacher extends Staff {
private String subject;
private String publication;
public Teacher(String code, String name, String subject, String publication) {
super(code, name);
this.subject = subject;
this.publication = publication;
}
@Override
public void displayInfo() {
super.displayInfo();
System.out.println("Subject: " + subject);
System.out.println("Publication: " + publication);
}
}

class Officer extends Staff {
private String grade;
public Officer(String code, String name, String grade) {
super(code, name);
this.grade = grade;
}
@Override
public void displayInfo() {
super.displayInfo();
System.out.println("Grade: " + grade);
}
}


class Typist extends Staff {
private int speed;

public Typist(String code, String name, int speed) {
super(code, name);
this.speed = speed;
}
@Override
public void displayInfo() {
super.displayInfo();
System.out.println("Speed: " + speed);
}
}
class RegularTypist extends Typist {
private double remuneration;

public RegularTypist(String code, String name, int speed, double remuneration) {
super(code, name, speed);
this.remuneration = remuneration;
}
@Override
public void displayInfo() {
super.displayInfo();
System.out.println("Remuneration: " + remuneration);
}
}
class CasualTypist extends Typist {
private double dailyWages;
public CasualTypist(String code, String name, int speed, double dailyWages) {
super(code, name, speed);
this.dailyWages = dailyWages;
}
@Override
public void displayInfo() {
super.displayInfo();
System.out.println("Daily Wages: " + dailyWages);
}
}
public class Q_7 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
ArrayList<Staff> employees = new ArrayList<>();
employees.add(new Teacher("Y001", "Ayan Das", "Mathematics", "Introduction to Algebra"));
employees.add(new Officer("O001", "Alice Smith", "Grade A"));
employees.add(new RegularTypist("RT001", "Ram Das", 60, 2000.0));
employees.add(new CasualTypist("CT001", "Narayan pal", 40, 100.0));
System.out.println("Employee Information:");
for (Staff employee : employees) {
System.out.println("---------------------");
employee.displayInfo();
System.out.println("---------------------");
}
scanner.close();
}
}
 
