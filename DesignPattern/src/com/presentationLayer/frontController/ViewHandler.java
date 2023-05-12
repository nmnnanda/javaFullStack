package com.presentationLayer.frontController;

public class ViewHandler {
	private AboutPage about;
	private HomePage home;
	private ContactPage contact;
	
	
	ViewHandler(){
		about = new AboutPage();
		home =  new HomePage();
		contact = new ContactPage();
	}
	
	public void dispatch(String request){
		if(request.equalsIgnoreCase("About")){
			about.display();
		}else if(request.equalsIgnoreCase("Contact")){
			contact.display();
		}else{
			home.display();
		}
	}

}
