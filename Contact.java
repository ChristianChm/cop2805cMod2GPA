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
      /**
      "this" is used to keep java from getting confused about what exactly we are
       talking about. With all the variables being the same, it can get difficult to 
       decipher what exactly we are asking it to do, and "this" helps clarify things. 
      **/
   }
}