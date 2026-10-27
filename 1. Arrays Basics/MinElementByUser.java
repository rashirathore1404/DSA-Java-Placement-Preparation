import java.util.*;
public class MinElementByUser {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the numbers");
        for(int i = 0; i<5; i++){
            arr[i]  = sc.nextInt();

        }
        int min = arr[0];
        for(int i = 0; i<5; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
    System.out.println("Minimum number is:" +min);
    sc.close();


    }
    
}
