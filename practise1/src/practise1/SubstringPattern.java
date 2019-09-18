package practise1;

public class SubstringPattern
    {
        public String substringPatternFunction(String word,int repetition)
            {
                int i=0;
                while (i<repetition)
                {
                    word=word+word.substring(word.length()-repetition);
                    i++;
                }
                return word;
            }
    }
