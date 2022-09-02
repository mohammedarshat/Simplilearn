package Day2;

public class Vowle {
	public static void main(String[] args) {
		char letter = 'b';
		char letter1 =  'i';
		new VowleIdentify().demo(letter);
		new VowleIdentify().demo(letter1);
	}
}
class VowleIdentify{
	public void demo(char letter) {
		
		switch (letter) {
		case 'a':  
			System.out.println(letter + " is  an vowle");
			break;
		case 'e':  
			System.out.println(letter + " is  an vowle");
			break;
		case 'i':  
			System.out.println(letter + " is  an vowle");
			break;
		case 'o':  
			System.out.println(letter + " is  an vowle");
			break;
		case 'u':  
			System.out.println(letter + " is  an vowle");
			break;
		default:
			System.out.println(letter + " is not an vowle");
		}
	}
}
