package test.testServiceLookup;

public class Main {
	
	public static void main(String[] args){
		MyServiceProvider myServiceProvider = new MyServiceProvider();		
		System.out.println("x: " + myServiceProvider.getX());		
		myServiceProvider.myCustomMethod("Hello, World!");		
	}
	
}
