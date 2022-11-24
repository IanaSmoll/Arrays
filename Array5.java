public class Array5 {
    public static void main(String[] args) {
        int myArray[] = new int[10];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) Math.round(Math.random() * 10);
            System.out.print(myArray[i] + " ");
        }

        int min = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] <= min) {
                min = myArray[i];
            }
        }
        System.out.println("Min = " + min);
        int max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] >= max) {
                max = myArray[i];
            }
        }
        System.out.println("Max = " + max);
    }
}



