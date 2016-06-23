

/**
	Работа клиники
	@autor burovitskiy
	@since 06.06.2016
	*/
public class ClinicRunner{

	public static void main(String[] args) {
		final Clinic clinic = new Clinic();

		clinic.addClient(new Client("Jonny", new Cat("Klaus")));
		clinic.addClient(new Client("Mary", new Dog("Pshok")));
		clinic.addClient(new Client("Fedor", new Cat("Luise")));
		clinic.addClient(new Client("Mary", new Dog("Pshochik")));
		//System.out.println(clinic.findClientsByPetName("Pshok").getName());
		//System.out.println(clinic.findClientsByName("Jonny").getName());
		//clinic.renameClientName("Jonny");
		//System.out.println("Name rename" );
		//System.out.println(clinic.findClientsByPetName("Klaus").getName());
		System.out.println(clinic.findClientsByName("Mary").getPet().getName());
		clinic.renamePetName("Mary");
		System.out.println(clinic.findClientsByName("Mary").getPet().getName());
		clinic.removeClient("Mary");
		//System.out.println(clinic.findClientsByName("Mary").getName());
	}
	
}