import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.time.LocalDate;
import java.util.List;
import java.util.function.BiPredicate;




public class Main {

	public static void main(String[] args){
		
		Tiger tigro = new Tiger("Tigro", "carne", 10, LocalDate.of(2020, 5, 10), 60, 1, 2);
		Tiger tigress = new Tiger("Tigress", "tacchino", 15, LocalDate.of(2023, 10, 31), 80,(float) 1.70, (float) 1.5);
		Tiger tigrana = new Tiger("Tigrana", "pollo", 12, LocalDate.of(2023, 12, 10), 90, (float) 1.65, (float) 2);
		
		Lion leone = new Lion("leone", "pollo", 11,  LocalDate.of(2020, 5, 10), 50, (float) 1.80, (float) 2.1);
		Lion leo = new Lion("leo", "capra", 8, LocalDate.of(2019, 10, 5), 60, (float) 1.75, (float) 1.5);
		
		Eagle aquilotto = new Eagle("Aquilotto", "verme", 5,  LocalDate.of(2020, 5, 10), 5, (float) 0.8, (float) 2.3);
		Eagle lazio = new Eagle("Lazio", "uccelli", 10, LocalDate.of(2010, 10, 11), 6, (float) 1, (float) 2.5);

						
		System.out.println("Zoo");
		
		ZooController zooController = new ZooController();
		
		zooController.addAnimal(leone);
		zooController.addAnimal(leo);
		zooController.addAnimal(tigro);
		zooController.addAnimal(tigress);
		zooController.addAnimal(lazio);
		zooController.addAnimal(aquilotto);
		zooController.addAnimal(tigrana);

		
		System.out.println("Animali con la coda: "+ zooController.getAnimal(AnimalWithTail.class));
		System.out.println("Animali con le ali: "+ zooController.getAnimal(AnimalWithWings.class));
		System.out.println("Leoni: "+ zooController.getAnimal(Lion.class));

		
		BiPredicate<Tiger, Tiger> heaviestTiger = (tiger1, tiger2) -> (tiger2 == null) || tiger1.getWeight() > tiger2.getWeight();
		System.out.println("Tigre più pesante : " + zooController.returnRecordAnimal(heaviestTiger, Tiger.class).getName());
		
		BiPredicate<Eagle, Eagle> heaviestEagle = (eagle1, eagle2) -> (eagle2 == null) || eagle1.getWeight() > eagle2.getWeight();
		System.out.println("L'aquila più pesante è: " + zooController.returnRecordAnimal(heaviestEagle, Eagle.class).getName());

		BiPredicate<AnimalWithTail, AnimalWithTail> longestTail = (tail1, tail2) -> (tail2 == null) || tail1.getTailLenght() > tail2.getTailLenght(); 
		System.out.println("L'animale con la coda più lunga è: " + zooController.returnRecordAnimal(longestTail, AnimalWithTail.class).getName());
		
		BiPredicate<AnimalWithWings, AnimalWithWings> largestWingspan = (wing1, wing2) -> (wing2 == null) || wing1.getWingspan() > wing2.getWingspan(); 
		System.out.println("L'uccello con l'apertura alare più larga è: " + zooController.returnRecordAnimal(largestWingspan, AnimalWithWings.class).getName());

	}
	
	

}
