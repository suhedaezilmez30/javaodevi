package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'A';
		switch(grade) {
		case 'A' :
		System.out.println("mükemmel : Geçtiniz ");
		break;
		
		case 'B' :
		System.out.println("çok Güzel : Geçtiniz ");
		break;
		
		case 'C' :
		System.out.println("iyi : Geçtiniz ");
		break;
		
		case 'D' :
		System.out.println("fena Değil : Geçtiniz ");
		break;
		
		default:
			System.out.println("geçersiz not girdiniz");
		}

	}

}
