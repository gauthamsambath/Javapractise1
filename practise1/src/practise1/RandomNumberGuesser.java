package practise1;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuesser
    {
        public void randomNumberGuesserFunction(int max,int min)
            {
                Random randomizer=new Random();
                Scanner scanner=new Scanner(System.in);
                int randomnumber=randomizer.nextInt((max-min)+1)+min;

                System.out.printf(" Start guessing the number between "+max+" and "+min+"\n");
                int guess,flag=0;
                do
                {
                    guess=scanner.nextInt();
                    if(guess>randomnumber)
                    {
                        System.out.print("The number guessed is more than the original number \n");
                    }
                    else if(guess<randomnumber)
                    {
                        System.out.print("The number guessed is less than the original number \n");
                    }
                    else
                    {
                        System.out.print("The number guessed matches the original number \n");
                        flag = 1;
                    }
                }while (flag==0);
                System.out.print("\n Game over \n");
            }

    }
