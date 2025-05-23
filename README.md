# CSC626-Java-Discussion3
Repository for Intro to Java classwork

Arrays and ArrayLists are an essential part of Java programs that are used to store a series of data points of the same type. Whether storing user input, numerical series, or separate strings of text, both arrays and array lists are an ideal method to store multiple data points without requiring a different variable in the program for each one. With both, a variable type must be designated when the array or array list is initialized. The main difference between arrays and array lists is that the size of an array must be declared at the time the program is compiled, while the size of an array list can change after the program has been compiled and run.
 
Arrays are rigid in the sense that they cannot change in size once the program runs. This means that the size of the array must be declared when the array is initialized. You are able to either set a size or you can initialize the array with the data set that the array will contain. Arrays also differ from array lists in the manipulation of data contained within the array. To delete a value in an array, you can either swap the value with the last element in the array and delete the last element, or you can delete the element and iterate through the loop to move values up one element. Adding a value is similar. Values can be added to the end of an array, or you can iterate through the array in reverse to move each value down one array element to make space in the correct location for the new value.
 
Array lists are more flexible than arrays. The array list can change size after the program has been run. Array lists are best used for user input of unknown size, as the array list can grow to fit the program's needs. To remove a value from an ArrayList, the .remove() method will remove the value in the designated element while retaining the ArrayList value order. To add a value, the .add(element value, data to store) will add the data to a designated element location, inserting the data and retaining the element data order. 
 
It is important to consider the data being used and the actions being performed in your program when deciding whether to use an array or an array list. Knowing the differences between the two can save time and debugging headaches.  

Resources:
Horstmann, C. S. (2017). Big Java Late Objects. Wiley.

‌
