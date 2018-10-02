import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EventCatalog {
    
    private Set<Event> events;
    
   
    public EventCatalog(){
         this.events = new HashSet<Event>();
    }
    
    /** Adds event to the set of events 
     */
    public void addEvent(Event event){
        this.events.add(event);
    }    
    
    /** Transforms the textual representations of the Events into a 
     *  EventsCatalog.
     */
    public static EventCatalog read(String fileName) throws FileNotFoundException{
        EventCatalog cata = new EventCatalog();
        Scanner sc = new Scanner(new File(fileName));
        int n = sc.nextInt();
        while(n-- > 0){
            cata.addEvent(Event.read(sc));
        }
        return cata;
    }    
}