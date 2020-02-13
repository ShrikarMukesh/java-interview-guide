package singleton_RomanianCoder;
//double check
public class LazyFastSingleton {
   private static LazyFastSingleton instance;
   
    private LazyFastSingleton() {
    	
    }
    public static LazyFastSingleton getInstance() {
    	if(instance == null) {
    		synchronized (LazyFastSingleton.class) {
				if(instance == null) {
					instance = new LazyFastSingleton();
				}
			}
    	}
    	return instance;
    }
}
