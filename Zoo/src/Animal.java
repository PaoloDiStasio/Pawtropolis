import java.time.LocalDate;

public class Animal {

	private String name;
	private String favoriteFood;
	private int age; 
	private LocalDate arrivalDate; 	
	private float weight; 		
	private float height;			
	
	public Animal(String name, String favoriteFood, int age, LocalDate arrivalDate, float weight, float height) {
		this.setName(name);
		this.setFavoriteFood(favoriteFood);
		this.setAge(age);
		this.setArrivalDate(arrivalDate);
		this.setWeight(weight);
		this.setHeight(height); 
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	
	
}
