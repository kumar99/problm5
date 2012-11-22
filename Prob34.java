public class Prob34 {
    public static void main(String args[]) {
        long sum = 0;
        int fact[] = new int[10];
        for (int i = 0; i < 10; ++i) {
            fact[i] = 1;
            for (int j = 2; j <= i; ++j)
                fact[i] = fact[i] * j;
        }
        for (int i = 3; i < 10000000; ++i) {
            String digs = Integer.toString(i);
            long num = 0;
            for (int j = 0; j < digs.length(); ++j) {
                char c = digs.charAt(j);
                int digit = (int)(c-'0');                
                num += fact[digit];
            }
            if (num == i) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
