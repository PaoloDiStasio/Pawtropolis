import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;

public class ZooController {

	ArrayList<Animal> animals = new ArrayList<>();
	ArrayList<AnimalWithTail> animalsWithTail = new ArrayList<>();
	ArrayList<AnimalWithWings> animalsWithWings = new ArrayList<>();
	
	public void addAnimalWithTail(AnimalWithTail animal) {
		this.animalsWithTail.add(animal);
		this.animals.add(animal);	
	}
	
	public void addAnimalWithWings(AnimalWithWings animal) {
		this.animalsWithWings.add(animal);
		this.animals.add(animal);
	}

	public ArrayList<Animal> getAnimals(){
		return animals;
	}
	
	public ArrayList<AnimalWithTail> getAnimalsWithTail(){
		return animalsWithTail;
	}
	
	public ArrayList<AnimalWithWings> getAnimalsWithWings(){
		return animalsWithWings;
	}

	public Animal returnRecordAnimal(BiPredicate<Animal, Animal> compareAnimals){
		Animal recordAnimal = null;
		
		for(Animal animal : animals){
			if(compareAnimals.test(animal, recordAnimal)){
				recordAnimal = animal;
			}
		}
		
		return recordAnimal;
	}

	public AnimalWithTail returnRecordAnimalWithTail(BiPredicate<AnimalWithTail, AnimalWithTail> compareAnimals){
		AnimalWithTail recordAnimal = null;
		
		for(AnimalWithTail animal : animalsWithTail){
			if(compareAnimals.test(animal, recordAnimal)){
				recordAnimal = animal;
			}
		}
		
		return recordAnimal;
	}


	public AnimalWithWings returnRecordAnimalWithWings(BiPredicate<AnimalWithWings, AnimalWithWings> compareAnimals){
		AnimalWithWings recordAnimal = null;
		
		for(AnimalWithWings animal : animalsWithWings){
			if(compareAnimals.test(animal, recordAnimal)){
				recordAnimal = animal;
			}
		}
		
		return recordAnimal;
	}
}
