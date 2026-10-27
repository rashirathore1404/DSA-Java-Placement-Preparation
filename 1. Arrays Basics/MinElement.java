
public class MinElement {
    public static void main(String[] args) {
        int[] number = {10, 30, 43, 65, 24, 98, 12};

        int min = number[0];

        for (int i = 0; i < number.length; i++) {
            if (min > number[i]) {
                min = number[i];
            }
        }

        System.out.println("Minimum number is: " + min);
    }
}


