package practise1;

import java.util.Arrays;
import java.util.Collections;

public class SortNumberDescending
    {
        public int sortNumberDescendingFunction(int number)
            {
                String[] b=Integer.toString(number).split("");
//                System.out.printf(Arrays.toString(b)+"\n");
                Arrays.sort(b);
                Collections.reverse(Arrays.asList(b));
                int numbers=0,digit=0;
                for (String numberword:b)
                {
                    digit=Integer.parseInt(numberword);
                    numbers=numbers*10+digit;
                }
                return numbers;
            }
    }
