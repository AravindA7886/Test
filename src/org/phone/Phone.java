package org.phone;

public class Phone {
	public void phoneInfo(int iemi) {
		System.out.println(iemi);
	

	}
	public void phoneInfo(String name) {
		System.out.println(name);

	}
	
	public void phoneInfo(String modelname,int modelno) {
		System.out.println(modelname+modelno);

	}
	public static void main(String[] args) {
		Phone ph=new Phone();
		ph.phoneInfo(12445098);
		ph.phoneInfo("Redmi");
		ph.phoneInfo("note 5", 5);
		
		
	}

}
