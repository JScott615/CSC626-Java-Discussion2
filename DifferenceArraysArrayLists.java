/**
Name: Jessica Scott
Date: 5/22/2025
This program is intended to demonstrate the similarities and differences between arrays and ArrayLists in Java.
This code is meant to suppliment the discussion contants located in the README.md file on GitHub.    
*/

import java.util.ArrayList; // import the ArrayList class to use ArrayLists

public class DifferenceArraysArrayLists 
{
    public static void main(String[] args) 
    {
        // With arrays and arraylists, a variable type must be declared
        // double[] array = new double[10]; // array of doubles 
        ArrayList<Double> arrayList = new ArrayList<>(); // arraylist of doubles
        

        // Notice that the array must be initialized with a size or with all data included in the array
        // int[] arrayOfIntegersWithSetSize = new int[5]; // array of integers initialized with array size
        int arrayOfIntegersWithData[] = {1, 2, 3, 4, 5}; // array of integers initialized with data

        // To delete an element from an array while maintaing the order of the other elements,
        // you must shift the elements to the left
        arrayOfIntegersWithData[2] = 0; // delete the element at index 2

        // iterate through the array starting at the newly deleted element
        for (int i = 2; i < arrayOfIntegersWithData.length - 1; i++) 
        {
            arrayOfIntegersWithData[i] = arrayOfIntegersWithData[i + 1]; // shift elements to the left
        }

        // To add an element from an array while maintaing the order of the other elements,
        // you must shift the elements to the right to make room for the new element
        // iterate through the array starting at the last element
        for (int i = arrayOfIntegersWithData.length - 1; i > 0; i--) 
        {
            arrayOfIntegersWithData[i] = arrayOfIntegersWithData[i - 1]; // shift elements to the right
        }

        // ArrayLists are dynamic and can grow and shrink in size as needed
        // Lets fill the arraylist with data up to element 4
        for (int i = 0; i < 5; i++) 
        {
            arrayList.add((double) i); // add elements to the arraylist
        }

        // To delete an element from an arraylist, you can use the remove method
        arrayList.remove(2); // remove the element at index 2

        // To add an element from an arraylist, you can use the add method
        arrayList.add(2, 2.5); // add the element 2.5 at index 2

        // Printing the array using the enhanced for loop
        System.out.print("Array values: ");
        for (int elements : arrayOfIntegersWithData) 
        {
            System.out.print(elements + " "); // print the elements of the array
        }
        System.out.println(); // print a new line

        // Printing the arraylist using the enhanced for loop
        System.out.print("ArrayList values: ");
        for (double elements : arrayList) 
        {
            System.out.print(elements + " "); // print the elements of the arraylist
        }

    }
}