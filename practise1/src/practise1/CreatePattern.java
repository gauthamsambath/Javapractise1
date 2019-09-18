package practise1;

public class CreatePattern
    {
        public String createPatternFunction(int number)
            {
                String pattern=new String();
                for (int i=0;i<number;i++)
                {
                    for (int j=0;j<i+1;j++)
                    {
                        pattern=pattern+ (i + 1);
                    }
                    pattern=pattern+"\n";
                }
                return pattern;
            }

    }
