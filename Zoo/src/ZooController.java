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
	
	public Animal getTallestAnimal() {
		Animal tallestAnimal = this.animals.get(0); 
		for(Animal animal : this.animals) {
			if(animal.getHeight() > tallestAnimal.getHeight()) {
				tallestAnimal = animal;
			}
		}
		return tallestAnimal;
	}

	public Animal getShortestAnimal() {
		Animal shortestAnimal = this.animals.get(0); 
		for(Animal animal : this.animals) {
			if(animal.getHeight() < shortestAnimal.getHeight()) {
				shortestAnimal = animal;
			}
		}
		return shortestAnimal;
	}
	
	public Animal getHeaviestAnimal() {
		Animal heaviestAnimal = this.animals.get(0); 
		for(Animal animal : this.animals) {
			if(animal.getWeight() > heaviestAnimal.getWeight()) {
				heaviestAnimal = animal;
			}
		}
		return heaviestAnimal;
	}
	
	public Animal getLightestAnimal() {
		Animal lightestAnimal = this.animals.get(0); 
		for(Animal animal : this.animals) {
			if(animal.getWeight() < lightestAnimal.getWeight()) {
				lightestAnimal = animal;
			}
		}
		return lightestAnimal;
	}
	
	public AnimalWithTail getLongestTailAnimal() {
		AnimalWithTail longestTailAnimal = this.animalsWithTail.get(0); 
		for(AnimalWithTail animalWithTail : this.animalsWithTail) {
			if(animalWithTail.getTailLenght() > longestTailAnimal.getTailLenght()) {
				longestTailAnimal = animalWithTail;
			}
		}
		return longestTailAnimal;
	}
	
	public AnimalWithWings getLargestWingspan() {
		AnimalWithWings largestWingspanAnimal = this.animalsWithWings.get(0); 
		for(AnimalWithWings animalWithWings : this.animalsWithWings) {
			if(animalWithWings.getWingspan() > largestWingspanAnimal.getWingspan()) {
				largestWingspanAnimal = animalWithWings;
			}
		}
		return largestWingspanAnimal;
	}
	
	public Tiger getTallestTiger() {
		Tiger tallestTiger = this.tigers.get(0); 
		for(Tiger tiger : this.tigers) {
			if(tiger.getHeight() > tallestTiger.getHeight()) {
				tallestTiger = tiger;
			}
		}
		return tallestTiger;
	}
	
	public Lion getTallestLion() {
		Lion tallestLion = this.lions.get(0); 
		for(Lion lion : this.lions) {
			if(lion.getHeight() > tallestLion.getHeight()) {
				tallestLion = lion;
			}
		}
		return tallestLion;
	}
	
	public Eagle getTallestEagle() {
		Eagle tallestEagle = this.eagles.get(0); 
		for(Eagle eagle : this.eagles) {
			if(eagle.getHeight() > tallestEagle.getHeight()) {
				tallestEagle = eagle;
			}
		}
		return tallestEagle;
	}
	
	public Tiger getShortestTiger() {
		Tiger shortestTiger = this.tigers.get(0); 
		for(Tiger tiger : this.tigers) {
			if(tiger.getHeight() < shortestTiger.getHeight()) {
				shortestTiger = tiger;
			}
		}
		return shortestTiger;
	}
	
	public Lion getShortestLion() {
		Lion shortestLion = this.lions.get(0); 
		for(Lion lion : this.lions) {
			if(lion.getHeight() < shortestLion.getHeight()) {
				shortestLion = lion;
			}
		}
		return shortestLion;
	}
	
	public Eagle getShortestEagle() {
		Eagle shortestEagle = this.eagles.get(0); 
		for(Eagle eagle : this.eagles) {
			if(eagle.getHeight() < shortestEagle.getHeight()) {
				shortestEagle = eagle;
			}
		}
		return shortestEagle;
	}
	
	public Tiger getHeaviestTiger() {
		Tiger heaviestTiger = this.tigers.get(0); 
		for(Tiger tiger : this.tigers) {
			if(tiger.getWeight() > heaviestTiger.getWeight()) {
				heaviestTiger = tiger;
			}
		}
		return heaviestTiger;
	}
	
	public Lion getHeaviestLion() {
		Lion heaviestLion = this.lions.get(0); 
		for(Lion lion : this.lions) {
			if(lion.getWeight() > heaviestLion.getWeight()) {
				heaviestLion = lion;
			}
		}
		return heaviestLion;
	}
	
	public Eagle getHeaviestEagle() {
		Eagle heaviestEagle = this.eagles.get(0); 
		for(Eagle eagle : this.eagles) {
			if(eagle.getWeight() > heaviestEagle.getWeight()) {
				heaviestEagle = eagle;
			}
		}
		return heaviestEagle;
	}
	
	public Tiger getLightestTiger() {
		Tiger lightestTiger = this.tigers.get(0); 
		for(Tiger tiger : this.tigers) {
			if(tiger.getWeight() < lightestTiger.getWeight()) {
				lightestTiger = tiger;
			}
		}
		return lightestTiger;
	}
	
	public Lion getLightestLion() {
		Lion lightestLion = this.lions.get(0); 
		for(Lion lion: this.lions) {
			if(lion.getWeight() < lightestLion.getWeight()) {
				lightestLion = lion;
			}
		}
		return lightestLion;
	}
	
	public Eagle getLightestEagle() {
		Eagle lightestEagle = this.eagles.get(0); 
		for(Eagle eagle: this.eagles) {
			if(eagle.getWeight() < lightestEagle.getWeight()) {
				lightestEagle = eagle;
			}
		}
		return lightestEagle;
	}

	public Animal returnRecordAnimal(BiPredicate<Animal, Animal> compareAnimals) {
		Animal recordAnimal = animals.get(0);
		
		for(Animal animal : animals) {
			if(compareAnimals.test(animal, recordAnimal)) {
				recordAnimal = animal;
			}
		}
		return recordAnimal;
	}
	

	
}
