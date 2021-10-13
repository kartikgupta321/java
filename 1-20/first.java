import java.util.Scanner;

public class first {

    public static void main(String[] args) {
// 01   literals
//        long l =9999999999999999l;
//        float f = 3.3f;
//        System.out.println("hello world");
//  02    user input
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter no. 1- ");
        // boolean c=sc.hasNextInt();
        // System.out.println(c);
        // int a= sc.nextInt();
        // System.out.println("Enter no. 2- ");
        // float b= sc.nextFloat();
        // float sum=a+b;
        // System.out.println(sum);
        // sc.close();
// 03 1st problem
    Scanner sc = new Scanner(System.in);
    // System.out.println("enter marks for 5 subjects - ");
    // float phys= sc.nextInt();
    // float phy = sc.nextInt();
    // float mat = sc.nextInt();
    // float eng = sc.nextInt();
    // float chem = sc.nextInt();
    // float total = phys +phy + chem + eng +mat;
    // float per=total / 5;
    // System.out.println("your percentage is - "+per);
    // sc.close();
// 04 strings
    // String name = new  String("harry" );
    // String name = "kartik";
    // // System.out.println(name);
    // int a=5;
    // float b =5.4f;
    // System.out.printf("the value of a is %d and of b is %8.2f",a,b);
    // System.out.format("the value of a is %d and of b is %f",a,b);
    // Scanner sc = new Scanner(System.in);
    // String k = sc.nextLine();
    // sc.close();
    // System.out.print("k is "+k);
    // String name = "kartik";
    // System.out.println(name.length());
    // System.out.println(name.toUpperCase());
    // System.out.println(name.toUpperCase());
    // System.out.println(name.trim());
    // System.out.println(name.substring(3,8));
    // System.out.println(name.replace("r", "t"));
    // System.out.println(name.startsWith("  "));
    // System.out.println(name.charAt(5));
    // System.out.println(name.indexOf("k",2));
    // System.out.println(name.lastIndexOf("k"));
    // System.out.println(name.equalsIgnoreCase("kartik"));
// 05 switch case
    int age = sc.nextInt();
    switch (age) {
        case 18:
            System.out.println("to become adult");
            break;
        case 21:
            System.out.println("do job");
            break;
        case 60:
            System.out.println("retire");
            break;
        default:
            System.out.println("enjoy");
            break;
    }
    // enhanced switch
    switch (age) {
        case 18 -> System.out.println("wow");
        default -> System.out.println("done");
    }


    }
}