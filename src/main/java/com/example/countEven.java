package com.example;
import java.io.*;
import java.util.*;

public class countEven {


public static void main(String[] args) {

   // write your code here
         Scanner sc = new Scanner(System.in);
         int size;
         int count=0;
         System.out.println("Enter the size of he list");
         
         size = sc.nextInt();

         int[] a = new int[size];

         System.out.println("Enter" +size+ "elements of an array");
        
         for(int i =0;i<a.length;i++){

            a[i]= sc.nextInt();
            
         }

         System.out.println("\n List of even numbers in the array: ");
         for(int i=0;i<a.length; i++){
            if( i % 2 == 0){
               count++;
            }
         }
         System.out.println("Count of the even numbers in the given list: "+count);


      }

  }
    

