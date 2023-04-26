package com.example;


public class keepingTotalCount {

    
    public static void countnum(int[] mylist){

        int count = 0;

            for(int i = 0; i< mylist.length-1; i++){
                if(mylist[i] % 2 !=0){
                    if(mylist[i] == 5){

                        count +=5;
                    }
                    else{
                        count +=3;
                    }
                }
                else{
                    count += 1;
                }
            }

            System.out.println(count); ;

    }

    public static void main(String[] arga){
        //keepingTotalCount  newcount= new keepingTotalCount();

        int[] myint = {3,4,5,1};
      countnum(myint); 
      
    }



    
}
