import java.time.LocalDate;

public abstract class AnimalWithWings extends Animal {

	private float wingspan;
	
	public AnimalWithWings(String name, String favoriteFood, int age, LocalDate arrivalDate, float weight, float height, float wingspan) {
		super(name, favoriteFood, age, arrivalDate, weight, height);
		this.setWingspan(wingspan);
	}

	public float getWingspan() {
		return wingspan;
	}

	public void setWingspan(float wingspan) {
		this.wingspan = wingspan;
	}



		
}
