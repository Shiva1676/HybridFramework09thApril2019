/**
 * 
 */
package testCases;

/**
 * @author Lenovo
 *
 */
public class Sorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2, 9, 6, 4, 1};
		
		int temp;
		
		for(int i=0; i<arr.length; i++){
			
			for(int j=1; j<arr.length-1; j++){
				
				if(arr[i]<arr[j]){
					
					
					arr[i] = arr[j];
				}
			}
		}
		
		for(int i=0; i<arr.length; i++){
			
			System.out.println(arr);
		}
	}

}
