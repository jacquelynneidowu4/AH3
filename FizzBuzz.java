//java.import.Scanner;

import java.util.Scanner;

public class FizzBuzz{
    public static String fizzBuzzRecursive(int n){
        //System.out.println(n);

        if(n==0)return " ";

       else if(n==1){
           // answer +=" 1";
           // answer+="1";
            return fizzBuzzRecursive(n-1) + " 1 ";
        }
        else if(n%15==0){
            //answer+=" Fizz Buzz";
            return fizzBuzzRecursive(n-1) + " FizzBuzz ";
        }
        else if(n%5==0){
            //answer+=" Buzz";
            return fizzBuzzRecursive(n-1) + " Buzz ";
        }
       else if(n%3==0){
           // answer+=" Fizz";
            return fizzBuzzRecursive(n-1) + " Fizz ";
        }
       else {
            return n + fizzBuzzRecursive(n-1)  + " " + n  + " ";
        }
    }

    public static void main(String[] args){
       Scanner console = new Scanner(System.in);
        int num;
        System.out.println("Please enter a number");

        num=console.nextInt();
        for(int i=1;i<=num;i++){
            if(i%15==0)System.out.print("FizzBuzz"+ " ");
            else if (i%5==0)System.out.print("Buzz" + " ");
            else if(i%3==0)System.out.print("Fizz" + " ");
            else System.out.print(i+ " ");
        }
        System.out.println(" ");


        System.out.println(fizzBuzzRecursive(15));





    }
}