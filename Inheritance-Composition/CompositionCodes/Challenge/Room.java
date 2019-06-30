import java.io.*;

public class Room{
  private String name;
  private Seats seat;
  private Available isAvailable;

  public Room(String name, Seats seat, Available isAvailable){
    this.name = name;
    this.seat = seat;
    this.isAvailable = isAvailable;
  }

  public void chooseRoom(){
    System.out.println("Getting room availibility... ");
    isAvailable.roomReservation();
  }

  public void seatCall(){
    System.out.println("Getting number of seats...");
    seat.chairNumber();
  }

  public String getName(){
    return name;
  }
	private Seats getSeat() {
		return seat;
	}
	public Available getIsAvailable() {
		return isAvailable;
	}

}
