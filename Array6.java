import java.util.Arrays;
public class Array6
{
    public static void main (String[] args) {
        int myArray[] = {1, 8, 10, 12, 6, 4, 19, 67, 87, 34};
        int temp = myArray[myArray.length - 1];
        for(int i = myArray.length - 1; i > 0; i--) {
           myArray[i] = myArray[i - 1];
        }
        myArray[0] = temp;
        System.out.println("NewArray = " + Arrays.toString(myArray));
    }
}  