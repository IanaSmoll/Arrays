import java.util.Arrays;
public class Array3 {
    public static void main(String[] args) {
        
        int[] myArray = new int [20];
        int[] returnArray = new int [20];

        for(int i = 0; i < myArray.length; i++) {
            myArray[i] = (int)Math.round(Math.random() * 10);
        }
        System.out.println(Arrays.toString(myArray));
        for(int i = 0; i < myArray.length; i++) {
            returnArray[i] = myArray[myArray.length - 1 - i];
        }
        System.out.println(Arrays.toString(returnArray));
        }
    }