import java.util.*;
public class LinearSearchByUser {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the number to search");
        int key = sc.nextInt();
        int index  = -1;

        for(int i = 0; i<n; i++){
            if(arr[i] == key){
                index = i ;
                break;
            }
        }
        if(index != -1){
            System.out.println("element found at index: " +index);
        }else{
            System.out.println("not found ");
        }
        sc.close();
    }
    
}
