public class Array4
{
    public static void main(String[] args) {
        int[] myArray= new int[5];
        int sum = 0;
        int mult = 1;

        for(int i = 0; i < myArray.length; i++) {
            myArray[i] = (int)Math.round(Math.random() * 10);
            System.out.println(myArray[i]);
            sum += myArray[i];
            mult = myArray[i] * mult;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Multiplication = " + mult);
    }       
}