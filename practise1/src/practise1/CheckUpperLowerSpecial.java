package practise1;

public class CheckUpperLowerSpecial
    {
        public String checkUpperLowerSpecialFunction(char letter)
            {
                String returnword=new String();
                if (Character.isUpperCase(letter))
                {
                    return ("Capital letter");
                }
                else if (Character.isLowerCase(letter))
                {
                    return ("Small letter");
                }
                else if (Character.isDigit(letter))
                {
                    return ("Digit");
                }
                else
                {
                    return ("Special character ");
                }
            }
    }
