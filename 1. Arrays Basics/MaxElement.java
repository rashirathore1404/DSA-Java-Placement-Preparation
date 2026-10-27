//code without taking input from user:
public class MaxElement {
    public static void main(String[] args){
        int[] numbers  =  {12,34,23,78,54,89,80,66};
        int max = numbers[0];

        for(int i = 0 ; i<8; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        
            
        }
     System.out.println("maximum numbers is:" +max);
    

    }
    
}


