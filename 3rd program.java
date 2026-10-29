import java.util.Scanner;
class Student{
String USN,name,branch,phone;
Student(String u,String n,String p){
USN=u;
name=n;
branch=b;
phone=p;
}
void display(){
System.out.println(USN + "\t"+ name +branch + "\t" + phone);
}
}
public class StudentDemo{
public static void main(Sting[]args){
Scanner sc= new Scanner(system.in);
System.out.println("enter number of student of students:");
int n =sc.nextInt();
sc.nextLine();
Student[]s=new Student[n];