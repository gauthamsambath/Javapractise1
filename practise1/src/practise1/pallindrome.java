package practise1;

public class pallindrome
    {
        public String pallindromeFunction(int number)
            {
                int dupe=number;
                int rev=0,dig,sumeven=0;
                while (dupe!=0)
                {
                    dig=dupe%10;
                    if (dig%2==0)
                    {
                        sumeven=sumeven+dig;
                    }
                    rev=rev*10+dig;
                    dupe=dupe/10;

                }
//        System.out.printf(rev+"\n");
                if (number==rev)
                {
                    if (sumeven<25)
                    {
                        return (number+" is pallindrome and the sum of even number is less than 25 ");
                    }
                    else
                    {
                        return(number+" is pallindrome and the sum of even number is greater than 25 ");
                    }
                }
                else
                {
                    return(number+" is not a pallindrome");

                }


            }
    }
