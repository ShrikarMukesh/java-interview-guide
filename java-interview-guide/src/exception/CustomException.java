package exception;

@SuppressWarnings("serial")
class InValidAgeException extends Exception{
	
	public InValidAgeException(String s){  
		super(s);  
	}  
}
public class CustomException {
	static void validate(int age) throws InValidAgeException {
		if(age<18) {
			throw new InValidAgeException("your still child please wait some more time");
		}else {
			System.out.println("Your valid person for voting");
		}
	}
	public static void main(String[] args) {
		try {
			validate(18);
			validate(13);
		} catch (InValidAgeException e) {

			e.printStackTrace();
		}
	}
}
