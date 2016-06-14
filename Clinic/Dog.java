/**
Реализация пса
@autor burovitskiy
@since 06.06.2016
*/
public class Dog implements Pet{
	/**
	Базовая реализация питомца
	*/
	private final Animal animal;

	public Dog(final Animal animal){
		this.animal = animal;
	}
	/**
	(@inheritDoc)
	*/
	@Override
	public void makeSound(){
		this.animal.makeSound();
		System.out.println("Gav, Gav");
	}
	/**
	(@inheritDoc)
	*/
	@Override
	public String getName(){
		return this.animal.getName();
	}
}