/**
	Клиент
	@autor burovitskiy
	@since 06.06.2016
*/
public class Client{
	private final String id;
	private final Pet pet;

	public Client(String id, Pet pet){
		this.id = id;
		this.pet = pet;
	}

	public String getId(){
		return this.id;
	}
	public Pet getPet(){
		return this.pet;
	}
}