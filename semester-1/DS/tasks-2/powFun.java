
public class powFun {
    private static int f_pow(int base , int power) {
        int res = 1;
        while (power > 0) {
            if (power % 2 == 0){
                power = power / 2;
                base = base * base;
            }else {
                power = power -1;
                res = res * base;
                power = power / 2;
                base = base * base;
            }
        }
        // * this function get power in O(log power)
        return res;
    }

    private static int pow (int base , int power) {
        int res = 1;
        while (power > 0) {
            res = res * base;
            power -= 1;
        }
        // * this fucntion get power in O(power)
        return res;
    }

    public static void main(String[] args) {
        int test_f_pow = f_pow(5,3);
        int test_pow = pow(5,4);

        if (test_f_pow == 125) {
            System.out.println("fast_power function is bulided succefule :)");
        }else {
            System.out.println("fast_power function not build succefule :(");
        }
        if (test_pow == 625) {
            System.out.println("iterative_power function is bulided succefule :)");
        }else {
            System.out.println("iterative_power function not build succefule :(");
        }
        return;
    }

}
