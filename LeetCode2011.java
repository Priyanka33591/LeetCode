public class LeetCode2011 {

    public static int finalValueAfterOperations(String[] operations) {

        int x = 0 ;
        for (String operation : operations) {
            if (operation.equals("X++") || operation.equals("++X")) {
                x = x + 1;
            } else if (operation.equals("--X") || operation.equals("X--")) {
                x = x - 1;
            }
        }
    return x;
    }

    public static void main(String[] args) {

        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }
}
