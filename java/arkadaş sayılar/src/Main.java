
public class Main {

	public static void main(String[] args) {
		//220-284
		int number=225;
		int number1=284;
		int total=0;
		int total1=0;
		
		for(int i=1; i<220; i++) {
			if(number%i==0) {
				total=total+i;
			}
			
		}
	for(int i=1; i<284; i++) {
		if(number1%i==0) {
			total1=total1+i;
		}
	}
	
		if(number==total1 && number1==total) {
			System.out.println("arkadaş sayı");
		}
		else {
			System.out.println("arkadaş sayı değildir");
		}
	}

}
