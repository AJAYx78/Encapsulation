package com.practiseEncapsulation;

public class sim1 {
	private String s_provider;
	private long cno;

	
	sim1 (String s_provider , long cno)
	{
		this.s_provider=s_provider;
		this.cno=cno;
	}
	
	public String gets_provider() {
		return s_provider;
	}
	
	public void sets_provider(String s_provider)
	{
		this.s_provider=s_provider;
		
	}	
	
	public  long getcno() {
		return cno;
	}
	
	public void setcno(long cno)
	{
		this.cno=cno;
	}
	
	
	public void printsim1details()
	{
		System.out.println("______Sim 1 ______________");
		System.out.println("sim1="+s_provider);
		System.out.println("sim 1 number "+cno);
	
	}
	
	
	
}

