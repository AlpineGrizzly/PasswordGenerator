package class10;

import java.util.Scanner;

public class Class10 {

	public static void main(String[] args) {
		// Create an array of ints containing 3, 5, 18, 24
		int[] myArray = {3, 5, 18, 24};
		
		// Print each element in an array
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
		// Create a new empty array with 5 slots. Fill it with
		// the same values as myArray, and fill the extra last
		// slot with 30.
		int[] array2 = new int[5];
		array2[0] = 3;
		array2[1] = 5;
		array2[2] = 18;
		array2[3] = 24;
		array2[4] = 30;
		
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		// Declare an array of Strings. It works pretty much the
		// same as the int array.
		String[] strArray = { "One", "Two", "Three" };
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		for (String i: strArray) {
			System.out.println(i);
		}
		
		// Create an empty array with 5 slots and fill it with
		// random integers.
		int[] randArray = new int[5];
		randArray[0] = (int)(Math.random() * 10);
		randArray[1] = (int)(Math.random() * 10);
		randArray[2] = (int)(Math.random() * 10);
		randArray[3] = (int)(Math.random() * 10);
		randArray[4] = (int)(Math.random() * 10);
		
		// Fill the array with random values using a loop. It's
		// doing the same thing as the code above, but with
		// less code.
		for (int i = 0; i < randArray.length; i++) {
			randArray[i] = (int)(Math.random() * 10);			
		}
		
		// There's another kind of for-loop that can be useful
		// when accessing the values in an array. You give it
		// a variable with the same type as the array elements,
		// and the loop will assign one item from the array to
		// that variable for each pass of the loop. Since you
		// don't have an array index you can't update the array,
		// but this kind for loop is compact and is good for
		// displaying or accessing array values.
		for (int i: randArray) {
			System.out.println(i);
		}
		
		// Password generator
		// Ask the user for a password length.
		// Generate that many random lowercase characters.
		// Stick them in an array.
		// Print out the generated password.
		// You can convert an array of characters into a string with
		//    String str = new String(chars);
		
		// Example output:
		//   Length> 5
		//   Password: azytx
		
		Scanner in = new Scanner(System.in);
		System.out.print("Length> ");
		int len = in.nextInt();
		in.close();
		
		// Create an array to store len characters
		char[] chars = new char[len];
		
		for (int i = 0; i < chars.length; i++) {
			chars[i] = (char)('a' + (Math.random() * 26));			
		}
		
		System.out.println("Password: " + new String(chars));
		
		// Copy an array
		// First, remember that the two arrays must be the same length. Then
		// just increment an index and use it to assign the element in
		// slot 'i' of one array to slot 'i' in the other array.
		char[] chars2 = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			chars2[i] = chars[i];
		}
		
		System.out.println("Password copy: " + new String(chars2));	
		
		
		// Check if two arrays are equal
		// First, verify that they're the same length.
		// Next, compare the elements in each corresponding slot in the
		// arrays. For example, the elements in slot 0 in each array should
		// be the same, and the elements in slot 1 should be the same, etc.
		boolean notEqual = false;
		if (chars2.length != chars.length) {
			notEqual = true;
		} else {
			for (int i = 0; i < chars.length; i++) {
				if (chars2[i] != chars[i]) {
					notEqual = true;
					break;
				}
			}
		}
		System.out.println(notEqual ? "Not equal" : "Equal");
		
		// Ask the user for two strings
		// Convert them to char arrays and check if they're equal
		// To convert string to a char array:
		//    String myString = "some string";
		//    char[] chars = myString.toCharArray();
		
		Scanner in2 = new Scanner(System.in);
		System.out.print("String 1> ");
		String str1 = in2.next();
		System.out.print("String 2> ");
		String str2 = in2.next();
		in2.close();
		
		// String.toCharArray() will return the characters of a
		// string as a char[]. In other words, "testing".toCharArray()
		// will give you {'t', 'e', 's', 't', 'i', 'n', 'g'}.
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		boolean notEqual2 = false;
		if (arr1.length != arr2.length) {
			notEqual2 = true;
		} else {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					notEqual2 = true;
					break;
				}
			}
		}
		System.out.println(notEqual2 ? "Not equal" : "Equal");
	}
}