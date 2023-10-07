// Count the number of triplet whose sum is equal to the given value x.

import java.util.*;

public class tripplet {
    static int tripSum(int[] arr, int target){
        int ans = 0;
        int n = arr.length;
        for (int i=0;i<n;i++){
            for(int j =0; j<n; j++){
                for(int k =0; k<n; k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                    ans++; 
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n =sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter"+ " "+n+" "+ "elements");
        for(int i=0; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target");
        int target=sc.nextInt();

        System.out.println(tripSum(arr, target));
    }    
}
