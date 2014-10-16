package com.wesleyreisz.problem12.code;

/**
 * Created by wesleyreisz on 10/16/14.
 */
public class ArrayUtils {
    public static int[] IncrementArray(int[] arr) {
        StringBuilder array= new StringBuilder();
        for(int i:arr){
            array.append(i);
        }

        String total = String.valueOf(Integer.parseInt(array.toString()) + 1);

        for(int i=0;i<total.length();i++){
            arr[i]=Integer.parseInt(String.valueOf(total.charAt(i)));
        }
        return arr;
    }

    public static int[] IncrementArray1(int[] arr) {
        boolean carryTheOne=false;

        for(int i=arr.length-1;i>=0;i--){
            int val;
            if(carryTheOne){
                val = arr[i] + 1;
                carryTheOne=false;
            }else{
                val = arr[i];
            }
            if(val>=9){
                val=0;
                carryTheOne=true;
                arr[i]=val;
            }else{
                arr[i]=val++;
            }
        }

        return arr;
    }

    public static int[] IncrementArray2(int[] arr) {
        return IncrementArray2(arr, arr.length-1,false);
    }
    private static int[] IncrementArray2(int[] arr, int count, boolean carryTheOne) {
        if (count<0) return arr;

        if(arr[count]==9){
            arr[count]=0;
            carryTheOne=true;
        }else{
            if(carryTheOne){
                arr[count]++;
                carryTheOne=false;
            }
        }
        return IncrementArray2(arr, count-1,carryTheOne);
    }
}
