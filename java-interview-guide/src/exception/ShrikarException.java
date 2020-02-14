package exception;

@SuppressWarnings("serial")
public class ShrikarException extends Exception {
	public ShrikarException(String s) {
		super(s);
	}

	public static void main(String[] args) {
		try{ 
            // Throw an object of user defined exception 
            throw new ShrikarException("GeeksGeeks"); 
        } 
        catch (ShrikarException ex) { 
            System.out.println("Caught"); 
            // Print the message from MyException object 
            System.out.println(ex.getMessage()); 
        } 
	}
}
