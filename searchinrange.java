public class searchinrange {
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int target = 19;
        int start = 2;
        int end = 7;

        int ans = linearsearch(nums, target, start , end);
        System.out.println(ans);
    }

    static int linearsearch(int[] num , int search, int start,int end){
        if (num.length==0){
            return -1;

        }
        for (int i = start; i <= end; i++) {
            int element = num[i];
            if (element == search){
                return i;
            }
        }
        return -1;
    }
}
