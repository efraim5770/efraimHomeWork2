package com.company;


public class Main {

    public static void main(String[] args) throws MyArraySizeException {
	String [][] values = {{"1","2","3","4"},{"1","2","5","4"},{"1","2","3","4"},{"1","2","3","4"}};
     try {
         int s = sum(values);
         System.out.println(s);
     }catch (MyArraySizeException e){
         System.out.println("массив не 4x4");
     }
    }

    public static int sum(String[][] values) throws MyArraySizeException {
        int sum = 0;
       if( values.length !=4) {
           throw new MyArraySizeException();
       }

        for(int i = 0; i < values.length; i++){
            if( values[i].length !=4) {
                throw new MyArraySizeException();
            }
       for (int j = 0; j < values[i].length; j++){
       int v = Integer.parseInt(values[i][j]);
       sum += v;
       }
        }
             return sum;
        }
}
