import java.util.Date;
import java.util.Scanner;



public class Event {

  private String title;  
  private String location;
  private Date eventDate;
  private double price;
  private int attendees; 


  public Event(String title, String location, Date eventDate, double price, int attendees) {
      this.title = title;
      this.location = location; 
      this.eventDate = eventDate;
      this.price = price;
      this.attendees = attendees;    
  }


  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public Date getEventDate() {
    return eventDate;
  }


  public void setEventDate(Date eventDate) {
    this.eventDate = eventDate;
  }


  public double getPrice() {
    return price;
}


  public void setPrice(double price) {
    this.price = price;
}

  public int getAttendees() {
    return attendees;
}

  public void setAttendees(int attendees) {
    this.attendees = attendees; 
}
  
  /** Transforms the textual representation of the Event into an Event
   *  object.
   *  Precondition:Lines retrieved by sc contain textual representation of the event.
 * @return 
   */
  public static Event read(Scanner sc) throws IllegalArgumentException{
          return null;
  }

}
