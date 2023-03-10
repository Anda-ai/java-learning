/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revision1_Arrays;

/**
 *
 * @author SHOLOGUA
 */
import java.util.Random;

public class main {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = new int[10];
        arr = fillArrayWithRandom(arr);
        printArray(arr);
        System.out.println("bigger number: "+getBiggerValue(arr));
        System.out.println("positiion of bigger number: "+getBiggerIndex(arr));
    }
    
    public static int[] fillArrayWithRandom(int[] array){
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }
        return array;
    }
    
    public static void printArray(int arrayToBePrinted[]){
        for(int i = 0; i < arrayToBePrinted.length; i++){
            System.out.println(i+"] = "+arrayToBePrinted[i]);
        }
    }
    
    public static int findIndexOfValue(int[] arrayToBeSearched, int valueToSearchFor){
        int output = 0;
        for(int i =0; i < arrayToBeSearched.length; i++){
            if( arrayToBeSearched[i] == valueToSearchFor){
                output = i;
                break;
            }
        }
       return output;
    }
    
    public static int getBiggerIndex(int[] input){
        int output = 0;
        int index = 0;
        for(int count = 0; count < input.length; count++){
            if(input[count] > output){
                output= input[count];
                index = count;
            }
        }
        return index;
    }
    public static int getBiggerValue(int[] input){
        int output = input[0];
        for(int count = 0; count < input.length; count++){
            if(input[count] > output){
                output= input[count];
            }
        }
        return output;
    }
}
