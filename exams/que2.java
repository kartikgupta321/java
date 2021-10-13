// import java.util.Scanner;
// public class que2 {
//     public static void primeFactors(int[] arr,int[] arrprime){
//         for (int i = 0; i < 10; i++) {
//         while (arr[i]%2==0)
//         {
//             arrprime[i] += 1;
//             arr[i] /= 2;
//         }
//         for (int j = 3; j <= Math.sqrt(arr[i]); j+= 2)
//         {
//             while (arr[i] % j == 0)
//             {
//                 arrprime[i] += 1;
//                 arr[i] /= j;
//             }
//         }
//         if (arr[i] > 2)
//             arrprime[i] += 1;
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[10];
//         int[] arreven = new int[10];
//         int[] arrodd = new int[10];
//         int[] arrprime = new int[10];
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println("enter arr["+i+"] - ");
//             arr[i] = sc.nextInt();
//         }
//         sc.close();
//     }
// }
