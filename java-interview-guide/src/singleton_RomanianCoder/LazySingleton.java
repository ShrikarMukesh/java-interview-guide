package singleton_RomanianCoder;

public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton() {
    	
    }
    public static synchronized LazySingleton instance() {
    	if(instance == null) {
    		instance = new LazySingleton();
    	}
    	return instance;
    }
    
}
