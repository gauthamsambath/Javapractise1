package practise1;

public class ReverseString
    {
        public String reverseStringFunction(String word)
            {
                String reverse="";
                int   i=0;
                while(i<word.length())
                {
                    reverse=reverse+word.charAt((word.length()-1)-i);
                    i++;
                }
                return reverse;

            }
    }
