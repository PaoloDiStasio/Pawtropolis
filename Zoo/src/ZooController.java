import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class ZooController {
	
	Map<Class<? extends Animal>, List<Animal>> animals = new HashMap<>(); 
	
	public <T extends Animal> void addAnimal(T animal) {
		animals.computeIfAbsent(animal.getClass(), k -> new ArrayList<>()).add(animal);
	}
	
	public <T extends Animal> List<T> getAnimal(Class<T> classname){
		if (animals.get(classname) != null) {
			return (List<T>) animals.get(classname);
		}
		return animals.values().stream()
				.flatMap(Collection::stream)
				.filter(classname::isInstance)
				.map(classname::cast)
				.collect(Collectors.toList());
	}
	
	public <T extends Animal> T returnRecordAnimal(BiPredicate<T, T> compareAnimals, Class<T> classname){
		T recordAnimal = null;
		
		for(T animal : getAnimal(classname)){
			if(compareAnimals.test(animal, recordAnimal)){
				recordAnimal = animal;
			}
		}
		
		return recordAnimal;
	}
}
