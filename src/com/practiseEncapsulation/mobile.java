package com.practiseEncapsulation;

public class mobile {
	private String brand;
	private String name;
	private sim1 s1;
	private sim2 s2;
	
	
	mobile(String brand,String name)
	{
		this.brand=brand;
		this.name=name;
	}
	
	public String getbrand()
	{
		return brand;
	}
	public void setbrand(String  brand ) {
		this.brand=brand;
	}
	
	public String getname() {
		return  name;
		
	}
	
	public void setname(String name)
	{
		this.name=name;
		
	}
	
	
	public sim1 gets1()
	{
		return s1;
	}
	public void  setsim1(sim1 s1)
	{
		this.s1=s1;
	}
	
	public  sim2 gets2() {
		return s2;
	}
	 public void setsim2(sim2 s2)
	 {
		 this.s2=s2;
	 }
	 
	 
	 public void printsmobiledetails()
		{
			System.out.println("______MObile ______________");
			System.out.println("name="+name);
			System.out.println("brand="+brand);
		
		}
		

}
