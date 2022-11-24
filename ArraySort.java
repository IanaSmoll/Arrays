import java.util.Arrays;
public class ArraySort {
public static void main (String[] args) {
    int myArray[] = {5, 19, -48, 58, 14};
    //int myArray[] = new int [10];
    //Arrays.sort(myArray);
    for(int i = 0; i < myArray.length - 1; i++) {
        //myArray[i] = (int)Math.round((Math.random() - 0.5) * 10);
        int temp = myArray[i];
        for(int n = 0; n < myArray.length - 2; n++) {
        if (myArray[i] < myArray[i + n]) {
            myArray[i] = temp;
            n++;
        }
        if (myArray[i] > myArray[i + n]) {
            myArray[i] = myArray[i + n];
            myArray[i + n] = temp;
            n++;
        }
        }
    } 
    System.out.println("My Array = " + Arrays.toString(myArray));
}
}



