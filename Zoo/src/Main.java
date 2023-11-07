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
		
		zooController.addEagle(aquilotto);
		zooController.addEagle(lazio);
		zooController.addLion(leone);
		zooController.addTiger(tigro);
		zooController.addTiger(tigress);
		zooController.addLion(leo);

		System.out.println("La tigre più alta: \n Nome: " + zooController.getTallestTiger().getName() + ", Altezza: " + zooController.getTallestTiger().getHeight() + " m");
		System.out.println("Il leone più basso: \n Nome: " +  zooController.getShortestLion().getName() + ", Altezza: " + zooController.getShortestLion().getHeight() + " m");
		System.out.println("L'aquila più pesante: \n Nome: " + zooController.getHeaviestEagle().getName() + ", Peso: " + zooController.getHeaviestEagle().getWeight() + " kg");
		System.out.println("Il leone più leggero: \n Nome: " + zooController.getLightestLion().getName() + ", Peso: " + zooController.getLightestLion().getWeight()+ " kg");
		System.out.println("L'animale con la coda più lunga: \n Nome: " + zooController.getLongestTailAnimal().getName() + ", Lunghezza: " + zooController.getLongestTailAnimal().getTailLenght() + " m");
		System.out.println("L'animale con l'apertura alare più ampia: \n Nome: " + zooController.getLargestWingspan().getName() + ", Lunghezza: " + zooController.getLargestWingspan().getWingspan() + " m");

		
		BiPredicate<Animal, Animal> tallestTiger = (tiger1, tiger2) -> tiger1 instanceof Tiger && tiger1.getHeight() > tiger2.getHeight(); 

		System.out.println("La tigre più alta: \n Nome: " + zooController.returnRecordAnimal(tallestTiger).getName() + ", Altezza: " + zooController.returnRecordAnimal(tallestTiger).getHeight() + " m");

	}
	
	

}
