package day6;

public class House {
	
	//state
	//what does it have
	String address;
	String color_of_house;
	//instance variable;
	
	//h1 --- White
	//h2 --- Black
	
	
	//behaviour
	//what does it do
	
	public void addDetailsOfHouses(String address, String color) {
		
		this.address=address;
		color_of_house= color;
		
	}
	
	public void protectsFromBadWeather() {
		
		System.out.println("LEts stay home");
	}
	
	

}
