package singleton_RomanianCoder;

public class EagerSingleton {
     private static EagerSingleton instance = new EagerSingleton();
     private EagerSingleton() {
    	 
     }
     public static EagerSingleton instance() {
		return instance;
     }
}
