public class Array2 {
    public static void main(String[] args) {
        
        int[] myArray = new int [20];
        int Positive = 0;
        int Negative = 0;
        int Count = 0;
        int Uncount = 0;
        int Null = 0;
        
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int)Math.round((Math.random() - 0.5) * 10);
            if (myArray[i] > 0) {
                Positive++;
            }
            if (myArray[i] < 0) {
                Negative++;
            }
            if (myArray[i] % 2 == 0) {
                Count++;
            }
            if (myArray[i] % 2 != 0) {
                Uncount++;
            }
            if (myArray[i] == 0) {
                Null++;
            }
         }
         System.out.println("numbers with + " + Positive);
         System.out.println("numbers with - " + Negative);
         System.out.println("numbers Count " + Count);
         System.out.println("numbers Uncount " + Uncount);
         System.out.println("numbers Null " + Null);
        }
}

