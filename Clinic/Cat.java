/**
Реализация кота
@autor burovitskiy
@since 06.06.2016
*/
public class Cat implements Pet{
	/**
	Базовая реализация питомца
	*/
	private final Animal animal;

	public Cat(final Animal animal){
		this.animal = animal;
	}
	/**
	(@inheritDoc)
	*/
	@Override
	public void makeSound(){
		this.animal.makeSound();
		System.out.println("May, May");
	}
	/**
	(@inheritDoc)
	*/
	@Override
	public String getName(){
		return this.animal.getName();
	}
}