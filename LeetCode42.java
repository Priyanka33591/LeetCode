public class LeetCode42 {

    public static int  trap(int[] height) {

        int n = height.length - 1;
        int [] rightMaxBoundary = new int[height.length];
        int [] leftMaxBoundary = new int[height.length];

        for (int i = 0; i <= n; i++) {
            leftMaxBoundary[i] = (i == 0) ? height[0] :  Math.max(leftMaxBoundary[i-1] , height[i]);
            rightMaxBoundary[n - i] = (i == 0) ? height[n] :  Math.max(rightMaxBoundary[n-i+1] , height[n - i]) ;

        }

        int totalTrappedWater = 0 ;

        for (int i = 0; i <= n; i++) {
            totalTrappedWater = totalTrappedWater + ((Math.min(rightMaxBoundary[i] , leftMaxBoundary[i])) - height[i]) ;

        }

        return totalTrappedWater;
    }
}
