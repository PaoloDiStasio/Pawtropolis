import java.time.LocalDate;

public class AnimalWithTail extends Animal {

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


}
