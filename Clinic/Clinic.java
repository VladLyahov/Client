/**
	Класс описывает клинику
	@autor burovitskiy
	@since 06.06.2016
*/
public class Clinic{
	/**
	Список клиентов
	*/

	private final Client[] clients;

	public Clinic(final int size){
		this.clients = new Client[size];
	}
	/**
	Добавить клиента
	@param position
	@param client
	*/

	public void addClient(final int position, final Client client){
		this.clients[position] = client;
	}
	/**
	Поиск клиента по имени его питомца
	@param name имя питомца
	*/
//	public Client[] findClientsByPetName(final String name){

//		return new Client[]{};
//	}
}