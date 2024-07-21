import java.util.Arrays;

public class LeetCode3179 {

    public static int valueAfterKSeconds(int n, int k) {
        int mod = 1000000000+7;
        int [] array = new int[n];
        Arrays.fill(array, 1);

        while(k > 0){
            int sum = 0;
            for (int i = 0; i < n ; i++) {
                sum = sum + array[i];
                array[i] = sum % mod;
            }
            k--;
        }
        return array[n-1] % mod;
    }

    public static void main(String[] args) {
        System.out.println(valueAfterKSeconds(22,15));

    }
}
