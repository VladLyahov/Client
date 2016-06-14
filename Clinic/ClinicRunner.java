/**
	Работа клиники
	@autor burovitskiy
	@since 06.06.2016
	*/
public class ClinicRunner{

	public static void main(String[] args) {
		final Clinic clinic = new Clinic(10);

		clinic.addClient(0, new Client("Jonny", new Cat(new Animal("Klaus"))));
		clinic.addClient(1, new Client("Mary", new Dog(new Animal("Pshok"))));

	}
	
}