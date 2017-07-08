public class Product {
	
	public static void shakerSort(int [] input){
		
		boolean sorted = true;
		for(int i = 0; i < input.length - 1; i++){
			/*Compares current value with next value if current
			 * value is higher then swap values
			 */
			if(input[i] > input[i + 1]){
				int temp = input[i + 1];
				input[i + 1] = input[i];
				input[i] = temp;
				sorted = false;
				
			}	
		}
		//Traverses the list backwards
		for(int i = input.length - 1; i != 0; i--){
			/*If current value is less than the previous value
			 * then swap values
			 */
			if(input[i] < input[(i-1)]){
				int temp = input[i-1];
				input[i-1] = input[i];
				input[i]= temp;
				sorted = false;
			}
			
		}
		/*If the list isn't sorted then continue running bubbleSort
		 * recursively.
		 */
		if(!sorted){
			shakerSort(input);
		}
		//if the list is sorted then stop sorting
		else {
			return;
		}
	
	}
	public static int maxProductFinder(int [] a){
		
		shakerSort(a);	
		int size = a.length;
		System.out.print("The sorted array is: ");
		for(int i = 0; i < a.length;i++){
			System.out.print(a[i] + ", ");
		}
		System.out.println(" ");
		
		int maxProduct = a[size - 1] * a[size - 2] * a[size -3];
		
		return maxProduct;
	}
	
	public static void main(String[]args){
			
		int[] a = {-6, -8, 4, 2, 5, 3, -1, 9 , 10};
		
		System.out.println("The max product is: " + maxProductFinder(a));
		
	}
	
}
