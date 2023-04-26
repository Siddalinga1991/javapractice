package com.example;

import java.util.HashSet;
import java.util.Scanner;

class Sorting {

    public static void bobbleSort(int arr[]) {

          /*
         * bubble sorting - First element of the array is compared with next index, if the first element is
         * 2nd element, both will swap their values. 
         *
         * The sorted arry will be based on the condition
         *
         */

        int temp;
        for (int i = 0; i < arr.length; i++) {
           
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void selectoinSort(int arr[]){


        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length; j++){
                if(arr[j]<arr[i]){

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;

                    
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void evenNum(int arr[]){

        System.out.println("Even numbers are:");
        for(int i = 0; i<arr.length;i++){
           
                if(arr[i]% 2 == 0){
                    System.out.println(arr[i]);
                }
            
        }

    }

    public static void revString(String mystr){

        //using char array method
        char[] arr = mystr.toCharArray();
        System.out.println(arr);
        for(int i=arr.length -1;i>=0;i--){
            System.out.println(arr[i]);
        }

    }

    public static void revInt(int[] mystr){

        //using char array method
        // char[] arr = int.toCharArray();
       // System.out.println(mystr);
        for(int i=mystr.length -1;i>=0;i--){
            System.out.println(mystr[i]);
        }

    }

    public static void countVowel(){

        System.out.println("Enter the String please");
        Scanner sc = new Scanner(System.in);
        String mystr1 =sc.nextLine();
        int count=0;
        char[] char1 = mystr1.toCharArray();

       for(char c : char1){
            switch(c){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                count++;
                break;
            }
       }
       sc.close();
       System.out.println(count);

        

    //     for(int i=0;i<mystr.length();i++){

    //         char mychar = mystr.charAt(i);
    //         if((mychar=='a'|| mychar=='A') || ((mychar=='e'||mychar=='E'))|| ((mychar=='i'||mychar=='I'))|| ((mychar=='o'||mychar=='O'))|| ((mychar=='u'||mychar=='U'))){
    //             count++;
    //         };
    //     }

    //     System.out.println("Number of vowels in the given string is "+count);
 }

    /**
     * @param {String} 
     */
    public static void findDuplicateString(String[] myarr){
        
        String[] temp = new String[myarr.length];
        int j=0;

        for(int i = 0; i<myarr.length-1;i++){
                if(myarr[i] != myarr[i+1]){
                    temp[j] = myarr[i]; 
                    j++;
                }
        }
        temp[j]=myarr[myarr.length-1];
        for(int i = 0; i<temp.length;i++){
            System.out.println(temp[i]);
        }
        
    }

    //for sorted array
    public static void findDuplicateInt(int[] myarr){
        
         int[] temp = new int[myarr.length];
        int j=0;

        for(int i = 0; i<myarr.length-1;i++){
                if(myarr[i] != myarr[i+1]){
                    temp[j] = myarr[i]; 
                    j++;
                }
        }
        temp[j]=myarr[myarr.length-1];
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
       
        
    }

    //for unsorted array
    public static void unsortedDuplicate(int[] myarr){
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i < myarr.length;i++){
            hs.add(i);
        }
        for(int no: hs){
            System.out.println(no + " ");
        }
    }
    public static void main(String[] args) {

      
        int[] myarr = { 33,54,12,43,12};
        String[] myarr1= {"hi", "hello","namaste", "hey","hello","namaste"};
        String hel = "Hey hero";
       //bobbleSort(myarr);
       // selectoinSort(myarr);
       //evenNum(myarr);
       //revString(hel);
       //countVowel();
       //findDuplicateString(myarr1);
       //findDuplicateInt(myarr);
        //unsortedDuplicate(myarr);
        revInt(myarr);
       
       

    }
}
