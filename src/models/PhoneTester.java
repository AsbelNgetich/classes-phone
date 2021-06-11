package models;

public class PhoneTester {

	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("s9",99,"Verizon","Ring Ring Ring!");
		IPhone iphoneTen = new IPhone ("X", 100, "AT&T", "Zing");
		
		//displays the name and company
		s9.displayInfo();
		
		//displays ring
		System.out.println(s9.ring());
		
		//displays locking type
		System.out.println(s9.unLock());
		
		System.out.println("..");
		
		//displays the name and company
		iphoneTen.displayInfo();
		
		//displays ring
		System.out.println(iphoneTen.ring());
		
		//displays locking type
		System.out.println(iphoneTen.unLock());
		

	}

}
