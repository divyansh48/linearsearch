public class linearsearchalgo {
    public static void main(String[] args) {

        int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int target = 19;
        int ans = linearsearch(nums, target);
        System.out.println(ans);
    }
    static int linearsearch(int[] num , int search){
        if (num.length==0){
            return -1;

        }
        for (int i = 0; i < num.length; i++) {
            int element = num[i];
            if (element == search){
                return i;
            }
        }
        return -1;
    }
}
