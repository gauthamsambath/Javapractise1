package practise1;

public class ConsonantVowelChecker
    {
        public String consonantVowelCheckerfunction(String word)
            {
                int length=word.length();
                String returnString="";
                while(length!=0)
                {
                    char letter = word.charAt(word.length() - length);
                    switch (letter)
                    {
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
//                            System.out.printf(" Vowel ");
                            returnString=returnString+" Vowel ";
                            break;
                        default:
//                            System.out.printf(" Consonant ");
                            returnString=returnString+" Consonant ";
                    }
                    length--;
                }
                return returnString;

            }
    }
