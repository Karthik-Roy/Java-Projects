
public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 40, count = 0;
		for (int i=1; i <= num; i++) {
			if (num % i == 0) {
				count = count + 1;
			}
			
		}
		    if(count == 2) {
		    	System.out.println("It is prime");
		    } else {
		    	System.out.println("It is not prime");
		    }
		    

	}

}
