package QuizGame;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {

        int [] arr = {23, 4, 5, 9};
        int [] newList = new int[arr.length];
        int n =0;
        for(int i = arr.length - 1; i >=0; i-- ){
//            System.out.println(arr[i]);
            newList[n] = arr[i];
            n++;
        }
        System.out.println(Arrays.toString(newList));
    }
}
