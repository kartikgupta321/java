import java.util.Scanner;
import java.util.Arrays;

public class week4 {
    public static void main(String[] args){
        // C
        // Scanner sc = new Scanner(System.in);
        // int[] arr = new int[10];
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println("enter arr["+i+"] - ");
        //     arr[i] = sc.nextInt();
        // }
        // int max=arr[0];
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]>max)
        //         max=arr[i];
        // }
        // System.out.println("max element is- "+max+" with index- "+);
        // sc.close();
        // D
        // String arr[] = new String[4];
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < 4; i++) {
        //     System.out.println("enter "+i+"th string");
        //     arr[i] = sc.nextLine();
        // }
        // int ind1 = 0;
        // int ind2 = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i].length() > arr[ind1].length()) {
        //         ind1 = i;
        //     }
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i].length() > arr[ind2].length() && arr[i].length() < arr[ind1].length()) {
        //         ind2 = i;
        //     }
        // }
        // System.out.println("2nd largest string is- "+ arr[ind2]);
        // sc.close();
        // E
        // int[][] mat1 = new int[3][3];
        // int[][] mat2 = new int[3][3];
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         System.out.println("enter value ["+i+"]["+j+"] for matrice 1- ");
        //         mat1[i][j] = sc.nextInt();
        //         System.out.println("enter value ["+i+"]["+j+"] for matrice 2- ");
        //         mat2[i][j] = sc.nextInt();
        //     }
        // }
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         System.out.println("added matrice have value- "+ (mat1[i][j]+mat2[i][j]) +" at ["+i+"]["+j+"]");
        //     }
        // }
        // sc.close();
        // F
        // int[][] mat1 = {
        //     {1,1,1},
        //     {1,1,1},
        //     {1,1,1},
        // };
        // int[][] mat2 = {
        //     {1,1,1},
        //     {1,1,1},
        //     {1,1,1},
        // };
        // int[][] mat3 = new int[3][3];
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         mat3[i][j] = 0;
        //         for (int k = 0; k < 3; k++) {
        //             mat3[i][j] += mat1[i][k]*mat2[k][j];                
        //         }
        //         System.out.print(mat3[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // G
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter no . of element of array- ");
        // int size = sc.nextInt();
        // String[] arr = new String[size];
        // for (int i=0;i<arr.length ;i++ ) {
        //     System.out.println("enter arr["+ i +"] element- ");
        //     arr[i] = sc.next();
        // }
        // sc.close();
        // Arrays.sort(arr);
        // System.out.println(arr[2]);
        // H
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no . of element of array- ");
        int size = sc.nextInt();
        String[] arr = new String[size];
        for (int i=0;i<arr.length ;i++ ) {
            System.out.println("enter arr["+ i +"] element- ");
            arr[i] = sc.next();
        }
        System.out.println("enter string element to search- ");
        String x = sc.next();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
                System.out.println("string present at- " + i);
                break;
            }
            else if(i==arr.length-1)
                System.out.println("not found");
        }
        System.out.println(arr[0]);
        sc.close();
        
        


    }
}
