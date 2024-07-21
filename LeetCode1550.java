public class LeetCode1550 {

    public static boolean threeConsecutiveOdds(int[] arr) {
        int count = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2  != 0){
                count ++;
            }else count = 0;

            if(count == 3) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,34,3,4,5,7,23,12};
        System.out.println(threeConsecutiveOdds(arr));
    }
}
