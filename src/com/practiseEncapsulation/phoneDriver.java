package com.practiseEncapsulation;

public class phoneDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mobile m1=new mobile("Apple","pro");
		m1.setsim1(new sim1("jio",86520380));
		m1.setsim2(new sim2("vi",5653255));
		m1.printsmobiledetails();
		
		sim1 s=new sim1("jio",86520382);
		System.out.println(s);
		
		
		
		
	}

}
