package HotelManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class RoomsController {
	
	public static void AddNewRoom(ArrayList<Room> rooms, Scanner scanner) {
		System.out.println("Enter floor(int):");
		int floor = scanner.nextInt();
		System.out.println("Enter capacity(int):");
		int capacity = scanner.nextInt();
		System.out.println("Enter type (String):");
		String type = scanner.next();
		System.out.println("Enter description (String):");
		String description = scanner.next();
		System.out.println("Enter price (double):");
		double price = scanner.nextDouble();
		int id = 1000 + rooms.size();
		Room room = new Room(id, floor, capacity, type, description, price);
		rooms.add(room);
		System.out.println(" Room added successfully! ");
		System.out.println();
		}
	
	public static void showAllRoom(ArrayList<Room> rooms) {
		for (Room room : rooms) {
			  System.out.println("------------------------");
			room.print();
			System.out.println("------------------------");
	        System.out.println();
			
		}
	}
	
	public static void editRoom(ArrayList<Room> rooms, Scanner scanner) {
		System.out.println("Enter room id: \n-1 to show all rooms");
		int id = scanner.nextInt();
	
		if(id==-1) {
			showAllRoom(rooms);
			System.out.println("Enter room id: \n-1 show all rooms");
			int j = scanner.nextInt();
			id = j;
		
			
		}
		Room room = getRoomById(id, rooms);
		System.out.println("Enter  floor (int): \n-1 keep it");
		int floor = scanner.nextInt();
		if(floor==-1) floor =  room.getFloor();
		
		System.out.println("Enter  capacity (int): \n-1 keep it");
		int capacity = scanner.nextInt();
		if(capacity==-1) capacity = room.getCapacity();
		
		System.out.println("Enter  room type (String): \n-1 keep it");
		String type = scanner.next();
		if(type.equals("-1")) type = room.getType();
		
          System.out.println("Enter  room description (String): \n -1 to  keep it");
          String description = scanner.next();
  		if(type.equals("-1")) type = room.getType();
  		
  		System.out.println("Enter  room price (double): \n-1 to  keep it");
  		double price = scanner.nextDouble();
  		if(price==-1) price = room.getPrice();
  		
  		
  		room.setFloor(floor);
  		room.setCapacity(capacity);
  		room.setType(type);
        room.setDescription(description);
  		
  		for(Room r : rooms) {
  			if(r.getId()==id) {
  				r = room;
  				break;
  			}
  		}
  	
  		
		
		
		
		
	}
	public static Room getRoomById(int id, ArrayList<Room> room) {
		Room rooms = new Room();
		for(Room r : room) {
			if(r.getId()==id) {
				rooms = r;
				break;
				
			}
		}
		return rooms;
	}
	
	
	
	
		
	

	

	
}