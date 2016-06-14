/**
Реализация котопса
@autor burovitskiy
@since 06.06.2016
*/
public class CatDog implements Pet{
	/**
	Базовая реализация кота и пса
	*/
	private final Pet cat;
	private final Pet dog;

	public CatDog(Pet cat, Pet dog){
		this.cat = cat;
		this.dog = dog;
	}
	/**
	(@inheritDoc)
	@return
	*/
	@Override
	public void makeSound(){
		this.cat.makeSound();
		this.dog.makeSound();
	}
	/**
	(@inheritDoc)
	@return
	*/
	@Override
	public String getName(){
		return String.format("%s%s", this.cat.getName(), this.dog.getName());
	}
}