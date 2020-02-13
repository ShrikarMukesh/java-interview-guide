package singleton_RomanianCoder;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		EagerSingleton es1 = EagerSingleton.instance();
		EagerSingleton es2 = EagerSingleton.instance();
		boolean areEqual_E = es1 == es2;
		System.out.println("Eager singleton comprison "+ areEqual_E);

		LazySingleton ls1 = LazySingleton.instance();
		LazySingleton ls2 = LazySingleton.instance();
		boolean areEqual_L = ls1 == ls2;
		System.out.println("Lazy singleton comprison "+areEqual_L);

		LazyFastSingleton lfs1 = LazyFastSingleton.getInstance();
		LazyFastSingleton lfs2 = LazyFastSingleton.getInstance();
		boolean areEqual_LF = lfs1 == lfs2;
		System.out.println("Lazy Fast singleton comprison "+areEqual_LF);

		Constructor<EagerSingleton> constructor = EagerSingleton.class.getDeclaredConstructor(new Class[0]);
		constructor.setAccessible(true);
		EagerSingleton es3 = (EagerSingleton)constructor.newInstance();
        boolean areReflectionEqual = es1 == es3;
        System.out.println(areReflectionEqual);
        
        EnumSingleton enums1 = EnumSingleton.INSTANCE;
        EnumSingleton enums2  = EnumSingleton.INSTANCE;
        System.out.println(enums1 == enums2);
	}
}
