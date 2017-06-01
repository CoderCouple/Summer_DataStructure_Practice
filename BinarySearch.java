
public class BinarySearch {

	static int number_search = 7;
	static int number_list[] = { 3, 7 , 7, 7, 17, 300, 605 };

	public static int binarySearch(int myArray[], int n) {
		int start = 0;
		int end = myArray.length - 1;
		int mid = (start + end) / 2;

		// System.out.println("Inside binarySearch 1");
		while (start <= end) {
			if (n == myArray[mid])
				return mid;
			if (n > myArray[mid]) {
				start = mid + 1;
				mid = (start + end) / 2;
			} else if (n < myArray[mid]) {
				end = mid - 1;
				mid = (start + end) / 2;
			}

		}
		return -1;
	}

	public static int binarySearch(int myArray[], int n, int startNum, int endNum) {
		if(startNum>endNum)
			return -1;
		
		int midNum = (startNum + endNum) / 2;

		if (n == myArray[midNum])
			return midNum;
		
		if (n < myArray[midNum])
			return binarySearch(myArray, n, startNum, midNum-1);
		else 
			return binarySearch(myArray, n, midNum+1, endNum);
		
	}

	public static void main(String[] args) {

		int index;
		System.out.println("This is my first DataStructure Program..!!!");
		index = binarySearch(number_list, number_search);
		System.out.println("This is the index of the searched element :" + index);
		index = binarySearch(number_list, number_search, 0, number_list.length - 1);
		System.out.println("This is the index of the searched element through recursion :" + index);

	}

}
