public class LeetCode1701 {
    public static  double averageWaitingTime(int[][] customers) {

        double sum = 0;
        double totalTime=0;
        for (int i = 0; i < customers.length; i++) {
            if(i == 0){
                totalTime =customers[i][0] + customers[i][1];
                sum = sum + (totalTime-customers[i][0]);
            }else if(totalTime < customers[i][0]){
                totalTime =customers[i][0] + customers[i][1];
                sum = sum + (totalTime -customers[i][0]);
            }else {
                totalTime = totalTime + customers[i][1];

                sum = sum + (totalTime - customers[i][0]);
            }
        }
        return sum/customers.length;
    }


    public static void main(String[] args) {
        int[][] customers = {{1, 2} , {2, 5} ,{4, 3}};
        System.out.println(averageWaitingTime(customers));
    }
}
