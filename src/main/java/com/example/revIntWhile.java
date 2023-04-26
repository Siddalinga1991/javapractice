package com.example;

public class revIntWhile {
    public static void main(String args[]){
        

        int original1 = 4312, revint=0;
        //using while loop
        while(original1 !=0){
            int remainder = original1%10;
            revint = revint*10+remainder;
            original1= original1/10;
        }
        System.out.println(revint);
        
        //using for loop
        int original2=3542, revint1=0;
        for(; original2!=0; original2= original2/10){
            int remainder1= original2%10;
            revint1 = revint1*10+remainder1;
        }
        System.out.println(revint1);
        
    }
    
}
