public class array2d {
    static void printArray(int[][] arr){
        for ( int i = 0 ;i<arr.length;i++){
            for( int j = 0; j<arr[i].length;j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,3},
                        {4,5},
                        {9,8}
                        };
    printArray(arr);                    
    }
}


