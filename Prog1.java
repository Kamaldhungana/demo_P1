import java.util.Scanner;
class A
{
  String usn;
  String name;
  String branch;
  String phone;
  void read()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter USN:");
    usn=sc.next();
    System.out.println("Enter name of a student");
    name=sc.next();
    System.out.println("Enter the branch:");
    branch=sc.next();
    System.out.println("Enter the phone number:");
    phone=sc.next();
  }
  void display()
  {
    System.out.println("USN: "+usn);
    System.out.println("Name: "+name);
    System.out.println("Branch: "+branch);
    System.out.println("Branch: "+phone);
    System.out.println(" ");
  }
}
public class Prog1{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of students:");
    int n=s.nextInt();
    A s1[]=new A[n];
    for(int i=0;i<n;i++)
    {
      s1[i]=new A();
    }
    for(int i=0;i<n;i++)
    {
      s1[i].read();
    }
    for(int i=0;i<n;i++)
    {
      s1[i].display();
    }
  }
}