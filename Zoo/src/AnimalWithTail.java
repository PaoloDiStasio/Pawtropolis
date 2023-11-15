import java.time.LocalDate;

public abstract class AnimalWithTail extends Animal {

	private float tailLenght;
	
	public AnimalWithTail(String name, String favoriteFood, int age, LocalDate arrivalDate, float weight, float height, float tailLenght) {
		super(name, favoriteFood, age, arrivalDate, weight, height);
		this.setTailLenght(tailLenght);
	}

	public float getTailLenght() {
		return tailLenght;
	}

	public void setTailLenght(float tailLenght) {
		this.tailLenght = tailLenght;
	}
	
	public String toString() {
		String animalWithTailInfo = "Name: " + getName() + ", favorite food: " + getFavoriteFood() + ", age: " + getAge() + ", date of arrival: " + getArrivalDate() + ", weight: " + getWeight() + ", height: " + getHeight() + ", lenght of tail: " + getTailLenght() + "\n";
		return animalWithTailInfo;
	}


}
