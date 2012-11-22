
import java.util.*;
public class Prob35 {
    public static void main(String[] args) {
        int n = 10000001;
        boolean isprime[] = new boolean[n+1];
        Arrays.fill(isprime, true);
        isprime[2] = true;
        isprime[3] = true;
        for (int i = 4; i < n; i += 2) isprime[i] = false;
        for (int i = 3; i < n; i += 2) {
            for (int j = i+i; j < n; j += i) {
                isprime[j] = false;
            }
        }
        
        int out = 1; // for 2
        for (int i = 3; i < n; i += 2) {
            if (isprime[i]) {
                int pow = 1;
                int j = i;
                int digits = 1;
                while (j >= 10) {
                    j/=10;
                    pow *= 10;
                    digits++;
                }
                int rot = i;
                // is 'i' circular?
                boolean circ = true;
                
                for (j = 0; j < digits && circ; ++j) {
                    if (!isprime[rot]) circ = false;
                    int last = rot % 10;
                    rot = rot/10 + last * pow;                    
                }
                if (circ) {
                    out++;
                }
            }
        }
        
        System.out.println(out);
    }
}
