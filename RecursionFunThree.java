//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RecursionFunThree
{
	public static int luckyThrees( long number )
	{
		int count = 0;
        while (number > 0) {
            if (number % 100 == 77) {
                number /= 10;
                count += 14;
            } else if (number % 10 == 7) {
                count += 1;
            }
            number /= 10;
        }
        return count;
	}
}
