import java.util.Arrays;

public class searchin2darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7},
                {8,9}
        };
        int target = 3;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] search(int[][] num, int target){
        if(num.length==0){
            return new int[]{-1} ;
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length ; j++) {
                if(target == num[i][j]){
                    return new int[] {i,j};

                }

            }
        }
        return new int[]{-1};

    }
}
