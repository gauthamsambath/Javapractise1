package practise1;

public class SumofNumbers
    {
        public int sumOfNumbersfunction(String numbers)
            {
                int sum=0;
                String[] strs = numbers.trim().split("\\s+");
                int[] a=new int[strs.length];
                for (int i = 0; i < strs.length; i++) {
                    a[i] = Integer.parseInt(strs[i]);
                    sum+=a[i];
                }
                return sum;
            }
    }
