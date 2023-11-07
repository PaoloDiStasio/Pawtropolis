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

		
		Lion leone = new Lion("leone", "pollo", 11,  LocalDate.of(2020, 5, 10), 50, (float) 1.80, 1);
		Lion leo = new Lion("leo", "capra", 8, LocalDate.of(2019, 10, 5), 60, (float) 1.75, (float) 1.5);
		
		
		Eagle aquilotto = new Eagle("Aquilotto", "verme", 5,  LocalDate.of(2020, 5, 10), 5, (float) 0.8, (float) 2.3);
		Eagle lazio = new Eagle("Lazio", "uccelli", 10, LocalDate.of(2010, 10, 11), 6, (float) 1, (float) 2.5);

				
		System.out.println("Zoo");
		
		ZooController zooController = new ZooController();
		

		zooController.addLion(leone);
		zooController.addTiger(tigro);
		zooController.addTiger(tigress);
		zooController.addLion(leo);
		zooController.addEagle(aquilotto);
		zooController.addEagle(lazio);

		
		BiPredicate<Animal, Animal> tallestTiger = (tiger1, tiger2) -> tiger1 instanceof Tiger && tiger1.getHeight() > tiger2.getHeight(); 
		System.out.println("La tigre più alta: \n Nome: " + zooController.returnRecordAnimal(tallestTiger).getName() + ", Altezza: " + zooController.returnRecordAnimal(tallestTiger).getHeight() + " m");

		BiPredicate<Animal, Animal> shortestLion = (lion1, lion2) -> lion1 instanceof Lion && lion1.getHeight() < lion2.getHeight();
		System.out.println("Il leone più basso: \n Nome: " +  zooController.returnRecordAnimal(shortestLion).getName() + ", Altezza: " + zooController.returnRecordAnimal(shortestLion).getHeight() + " m");

		BiPredicate<Animal, Animal> heaviestEagle = (eagle1, eagle2) -> eagle1 instanceof Eagle  && eagle1.getWeight() > eagle2.getWeight();
		System.out.println("L'aquila più pesante: \n Nome: " +  zooController.returnRecordAnimal(heaviestEagle).getName() + ", Peso: " + zooController.returnRecordAnimal(heaviestEagle).getWeight() + " kg");

		BiPredicate<AnimalWithTail, AnimalWithTail> longestTailAnimal = (tail1, tail2) -> tail1 instanceof AnimalWithTail && tail1.getTailLenght() > tail2.getTailLenght();
		System.out.println("L'animale con la coda più lunga: \n Nome: " + zooController.returnRecordAnimalWithTail(longestTailAnimal).getName() + ", Lunghezza: " + zooController.returnRecordAnimalWithTail(longestTailAnimal).getTailLenght() + " m");
	
		BiPredicate<AnimalWithWings, AnimalWithWings> largestWingspan = (wing1, wing2) -> wing1 instanceof AnimalWithWings && wing1.getWingspan() > wing2.getWingspan();
		System.out.println("L'animale con l'apertura alare più ampia: \n Nome: " + zooController.returnRecordAnimalWithWings(largestWingspan).getName() + ", Lunghezza: " + zooController.returnRecordAnimalWithWings(largestWingspan).getWingspan() + " m");

	}
	
	

}
