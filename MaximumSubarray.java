/**
 * MaximumSubarray
 */
public class MaximumSubarray {

    public static int maxSubArray(int[] arr){
        int n = arr.length;
        int ans = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            ans+=arr[i];
            max = Math.max(max, ans);
            if(ans < 0){
                ans = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}