/**
 * Creates several array methods
 * This program is a collection of array practice skills
 * APCS PS04: Arrays Practice
 * 10/31/18
 * @author Cade Boggan
 */
import java.util.Arrays;
public class arrayPractice {

	// returns the last index's of the array
	//have a for loop that iterates through the array
	//set variable equal to element number if parameter integer is found
	//replace this number if the parameter is encountered again
	public static int arr[] = new int [] {12, 37, 98, 20, 05, 21, 12, 17, 04, 12, 04, 04};
	public static int arrclone[] = new int [] {12, 37, 98, 100, 20, 05, 04, 21, 17, 04, 12, 19};
	static String s = "The young man walked down the street";
	public static int lastNum = -1;
	public static int lastIndexOf(int num, int[] arr) {


		for(int i = 0; i <= arr.length - 1; i++) {
			if(arr[i] == num) {
				lastNum = i;
			}
		}
		return lastNum;
	}
	//takes in the value 20 and prints out the array index of it

	// find the max value of the array and subtract the min value of the array
	//to get max iterate through array and see if any values are bigger than the starting value
	//if so make this the new max starting variable
	// min is same as previous two lines except if smaller than starting minimum
	public static int range( int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		int theRange = (max - min) + 1;
		return theRange;
	}
	//increase counter variable if number is between parameters
	public static int countInRange(int min, int max, int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] <= max && arr[i] >= min) {
				count++;
			}
		}
		return count;
	}
	//makes a start variable which is the first value of the array
	//makes a counter variable
	//makes a boolean variable that will be used to return true or false
	//for loop iterates through array and increase counter variable if start variable is greater than the 
	//next number
	//by the end if the counter has not changed the boolean variable returns true

	public static double arrDouble[] = new double[] {3.4, 3.9, 2.9, 8.7, 11.7, 15.6, 9.0};
	public static double arrDouble2[] = new double[] {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
	public static boolean isSorted (double[] arrDouble) {
		double start = arrDouble[0];
		int count = 0;
		boolean sortedYN = false;
		for (int i = 0; i < arrDouble.length; i++) {
			if (start > arrDouble[i]) {
				count++;
				start = arrDouble[i];
			}
		}
		if (count == 0) {
			sortedYN = true;
		}
		return sortedYN;
	}

	//if a element in the array is equal in value to another array
	//two loops
	//first loops through each element
	//second on the inside checks if repeats occur
	//have a maxMode variable
	//to get lower value if two modes
	//make if statement that if the counts are the same only continue if value is lower
	public static int mode(int[] arr) {
		int bigCount = 0;
		int mode = arr[0];
		for(int o = 0; o < arr.length; o++) {
			int initial = arr[o];
			int count = 0;

			for (int i = 0; i < arr.length; i++) {
				if(initial == arr[i]) {
					count++;
				}
				if((count > bigCount) && (initial < mode)) {
					mode = arr[i];
					bigCount = count;
				}
				

			}

		}
		return mode;
	}
	//basically follow the instructions
	//if everything needs to be added use a for loop
	//sum loops should have a sum variable that increase by the array at i element
	public static double stdev(int []arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		// sum is 230
		double mean = sum / arr.length;

		double newSum = 0;
		for (int o = 0; o < arr.length; o++) {
			newSum += ((arr[o] - mean) * (arr[o] - mean));
		}
		double newNum = newSum / (arr.length -1 );
		double SD = Math.sqrt(newNum);
		return SD;
	}
	//if k = 0 return largest number, k = 1 return second largest number 
	//sort the array
	//then call element at array.length - k
	public static int a[] =   new int [] {12, 37, 98, 20, 05, 04, 21, 17, 04, 12};
	public static int kthLargest(int k, int []a) {
		Arrays.sort(a);
		int kLargest  = a[a.length - (k + 1)];
		return kLargest;
	}
	public static int minGap( int []arr) {
		int Gap = (arr[1] - arr[0]);

		for(int i = 0; i < arr.length - 1; i++) {

			if((arr[i+1] - arr[i]) < Gap){
				Gap = (arr[i+1] - arr[i]);
			}
		}
		if (arr.length < 2) {
			return 0;
		}
		else{
			return Gap;
		}
	}
	//counter increase every time modulus of array element is 0
	// to turn counter into percent multiple by 100 and divide by array length
	public static double percentEven (int []arr) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i]%2 == 0) {
				count++;
			}
		}
		int length = arr.length;
		double percent = (count * 100) / length;

		if(count == 0 || arr.length == 0) {
			return 0;
		}
		else{return percent;
		}
	}
	public static int[] arrRepeat = new int [] {1,2,3,4,5,6,7}; //should test true
	//might need for for loops
	// first for loop iterate through loop
	//second for loop check if array at i element is equal to the current array element of first loop
	public static boolean isUnique (int [] arr) {

		int start = arr[0];
		boolean unique = true;
		for(int o = 0; o < arr.length; o++) {
			start = arr[o];
			for(int i = o + 1; i < arr.length; i++) {
				if (start == arr[i]) {
					unique = false;
				}
			}
		}
		return unique;
	}
	// sort array (makes this much easier)
	//use some code from minGap method
	// gap between parameter price and array at i element
	//gap cannot be less than 0
	// for loop that iterates through and finds gaps of all
	public static int priceIsRight (int [] arr, int price) {
		Arrays.sort(arr);
		int Gap = (price - arr[0]);
		int rightPrice = -1;

		for(int i = 1; i < arr.length; i++) {
			if (price - arr[i] >= 0) {
				if((price - arr[i]) <= Gap){
					Gap = price - arr[i];
					rightPrice = arr[i];
				}
			}
		}
		return rightPrice;
	}
	//counter increases every instance that the array at element i is more than the previous element
	//have a second counter variable
	//counter stops if next element is smaller
	public static int longestSortedSequence( int arrclone[]) {
		int start = arrclone[0];
		int count  = 1;
		int count1 = 0;


		for(int i = 0; i < arrclone.length; i++) {

			if (start < arrclone [i]) {
				count ++;
				start = arrclone[i];
				if(count >= count1) {
					count1 = count;
				}
			}
		}
		if (arrclone.length == 0) {
			return 0;
		}
		else{
			return count;
		}
	}
	public static int arrSmall[] = new int [] {20, 05}; // should return true
	
	//have a boolean variable set to true
	//becomes false if
	public static boolean contains (int [] arrclone, int [] arrSmall ) {
		boolean containTrue = true;
		int start = arrSmall[0];
		//finds value of arrclone where arrSmall starts
		for(int z = 0; z < arrclone.length; z++) {
			if (arrclone[z] == arrSmall[0]) {
		for(int o = z; o  < (arrSmall.length + z); o++) {
			start = arrclone[o];
			for(int i = 0; i < arrSmall.length; i++) {
				if (arrSmall[i] != start) {
					containTrue = false;
				}
			}
		}
			}
		}
		return containTrue;
	}
	//make a new array thats half the length of the array parameter
	//make each element of the array equal to the sum of a pair
	public static int [] collapse (int [] arrclone) {
		int aSum[] =   new int [(arrclone.length) / 2]; 
		for(int i = 0; i < ((arrclone.length) / 2); i ++ ) {
			aSum[i] = arrclone[i + i] + arrclone[(i+i) + 1];
		}
		return aSum;
	}
	//make a new array with length equal to the length of the two parameter arrays combined
	//two for loops
	//first makes each element of the new array equal to the first parameter array
	//second loop makes the following elements the elements of the second array parameter
	//second loop should add elements in addition to the length of the first parameter array
	public static int[] append(int[] arr, int [] arrclone) {
		int aComb[] = new int[arr.length +arrclone.length];
		for (int i = 0; i < arr.length; i++) {
			aComb[i] = arr[i];
		}
		for (int i = 0; i < arrclone.length; i++) {
			aComb[i + arr.length] = arrclone[i];
		}
		return aComb;
	}
	
	//have counter variables for each vowel
	//create an array with each vowel counter variable as an element
	//split up the string into an array by letter
	//increase the counter vowels each time that vowel is encountered in the string array
	public static int[] vowelCount(String s) {
		String[] aVowel = s.split("");
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;

		for(int x = 0; x < aVowel.length; x++) {
			if(aVowel[x].equals("a")) {
				a++;
			}
			if(aVowel[x].equals("e")) {
				e++;
			}
			if(aVowel[x].equals("i")) {
				i++;
			}
			if(aVowel[x].equals("o")) {
				o++;
			}
			if(aVowel[x].equals("u")) {
				u++;
			}

		}
		int aCount[] = new int[] {a,e,i,o,u};
		return aCount;
	}
	public static void main (String[] args ) {
		int test = lastIndexOf(20, arr);
		System.out.println("The last index of 20 is " + test);
		int testRange = range(arr);
		System.out.println("Range is " + testRange);
		int testCountInRange = countInRange(01, 33, arr);
		System.out.println("The number of values between 1 and 33 is " + testCountInRange);
		boolean testIsSorted = isSorted(arrDouble);
		System.out.println("Is the array sorted: " + testIsSorted); /*if all instances of arrDouble are
		 * replaced with arrDouble2, then true should be returned */
		int testMode = mode(arr);
		System.out.println("The mode is " + testMode);
		double teststdev = stdev(arr);
		System.out.println("The standard deviation is " + teststdev);
		int testkLargest = kthLargest(1, a);
		System.out.println("The element such that k elements have greater or equal value is " + testkLargest);
		int testMinGap = minGap(arr);
		System.out.println("The smallest gap is " + testMinGap);
		double testPercent = percentEven(arr);
		System.out.println("The percent of even numbers is " + testPercent + "%");
		boolean testUnique = isUnique(arr);
		System.out.println("The values of the array are unique: " + testUnique);
		int testPrice = priceIsRight(arr, 30);
		System.out.println("The closest bid is " + testPrice);
		int testCount = longestSortedSequence(arrclone);
		System.out.println("The longest sorted sequence is " + testCount);
		boolean testContains = contains(arrclone, arrSmall);
		System.out.println("The second list is contained within the first list: " + testContains);
		int[] testcollapse = collapse(arrclone);
		System.out.println("The sum array is " + java.util.Arrays.toString(testcollapse));
		int[] testappend = append(arr, arrclone);
		System.out.println("The combined array is " + java.util.Arrays.toString(testappend));
		int[] testVowel = vowelCount(s);
		System.out.println("The count of vowels is " + java.util.Arrays.toString(testVowel));

	}
}
