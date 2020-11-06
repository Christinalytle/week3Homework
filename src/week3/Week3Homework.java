package week3;

import java.util.Arrays;

public class Week3Homework {
	//Arrays 
	public static int [] ages = {3,9,23,64,2,8,28,93,25,80};
	public static String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	public static int[] nameLengths = arrayLengths(names); 
	public static double [] numbers = {3.4, 9.9, 10.3, 8.1, 9.2};
	public static double [] numbers2 = {6.6, 8.8, 9.9, 10.4, 11.5, 20};
	
	public static void main(String[] args) {
	
		System.out.println("#1a");
		System.out.println(ages[ages.length -1] - ages[0]);
		
		System.out.println("\n#1c");
		System.out.println(calculateAverage(ages));	
		
		System.out.println("\n#2a");
		System.out.println(averageLetterNumber(names));
		
		System.out.println("\n#2b");
		String namesTogether = String.join(" ", names);
		System.out.println(namesTogether);
		
		System.out.println("\n#3");
		System.out.println("To find last element of any array it is: nameOfArray[nameOfArray.length -1]");
		
		System.out.println("\n#4");
		System.out.println("To find first element of any array it is: nameOfArray[0]");
		
		System.out.println("\n#5");
		System.out.println("New nameLengths array is  " + Arrays.toString(nameLengths));
		
		System.out.println("\n#6");
		System.out.println(calculateSum(nameLengths));
		
		System.out.println("\n#7");
		System.out.println(multiplyString("Good Morning ", 4));
		
		System.out.println("\n#8");
		String firstName = "Christina";
		String lastName = "Lytle"; 
		System.out.println(createFullName(firstName, lastName));
		
		System.out.println("\n#9");
		System.out.println(returnTrueIfOver100(ages));
		
		System.out.println("\n#10");
		System.out.println(averageInDoubles(numbers));
		
		System.out.println("\n#11");
		boolean result = averageOneIsGreaterThanTwo(numbers, numbers2);
		System.out.println(result);
		
		System.out.println("\n#12");
		boolean isHotOutside = true; 
		double moneyInPocket = 20; 
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		System.out.println("\n#13");
		System.out.println(getMax(ages));
		System.out.println(getMin(ages));
		
		
		}

	//method to calculate average of all numbers in array
	public static int calculateAverage (int[] numbers) {
		int sum =0;
		for (int number : numbers) {
			sum += number;
		}
		return sum / numbers.length; 
	}
	
	//method to calculate the average numbers in a word in a String Array 
	public static int averageLetterNumber (String [] names) {
		int total = 0;
		for (String name : names) {
			total += name.length();
	}
		return total / names.length;
		
	}
	
	//method for Array with Name Lengths 
	public static int [] arrayLengths(String[] names) {
		int[] lengthsOfNames = new int[names.length];
		for(int i = 0; i < names.length; i++) {
			String name = names[i];
			lengthsOfNames[i] = name.length();
		}
		return lengthsOfNames;
	}
	
	//method to calculate sum of all numbers in array 
		public static int calculateSum (int[] numbers) {
			int sum = 0; 
			for (int number : numbers ) {
				sum += number;
			}
			return sum; 
		}
		
	//method to have a string concatenate itself number of times 
		public static String multiplyString(String word, int number) {
			String output = ""; 
			for (int i=0; i < number; i++) {
				output += word; 
			}
			return output; 
		}
		
	//method to create a full name with a space 
		public static String createFullName (String x, String y) {
			return x + " " + y;
	}
	
	//method to check if sum of numbers is less than 100
	public static boolean returnTrueIfOver100 (int[] numbers) {
		int total = 0;
		for (int i = 0; i< numbers.length; i++) { 
			int number = numbers[i];
			total += number;
		}	
		
		return total > 100; 
	}
	
	//method to calculate average of all double numbers in array
	public static double averageInDoubles (double[] numbers) {
		double sum =0;
		for (double number : numbers) {
			sum += number;
			}
		return sum / numbers.length; 
		}
		
	//method that takes two arrays and returns true if first array average is > than secon array
	public static boolean averageOneIsGreaterThanTwo (double[] one, double[]  two) {
		return average(one) > average(two);
		}	
		public static double average(double[] array) {
			double total = 0;
			for (double arra : array) {
				total += arra;
			}
			return total / array.length;
		}
		
	//method willBuyDrink
		public static boolean willBuyDrink (boolean a, double b) {
		return (a== true) && (b >10.50);
		}
		
	//method for getting the maximum value in an array 
		public static int getMax(int[] inputArray) {
			int maxValue = inputArray[0]; 
			for (int i=0; i< inputArray.length; i++) {
				if(inputArray[i] > maxValue) {
					maxValue = inputArray[i];
				}
			}
			return maxValue; 
		}
		
	//method for getting the minimum value in an array 
		public static int getMin(int[] inputArray) {
			int minValue = inputArray[0]; 
			for (int i=0; i< inputArray.length; i++) {
				if(inputArray[i] < minValue) {
					minValue = inputArray[i];
				}
			}
			return minValue; 
		}
		//I created methods to find the min and max of a value of an array because it might be
		//useful to know the number range you are working with. 
		
}


