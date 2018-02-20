package test.testServiceLookup;

import java.util.ServiceLoader;

public class MyServiceProvider implements MyService {
	
	private ServiceLoader<MyService> myServiceLoader;
	
	public MyServiceProvider(){
		this.myServiceLoader = ServiceLoader.load(MyService.class);
	}
	
	@Override
	public int getX(){
		for(MyService myService : myServiceLoader){
			int result = myService.getX();
			if(result!=-1){
				return result;
			}
		}
		return -1;
	}
	
	@Override 
	public void myCustomMethod(String string){		
		for(MyService myService : myServiceLoader){			
			try {				
				myService.myCustomMethod(string);	
				return;
			} catch(UnsupportedOperationException e){				
				e.printStackTrace();
			}			
		}				
	}
	
}



