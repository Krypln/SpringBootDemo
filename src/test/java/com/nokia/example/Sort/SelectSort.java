package com.nokia.example.Sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by YLongYao on 2016/10/13.
 */
public class SelectSort {

    private void selectSort(Integer[] arr){
        int index;
        for(int i =0;i<arr.length;i++){
            index = i;
            for(int k =i+1 ; k < arr.length; k++){
                if(arr[index] > arr[k])
                    index = k;
            }
            if(i != index){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
    }

    @Test
    public void SelectSortTest(){
        Integer[] arr = {8,6,4,9,74,25,1,3,5,28,35,0,22,2,7,10,26,29};
        System.err.println("before:"+ Arrays.asList(arr));
        selectSort(arr);
        System.err.println(" after:" + Arrays.asList(arr));
    }

}
