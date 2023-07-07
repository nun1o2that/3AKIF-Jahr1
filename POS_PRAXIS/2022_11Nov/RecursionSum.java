public class RecursionSum{

    static int sum(int x){
        if(x > 0){
            return x + sum(x - 1);
        }
        else{
            return 0;
        }
    }

    static int sumRange(int start, int end){
        if(start < end){
            return end + sumRange(start, end - 1);
        }
        else{
            return 0;
        }
    }

    public static void main ( String[] args ) {

        int result_sum = sum(10);
        System.out.println("result of sum(int x): " + result_sum);

        int result_sumRange = sumRange(0, 10);
        System.out.println("result of sumRange(int start, int end): " + result_sumRange);
    }

}