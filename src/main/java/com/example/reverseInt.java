package com.example;

import java.util.Scanner;

  
    public class reverseInt {

        public static void reverseNum(int num) {

            if(num <10){
                System.out.println("Reverse of a single degit number remains same as the given number");
                return;
            }
            else{
                int remain = num % 10;
                int revString = num*10+remain;

               System.out.println(remain);
                reverseNum(num/10);
            }
            
        }
        public static void main(String args[]){
            //By recursion
            System.out.println("Enter the number that you want to reverse");
            Scanner sc = new Scanner(System.in);
    
            int number = sc.nextInt();
            sc.close();
    
            System.out.println("The reverse of the given number is ");
            reverseNum(number);
        
            
           
        }

}
