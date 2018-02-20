package test.testServiceLookup;

public class MyServiceImpl implements MyService {
	
	@Override
	public int getX(){
		return -1;
	}
	
	@Override 
	public void myCustomMethod(String string){		
		System.out.println(string);		
	}
	
}
