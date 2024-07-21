import java.util.Arrays;

public class LeetCode350 {

    public static int[] intersect(int[] nums1 , int[] nums2){

        int[] ans = new int[]{};
        int idx = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]){
                    ans[idx] = nums1[i];
                    idx++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        System.out.println(Arrays.toString(intersect(nums1 , nums2)));
    }
}
