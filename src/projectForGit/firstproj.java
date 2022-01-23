package projectForGit;

public class firstproj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("helloooo1");
		for(int i=0; i < 10; i++){
			System.out.println(i + " changes added");
		}
		int[] array = new int[7];
		array[0] = 2;
		array[1] = 4;
		array[2] = 10;
		array[3] = 12;
		array[4] = 5;
		array[5] = 7;
		array[6] = 3;
		
		int small =array[0];
		for(int  i = 0;i < array.length; i++) {
			if(array[i] < small) {
				small = array[i];
			}		
		}
		System.out.print("smallest: " + small);
		int large = array[0]; 
		for(int i = 0;i < array.length; i++) {
			if(array[i] > large) {
				large = array[i];
			}	
			
		}
		System.out.println("Largest : "+ large + " this is correct");
		

		
	}

}
