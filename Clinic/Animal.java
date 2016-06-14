/**
Базовый класс для животных
@autor burovitskiy
@since 06.06.2016
*/
public class Animal implements Pet{
	/**
	Имя животного 
	*/
	private final String name;

	/**
	Конструктор
	@param name Имя животного
	*/
	public Animal(final String name){
	this.name = name;
	}
	/**
		Вернет имя
	*/
	public String getName(){
		return this.name;
	}
	/**
		Подать голос
	*/
	@Override
	public void makeSound(){
		System.out.println(this.getName());
	}
}

