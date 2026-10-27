public class LinearSearch {
    public static void main(String[] args){
        int[] arr  = {21,43,65,29,87,45};
        int key = 45;
        int found = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key){
                System.out.println("number found at index:" +i);
                found  = 1;
                break;
            }
        }
        if(found == 0){
            System.out.println("not found");
        }
    }
    
}
