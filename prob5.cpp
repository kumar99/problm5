#include <iostream>
using namespace std;

#define TARGET 20

int commonfact(long long a, int b) {
        while(a % b !=0) {
                int c = b;
                b = a % b;
                a = c;
        }
        return b;
}

int main () {
        long long rs = TARGET;
        for(int i = TARGET-1; i>0; --i) {
                rs = rs * i / commonfact(rs, i);
        }
        cout << rs << endl;
        return 0;
}
