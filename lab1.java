import java.util.Scanner;
public class lab1 {
    public static void main(String[] args) {
        // try{
        //     int i=2/0;
        //     System.out.println("in try block");
        // }
        // catch(NumberFormatException h){
        //     System.out.println("not possible to divide by 0");
        // }
        // catch(Exception h){
        //     System.out.println("error see!");
        // }
        // finally{
        //     System.out.println("in finally block");
        // }
        // System.out.println("start");
        // try {
        //     Thread.sleep(10000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        // System.out.println("end");
        // int sum = 0;
        // for(String str :args){
        //     sum += Integer.parseInt(str);
        // }
        // System.out.println("sum is " + sum);
        // try{
        // Scanner sc = new Scanner(System.in);
        // int i = sc.nextInt();
        // int j = sc.nextInt();
        // int res = i/j;
        // System.out.println(res);
        // sc.close();
        // }
        // catch(ArithmeticException ar){
        //     System.out.println("divide by 0 not allowed");
        // }catch(NumberFormatException nf){
        //     System.out.println("");
        // }catch(RuntimeException rt){
        //     System.out.println("runtime exception");
        // }catch(Exception rt){
        //     System.out.println("in exception");
        // }
        // call stack mechanism
        ArithmeticException ar =  new ArithmeticException();
        throw ar;
    }
}
