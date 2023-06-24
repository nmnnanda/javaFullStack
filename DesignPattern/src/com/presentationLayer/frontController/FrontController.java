 package com.presentationLayer.frontController;

public class FrontController {
	private ViewHandler handler;
	
	FrontController(){
		handler = new ViewHandler();
	}
	
	public void trackRequest(String request){
		System.out.println("Request Tracked :"+request);
		handler.dispatch(request);
	}

}
