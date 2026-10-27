import java.util.*;
public class CountEvenAndOddElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int even = 0; 
        int odd = 0;

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        if(arr[i] % 2 == 0){
            even++;

        }else{
            odd++;
        }
        }
    System.out.println("Even number is:" +even);
    System.out.println("Odd number is:" +odd);
    sc.close();

    }
    
}
