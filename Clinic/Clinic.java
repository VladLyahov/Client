import java.util.ArrayList;
import java.util.Scanner;

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
	Scanner scanner = new Scanner(System.in);

	public Clinic(){
		this.clients = new ArrayList<>();
	}
	/**
	Добавить клиента
	@param position
	@param client
	*/

	public void addClient(final Client client){

			// есть ли такой клиент
		if(clients.size() > 0){
			boolean isTrue = true;
			for(Client cloneClient : clients){
				if(cloneClient.getName().equals(client.getName())){
					System.out.println("Клиент " + cloneClient.getName() + " " + " уже существует ");
					isTrue = false;
				}
			}
			if(isTrue == true){
				this.clients.add(client);
				System.out.println("Клиент add");
			}
			
		}
		else{
			this.clients.add(client);
			System.out.println("Клиент add");
		}

	}
	/**
	Поиск клиента по имени его питомца
	@param name имя питомца
	*/
	public Client findClientsByPetName(final String name){
		Client findClient = null;
		if(clients.size() > 0){
			for(int i = 0; i < clients.size(); i++){
				
				String namePet = clients.get(i).getPet().getName();
				if(namePet.equals(name)){
					findClient = clients.get(i);
				}
			}
		}
		
		return findClient;
	}
	/**
	Поиск клиента по имени
	@param name имя клиента
	*/
	public Client findClientsByName(final String name){
		Client findClient = null;
		if(clients.size() > 0){
			for(int i = 0; i < clients.size(); i++){
				
				String nameClient = clients.get(i).getName();
				if(nameClient.equals(name)){
					findClient = clients.get(i);
				}
			}
		}
		return findClient;
	}

	/**
	Редактирование имени клиента
	@param name имя клиента
	*/
	public void renameClientName(final String name){
			for(int i = 0; i < clients.size(); i++){
				
				String nameClient = clients.get(i).getName();
				if(nameClient.equals(name)){
					System.out.println("Add new name:");
					String newName = scanner.nextLine();
					Pet pet = clients.get(i).getPet();
					clients.remove(i);
					clients.set(i, new Client(newName, pet));
				}
			}

	}
	/**
	Редактирование имени питомца
	@param name имя питомца
	*/
	public void renamePetName(final String nameClient){
			for(int i = 0; i < clients.size(); i++){
				
				String findNameClient = clients.get(i).getName();
				if(nameClient.equals(findNameClient)){
					System.out.println("Add new pet name:");
					String newPetName = scanner.nextLine();
					if(clients.get(i).getPet() instanceof Cat){
						clients.remove(i);
						clients.set(i, new Client(findNameClient, new Cat(newPetName)));
					}
					else if(clients.get(i).getPet() instanceof Dog){
						clients.remove(i);
						clients.set(i, new Client(findNameClient, new Dog(newPetName)));
					}
				}
			}

	}
	/**
	Удаление клиента
	@param name имя питомца
	*/
	public void removeClient(final String name){

		if(clients.size() > 0){
			for(int i = 0; i < clients.size(); i++){
				
				String nameClient = clients.get(i).getName();
				if(nameClient.equals(name)){
					clients.remove(i);
				}
			}
		}
		else{
			System.out.println("Клиника не содержит клиентов");
		}
	
	}

}