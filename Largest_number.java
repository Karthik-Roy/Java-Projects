
public class Largest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = {10,5,8,20,45,50,9,4,3};
		int largest = 0;
		
		for(int i = 0 ; i < n.length; i++ ) {
			if (n[i] > largest) {
				largest =  n[i];
			}
			
		}
		System.out.println("Largest is " + largest);

	}

}
