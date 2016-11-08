package my.com.model;

import java.util.ArrayList;
import java.util.List;
class Item{}
class Car extends Item{}
class Computer extends Item{}

class Rentel<T extends Item>{
	private List<T> rentalItems;
	private int maxSize;

	public Rentel(List<T> carList,int maxSize){
		this.rentalItems = carList;
		this.maxSize = maxSize;
	}
	
	public T getItemOnRent(){
		return rentalItems.get(0);
	}
}


public class RentelGeneric {
	
	public static void main(String[] args) {
		Rentel<Car> carRental = new Rentel<Car>(new ArrayList<Car>(), 1);
		Rentel<Computer> computerRental = new Rentel<Computer>(new ArrayList<Computer>(), 1);
		Car car = carRental.getItemOnRent();
		
		
		
	}

}
