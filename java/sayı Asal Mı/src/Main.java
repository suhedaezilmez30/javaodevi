
public class Main {

	public static void main(String[] args) {
    int number=-5;
    int remainder=number% 2;
   // System.out.println(remainder);
    boolean isPrime =true;
    if(number==1) {
    	System.out.println("sayı asal degildir");
    	return;
    }
    if(number<1) {
    	System.out.println("gecersiz sayi");
    }
    		
    for(int i=2; i<number; i++);{
    	if(number%2==0) {
    		isPrime=false;
    		
    	}
    			if(isPrime==true) {
    				System.out.println("sayı asaldır");
    			} else {
    				System.out.println("sayı asal degildir");
    			}
    		
    	}
    	
    }
     
	}


