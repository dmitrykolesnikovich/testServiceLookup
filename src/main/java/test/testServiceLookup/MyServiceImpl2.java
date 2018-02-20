package test.testServiceLookup;

public class MyServiceImpl2 implements MyService {
	
	@Override
	public int getX(){
		return 100;
	}
	
	@Override 
	public void myCustomMethod(String string){				
		throw new UnsupportedOperationException("println");		
	}
	
}
