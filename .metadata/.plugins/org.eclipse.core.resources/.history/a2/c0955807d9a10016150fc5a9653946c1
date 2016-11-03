public class ArraysLab3 {

	public static void main(String[] args) {
		int[] a1 = {5, 10, 15, 20, 25, 30, 35, 40};
		int[] a2 = {7, 14, 21, 28, 35, 42, 49, 56};
		int appendnum = 200;
		int removeidx = 5;
		
		int[] sumArr = sum(a1, a2);
		int[] appendArr = append(a1, appendnum);
		int[] removeArr = remove(a2, removeidx);
		int sumOfEvens = sumEven(appendArr);
		rotateRight(a1);
		
		
	}
	
	public static int[] sum(int[] arr1, int[] arr2){
		int[] arr3 = new int[arr1.length];
		for(int i = 0; i<arr1.length; i++){
			arr3[i] = arr1[i] + arr2[i];
		}
		return arr3;
	}
	
	public static int[] append(int[] arr, int num){
		int[] arr2 = new int[arr.length+1];
		for(int i = 0; i < arr.length; i++){
			arr2[i] = arr[i];
		}
		arr2[arr.length]=num;
		return arr2;
	}
	
	public static int[] remove(int[] arr, int idx){
		int[] arr2 = new int[arr.length-1];
		for (int i = 0; i < idx; i++){
			arr2[i] = arr[i];
		}
		for (int i = idx+1; i < arr. length; i++){
			arr2[i-1] = arr[i];
		}
		return arr2;
	}
	
	public static int sumEven(int[] arr){
		int sum=0;
		for (int i = 0; i < arr.length; i+=2){
			sum = sum + arr[i];
		}
		return sum;
	}
	
	public static void rotateRight(int[] arr){
		int last = arr[arr.length-1];
		for (int i = 1; i < arr.length; i++){
			arr[i] = arr[i-1];
		}
		arr[0] = last;
		return;
	}
}
