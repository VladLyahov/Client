/**
	Клиент
	@autor burovitskiy
	@since 06.06.2016
*/
public class Client{
	private final String name;
	private final Pet pet;

	public Client(String name, Pet pet){
		this.name = name;
		this.pet = pet;
	}

	public String getName(){
		return this.name;
	}
	public Pet getPet(){
		return this.pet;
	}
}