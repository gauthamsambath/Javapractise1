package practise1;

public class conditionCheckTomJerry
    {
        public String conditionCheckTomJerryfunction(int number)
            {
                if((number>20)&&(number<30))
                {
                    if (number%2==0)
                    {
                        return ("Jerry \n");
                    }
                    else
                    {
                        return("Tom \n");
                    }
                }
                else
                {
                    return("No condition met \n");
                }

            }
    }
