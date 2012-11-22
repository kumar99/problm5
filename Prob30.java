public class Prob30 {
    public static void main(String args[]) {
        long sum = 0;
        for (int i = 2; i < 10000000; ++i) {
            String digs = Integer.toString(i);
            long num = 0;
            for (int j = 0; j < digs.length(); ++j) {
                char c = digs.charAt(j);
                int digit = (int)(c-'0');
                int pow5 = digit*digit; // ^2
                pow5 = digit*pow5*pow5;  // digit*(digit^2)^2
                num += pow5;
            }
            if (num == i) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
