public class Array1 {
    public static void main(String[] args) {

    int[] myArray = new int[10]; 
    boolean isFound = false;
    
    for (int i = 0; i < myArray.length; i++) {
        myArray[i] = (int)Math.round(Math.random() * 10);
    }
    int myNum = (int)Math.round(Math.random() * 10);
    for (int i = 0; i < myArray.length; i++) {
        if (myArray[i] == myNum) {
        System.out.println("number in array " + Integer.toString(myNum));
        isFound = true;
        break;
        }
     }
    if(!isFound) {
       System.out.println("number in not array");
    }
}
}
