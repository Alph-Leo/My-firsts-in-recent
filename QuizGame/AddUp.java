package QuizGame;

import java.util.Arrays;

public class AddUp {

    public static void main(String[] args) {
        addUp();
//        reverseArray();


    }
    private static void addUp() {

        int[] x = {1, 3, 4, 12};
        int target = 0;
        for (int i = 0; i < x.length; i++) {
            target = x[1] + x[2];

        }
        System.out.println(target);
    }
    private static void reverseArray(){
        int [] nums = {12, 3, 6, 20};
        int [] newList = new int[nums.length];
        int j = 0;
        for (int k = nums.length - 1; k >= 0; k--){
            newList[j] = nums[k];
            j++;
        }
        System.out.println(Arrays.toString(newList));
    }
}
