//Import for zone
import java.time.ZoneId;

//Import for date and time
import java.time.LocalDateTime;

//Main class
public class Appointment{

   //Main program
   public static void main(String[] args){
      
      //Set up for StringBuilder
      String last = "Smith";
      String first = "John";
      StringBuilder sb = new StringBuilder(last + first);
      
      //Other attributes to be passed into the constructor
      String email = "JohnSmith@email.com";
      String phone = "904-555-1212";
      ReminderPref choice = ReminderPref.EMAIL;
      String pref = choice.toString();
      ZoneId zone = ZoneId.of("America/New_York");
      String contactZone = zone.toString();
      LocalDateTime now = LocalDateTime.now(zone);
      
      
      
      //Call to constructor class
      Contact contact = new Contact(sb, email, phone, pref, contactZone);      
      System.out.println("""
      Appt:
      Title: Test Appointment
      Desc: This is a test appointment """);
      System.out.println("Contact: " + contact.email + ", (" + contact.name + ")" + contact.phone + "," + pref + "," + contact.contactZone);
      System.out.println("Appt Date/Time: " + now + "[" + contact.contactZone + "]" );
   }
}

/**
//Contact class
public class Contact{
   StringBuilder name;
   String email;
   String phone;
   String pref;
   String contactZone;
   
   //Contact constructor
   public Contact(StringBuilder name, String email, String phone, String pref, String contactZone){
      this.name = name;
      this.email = email;
      this.phone = phone;
      this.pref = pref;
      this.contactZone = contactZone;
   }
**/
/**
//Enum choices
public enum ReminderPref{
      NONE,
      TEXT,
      EMAIL;
   }   
**/