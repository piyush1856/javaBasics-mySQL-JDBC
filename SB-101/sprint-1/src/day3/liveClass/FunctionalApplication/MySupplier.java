package day3.liveClass.FunctionalApplication;

import java.util.function.Supplier;

public class MySupplier implements Supplier<String>{

	@Override
	public String get() {
		
		return "This message from the external class";
	}
	

}
