#include <stdio.h>
#include <stdlib.h>

#define LIMIT 1000

int main()
{
float a = 1.0;
float b = 1.0;
float c = a + b;

double ap = 0;
double bp = 0;
double cp = 0;


unsigned int term = 3;

        while(cp + 1 < LIMIT)
        {
        a = b;
        ap = bp;

        b = c;
        bp = cp;

        if(ap == bp)
		c = a + b;

        else if (bp > ap)
		c = (a * 0.1) + b;

        term++;

                while(c > 10)
                {
                c = c * 0.1;
                cp++;
                }
        }

printf("First term with %d digits: %d\n", LIMIT, term);


return 0;
}
