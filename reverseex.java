//reverse an array consisting of integer value.

import java.util.*;

public class reverseex {
    static void swaparr(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] =temp;
    }

    static void reversearr(int[] arr){
        int i=0, j=arr.length-1;

        while(i<j){
            swaparr(arr, i, j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int a=9;
        int b=3;
        int[] arr = {1,2,3,4,5,6};
        reversearr(arr);
        swaparr(arr, a, b);
    }    
}
