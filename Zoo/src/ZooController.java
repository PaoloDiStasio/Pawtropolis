import java.util.ArrayList;
import java.util.function.BiPredicate;

public class ZooController {

	ArrayList<Animal> animals = new ArrayList<>();
	
	ArrayList<Lion> lions = new ArrayList<>();
	ArrayList<Tiger> tigers = new ArrayList<>();
	ArrayList<Eagle> eagles = new ArrayList<>();
	
	ArrayList<AnimalWithTail> animalsWithTail = new ArrayList<>();
	ArrayList<AnimalWithWings> animalsWithWings = new ArrayList<>();

	
	public void addTiger(Tiger tiger) {
		this.tigers.add(tiger);
		this.animalsWithTail.add(tiger);
		this.animals.add(tiger);
	}
	
	public void addLion(Lion lion){
		this.lions.add(lion);
		this.animalsWithTail.add(lion);
		this.animals.add(lion);
	}
	
	public void addEagle(Eagle eagle){
		this.eagles.add(eagle);
		this.animalsWithWings.add(eagle);
		this.animals.add(eagle);
	}
	
	public ArrayList<Lion> getLions(){
		return lions;
	}
	
	public ArrayList<Tiger> getTigers(){
		return tigers;
	}
	
	public ArrayList<Eagle> getEagles(){
		return eagles;
	}

	public ArrayList<Animal> getAnimals() {
		return animals;
	}
	
	public ArrayList<AnimalWithTail> getAnimalsWithTail() {
		return animalsWithTail;
	}
	
	public ArrayList<AnimalWithWings> getAnimalsWithWings() {
		return animalsWithWings;
	}

	public <T> T returnRecordAnimal(BiPredicate<T, T> compareAnimals, ArrayList<T> animals) {
		
		T recordAnimal = animals.get(0);
		
		for(T animal : animals) {
			if(compareAnimals.test(animal, recordAnimal)) {
				recordAnimal = animal;
			}
		}
		return recordAnimal;
	}
	
}
