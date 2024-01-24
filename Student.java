import java.util.Scanner;

class Student
{
public static void main(String args[])
{
     float ds, ml, ai, comp; 
     double total, average, percentage;

    Scanner sc =new Scanner(System.in);

    System.out.println();
    System.out.println("*****Enter marks of five subjects*****");
    System.out.println();

    System.out.print("Enter marks of Data Science subjects:-");
    ds=sc.nextFloat();

    System.out.print("Enter marks of MachineLearning subjects:-");
    ml=sc.nextFloat();

    System.out.print("Enter marks of Artificial Intelligance subjects:-");
    ai=sc.nextFloat();

    System.out.print("Enter marks of computers subjects:-");
    comp =sc.nextFloat();

    total = ds + ml + ai + comp;

    average = (total / 5.0);
    percentage = (total / 500.0) * 100;

    System.out.println();
    System.out.println("Total marks ="+total);
    System.out.println("Average marks = "+average);
    System.out.println("Percentage = "+percentage);

   }

}
