import java.util.ArrayList;

/**
	Класс описывает клинику
	@autor burovitskiy
	@since 06.06.2016
*/
public class Clinic{
	/**
	Список клиентов
	*/

	private final ArrayList<Client> clients;

	public Clinic(final int sizeClinic){
		this.clients = new ArrayList<>(sizeClinic);
	}
	/**
	Добавить клиента
	@param position
	@param client
	*/

	public void addClient(final int position, final Client client){
		// занятоста ли ячейка
		if(this.client.get(position) == null){
			// есть ли такой клиент
			for(Client cloneClient : clients){
				if(cloneClient.equals(client)){
					System.out.println("Клиент уже существует " + cloneClient.getName() + " " + cloneClient.getPet());
				}
				else{
					this.clients.set(position, client);
				}
			}
		}
		else{
			System.out.println("Клиент уже записан в эту ячейку");
		}
	}
	/**
	Поиск клиента по имени его питомца
	@param name имя питомца
	*/
	public Client findClientsByPetName(final String name){
		Client findClient;
		for(int i = 0; i < clients.size(); i++){
			
			String namePet = clients.get(i).getPet().getName();
			if(namePet.equals(name)){
				findClient = clients.get(i);
			}
		}
		System.out.println(findClientPet);
		return findClient;
	}
	/**
	Поиск клиента по имени
	@param name имя клиента
	*/

	/**
	Редактирование имени клиента
	@param name имя клиента
	*/

	/**
	Редактирование имени питомца
	@param name имя питомца
	*/

	/**
	Удаление клиента
	@param name имя питомца
	*/


}