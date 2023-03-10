/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson1_Introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author SHOLOGUA
 */
public class ArraysAndArrayLists {
    
    public ArraysAndArrayLists(){
        /*
            Arrays and ArrayLists are used to store elements and objects in a single variabe
        */
        
        //ARRAYS...................................................................................................................................
        
        //1.
            System.out.println("Student numbers:");
            //Declaration and Initialisation
            //type[] arrayName = new type[size];
            int[] StudNumArray = new int[4]; //this array will not store more than 4 values

            //assigning arrays
            StudNumArray[0] = 238332345;
            StudNumArray[1] = 238332346;
            StudNumArray[2] = 238332347;
            StudNumArray[3] = 238332348;

            for(int i = 0; i<=3; i++){
                System.out.println(StudNumArray[i]);
            }
        //2. 
            System.out.println("Class array:");
            
            //Declaration and Initialisation
            String[] classArray = {"Mellisa", "Linox", "Owethu", "Asiphe"};
            System.out.println(Arrays.toString(classArray));
            for(int i = 0; i<classArray.length; i++){
                System.out.println(classArray[i]);
            }
            
        //ARRAYLISTS | LISTS........................................................................................................................
        
        //1.
        
            //The ArrayList class is much more flexible than the traditional array. It implements the List interface to use all the methods of List Interface
            System.out.println("Class Array list:");
            
            //Declaration and Initialisation
            ArrayList<String> classArrList = new ArrayList<>();
            classArrList.add("Mellisa");
            classArrList.add("Linox");
            classArrList.add("Owethu");
            classArrList.add("Asiphe");
            System.out.println(classArrList);
            for(int i = 0; i<classArrList.size(); i++){
                System.out.println(classArrList.get(i));
            }
         //2. difference between Lists and ArrayLists
            /*
            //Perform the insert, delete, search, update operations on the objects.
            //We can implement the List interface by using the ArrayList, LinkedList, Vector, and Stack classes.
              To instantiate the List interface, we can use the following syntaxes:
            List <data-type> list1= new ArrayList();    
            List <data-type> list2 = new LinkedList();    
            List <data-type> list3 = new Vector();    
            List <data-type> list4 = new Stack(); 
            */
            
            System.out.println("Class list:");
            
            //Declaration and Initialisation
            List<String> classList = new ArrayList<>();
            classList.add("Mellisa");
            classList.add("Linox");
            classList.add("Owethu");
            classList.add("Asiphe");
            System.out.println(classList);
            for(int i = 0; i<classList.size(); i++){
                System.out.println(classList.get(i));
            }
        //ARRAY to ARRAYLISTS...........................................................................................................................
       
        //1.
                int[] StudNumArray_2 = new int[4]; //this array will not store more than 4 values

                //assigning arrays
                StudNumArray_2[0] = 238332345;
                StudNumArray_2[1] = 238332346;
                StudNumArray_2[2] = 238332347;
                StudNumArray_2[3] = 238332348;
                System.out.println("Student number list:");
                ArrayList<Integer> StudNumArrList = new ArrayList<>();
                for(int i=0; i<StudNumArray_2.length;i++){
                  StudNumArrList.add(StudNumArray_2[i]);
                } 
                System.out.println(StudNumArrList);
        
        //DIMENSIONAL ARRAYS.............................................................................................................................
            //1. 
            System.out.println("Todays Attendees:");
            String[][] fullnamesList = {
                                        {"Mellisi","Ncube"},
                                        {"Linox", "Maronking"},
                                        {"Owethu", "Mthunzi"},
                                        {"Asiphe", "Mthotho"}
                                    };
            for(int i=0; i<fullnamesList.length;i++){
                for(int j=0; j<fullnamesList[i].length;j++){
                  System.out.printf(fullnamesList[i][j]+" ");
                }
                System.out.printf("\n");
            }    
    }
}