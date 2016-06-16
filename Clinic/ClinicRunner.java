import java.util.Scanner;

/**
	Работа клиники
	@autor burovitskiy
	@since 06.06.2016
	*/
public class ClinicRunner{

	public static void main(String[] args) {
		final Clinic clinic = new Clinic(10);
		Scanner scanner = new Scanner(System.in);
		String command = scanner.nextLine();

		clinic.addClient(0, new Client("Jonny", new Cat("Klaus")));
		clinic.addClient(1, new Client("Mary", new Dog("Pshok")));
		clinic.findClientsByPetName("Pshok");

	}
	
}