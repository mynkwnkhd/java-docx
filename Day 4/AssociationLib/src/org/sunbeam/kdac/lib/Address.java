package org.sunbeam.kdac.lib;

public class Address
{
	private String cityName;
	private String stateName;
	private int pincode;
	public Address() 
	{	
		this.cityName = new String();
		this.stateName = new String();
		this.pincode = 0;
	}
	public Address(String cityName, String stateName, int pincode)
	{
		this.cityName = new String( cityName );
		this.stateName = new String( stateName );
		this.pincode = pincode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString()
	{
		return "Address [cityName=" + cityName + ", stateName=" + stateName + ", pincode=" + pincode + "]";
	}
	
}
