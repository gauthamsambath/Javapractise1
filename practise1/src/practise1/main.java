package practise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main
    {
        public static void main(String[] args) throws IOException {   int choice,numbertocheck;
                Scanner scanner=new Scanner(System.in);
                char decision;
                String answerword,wordtocheck;
                int answernumber,max,min;
                do
                    {
                        System.out.print("**** Enter an option from the following ****\n ");
                        System.out.print("\n 1. Check if a number is pallindrome \n");
                        System.out.print("2. Returning Tom or Jerry based on condition checking on a number \n");
                        System.out.print("3. Checking if a given string is Vowel or Consonant \n");
                        System.out.print("4. Create a Pattern \n");
                        System.out.print("5. Sum of a series of numbers \n");
                        System.out.print("6. Check for upper,lower case or special character \n");
                        System.out.print("7. Sort digits in descending order \n");
                        System.out.print("8. Try to guess a random number \n");
                        System.out.print("9. Reverse a string \n");
                        System.out.print("10. Repeat substring starting from nth position and repeat n times \n");
                        choice=scanner.nextInt();
                        switch (choice)
                            {
                                case 1:
                                    System.out.print("Enter the number to check \n");
                                    numbertocheck=scanner.nextInt();
                                    pallindrome pal=new pallindrome();
                                    answerword=pal.pallindromeFunction(numbertocheck);
                                    System.out.print(answerword+"\n");
                                    break;
                                case 2:
                                    System.out.print("Enter the number to check \n");
                                    numbertocheck=scanner.nextInt();
                                    conditionCheckTomJerry cotj=new conditionCheckTomJerry();
                                    answerword=cotj.conditionCheckTomJerryfunction(numbertocheck);
                                    System.out.print(answerword+"\n");
                                    break;
                                case 3:
                                    System.out.print("Enter the word to check \n");
                                    wordtocheck=scanner.next();
                                    ConsonantVowelChecker checker=new ConsonantVowelChecker();
                                    answerword=checker.consonantVowelCheckerfunction(wordtocheck);
                                    System.out.print(answerword+"\n");
                                    break;
                                case 4:
                                    System.out.print("Enter the number to create pattern \n");
                                    numbertocheck=scanner.nextInt();
                                    CreatePattern pattern=new CreatePattern();
                                    answerword=pattern.createPatternFunction(numbertocheck);
                                    System.out.print(answerword+"\n");
                                    break;
                                case 5:
                                    System.out.printf("\n Start entering your numbers \n ");
                                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                                    String  lines = br.readLine();
                                    SumofNumbers sumofNumbers=new SumofNumbers();
                                    answernumber=sumofNumbers.sumOfNumbersfunction(lines);
                                    System.out.print(answernumber+"\n");
                                    break;
                                case 6:
                                    System.out.print("\n Enter the letter to check \n");
                                    char lettertocheck=scanner.next().charAt(0);
                                    CheckUpperLowerSpecial checkUpperLowerSpecial=new CheckUpperLowerSpecial();
                                    answerword=checkUpperLowerSpecial.checkUpperLowerSpecialFunction(lettertocheck);
                                    System.out.print(answerword+"\n");
                                    break;
                                case 7:
                                    System.out.print("\n Enter the number to sort \n");
                                    numbertocheck=scanner.nextInt();
                                    SortNumberDescending sortNumberDescending=new SortNumberDescending();
                                    answernumber=sortNumberDescending.sortNumberDescendingFunction(numbertocheck);
                                    System.out.print(answernumber+"\n");
                                    break;
                                case 8:
                                    System.out.print("\n Enter the max and min of the random number range \n");
                                    System.out.print("Max = \t");
                                    max=scanner.nextInt();
                                    System.out.print("Min = \t");
                                    min=scanner.nextInt();
                                    RandomNumberGuesser randomNumberGuesser=new RandomNumberGuesser();
                                    randomNumberGuesser.randomNumberGuesserFunction(max,min);
                                    break;
                                case 9:
                                    System.out.print("Enter the word to reverse \n");
                                    wordtocheck=scanner.next();
                                    ReverseString reverseString=new ReverseString();
                                    answerword=reverseString.reverseStringFunction(wordtocheck);
                                    System.out.print(answerword+"\n");
                                    break;
                                case 10:
                                    System.out.print("\n Enter the string \n");
                                    wordtocheck=scanner.next();
                                    System.out.print("\n Enter the number of repetition \n (which is taken as position of substring from last) \n");
                                    int position=scanner.nextInt();
                                    SubstringPattern substringPattern=new SubstringPattern();
                                    answerword=substringPattern.substringPatternFunction(wordtocheck,position);
                                    System.out.print("\n"+answerword+"\n");
                                    break;
                                default:
                                    System.out.print("Not a valid  choice \n");
                            }

                        System.out.print("Press 'y' to continue or 'any key' to exit \n");
                        decision=scanner.next().charAt(0);
                    }while(decision=='y');

            }
    }
