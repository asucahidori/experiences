import java.util.ArrayList;
import java.util.List;

public class WaitingRoom {

	static final int capacity = 25;
	int id;
	String firstName;
	String lastName;


	public WaitingRoom(int id, String firstName, String lastName) {

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}



	public static int getCapacity() {
		return capacity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	@Override
	public String toString() {
		return "User id = " + id + " , " + lastName + "," + firstName + ",";
	}


	public void displayWaitingRoomInfo() {
		List<WaitingRoom> listPatients = new ArrayList<WaitingRoom>();
		
		listPatients.add(new WaitingRoom(65465, "John", "Lennon"));
		listPatients.add(new WaitingRoom(55654, "Paul", "McCartny"));
		listPatients.add(new WaitingRoom(36544, "George", "Harrison"));
		listPatients.add(new WaitingRoom(68974, "Ringo", "Starr"));
		listPatients.add(new WaitingRoom(58741, "Pete", "Best"));

		System.out.println("Patients in the waiting room:");


		System.out.println(" ");
		listPatients.forEach(Patient -> System.out.println(Patient));

		System.out.println(" ");
		System.out.println("There are " + listPatients.size() + " patients in the waiting room.");

		System.out.println(" ");



		if (listPatients.size() > 0) {
			System.out.printf("The waiting room is at %.2f percent occupancy.\n",
					((double) listPatients.size() / getCapacity())*100);
		}

		listPatients.forEach(user -> System.out.println(user));


		System.out.println("There are " + listPatients.size() + " patients in the waiting room");
		System.out.println("The waiting room is at " + (listPatients.size() / getCapacity()) +" percent occupancy");




	}



}
