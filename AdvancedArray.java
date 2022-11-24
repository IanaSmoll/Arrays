import java.util.Arrays;
import java.util.*;

public class AdvancedArray {
    int size;
    int[] myArray;

    public void createArray(int size) { // создаем массив с нулями
        this.size = size;
        this.myArray = new int [this.size];
       // Arrays.fill(myArray, 0); - можно и этой фунцией
        for(int i = 0; i < this.size; i++) {
        this.myArray[i] = 0;
        }
        System.out.println(Arrays.toString(myArray));
    }
    public void setArray(int[] array) { // заполняем массив числами, заданными в инпуте метода
        this.myArray = array.clone();
        int size = this.myArray.length;
        System.out.println(Arrays.toString(array));
    }
    public int size() {// возвращает размер массива
        return(this.size); 
    }
    public void add(int el) {// добавляет элемент в конец массива
        this.size = this.myArray.length;
        int[] myArray2 = new int[this.size + 1];
        for(int i = 0; i < this.myArray.length; i++) {
            myArray2[i] = this.myArray[i];
        }
        myArray2[this.myArray.length] = el;
        System.out.println(Arrays.toString(myArray2));
        createArray(myArray.length + 1);
        setArray(myArray2); // чтобы дальше методы работали с новым массивом myArray2
    }

    public void remove(int index) {// удаляет элемент в указанной позиции в этом списке
        this.size = this.myArray.length;
        int[] myArray3 = new int[this.size - 1];
        for(int i = 0; i < this.myArray.length - 1; i++) {
            if(i >= index) {
                myArray3[i] = this.myArray[i + 1];
            }
            else {
                myArray3[i] = this.myArray[i];
            }
        }
        System.out.println(Arrays.toString(myArray3));
        createArray(this.myArray.length - 1); 
        setArray(myArray3); //чтобы в дальнейшем уже работали с новым массивов, а не myArray
    }
    public int get(int index) { //возвращает элемент в указанной позиции в этом списке.
        return(myArray[index]);
    } 
    
    public void printArray() {
        for(int i = 0; i < this.myArray.length; i++) {
            System.out.print(myArray[i] + " , ");
        }
    }
}

        
        

    