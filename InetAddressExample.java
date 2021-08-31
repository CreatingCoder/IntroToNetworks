import java.net.*;  // for InetAddress
import java.util.Scanner;


public class InetAddressExample{

   public static void main(String[] args)  {
   
      // Get name and IP address of the local host
      try {
         InetAddress address = InetAddress.getLocalHost();
         System.out.println("Local Host:");
         System.out.println("\t" + address.getHostName());
         System.out.println("\t" + address.getHostAddress());
      } catch (UnknownHostException e) {
         System.out.println("Unable to determine this host's address");
      }
      
      
      
     //Prompt the user to enter a hostname (e.g., www.auburn.edu)
      try {
      
         //Create scanner to accept users input
         Scanner scan = new Scanner(System.in);
         
         //prompt user for host
         System.out.println("Please enter a host: ");
         
         //Turn user's input into String
         String usersHostName = scan.nextLine();
      
         //Takes the user's string by name and turns it into InetAddress 
         InetAddress address = InetAddress.getByName(usersHostName);
         
         //Turns ip address into int
         //int ipInt = Integer.parseInt(address.getHostAddress());
         
         
         //Prints out the website and address
         System.out.println("\n\nThe website the user provided is:");
         System.out.println("\t" + address.getHostName());
         System.out.println("\t" + address.getHostAddress());
         
         // Gets address as String
         String ipAddress = address.getHostAddress();
         
         //splits String at periods in IP address
         String[] array = ipAddress.split("\\.");
         
         System.out.println("\nThe Binary Format:");
         
         
         //for-each loop to convert String elements to Binary
         //Referenced https://stackoverflow.com/questions/9900284/converting-an-ip-address-to-binary-values-java/9900452
         for (String str : array){
            int bin = Integer.parseInt(str);
            String binaryFormat = Integer.toBinaryString(bin);
            System.out.print(binaryFormat);
         }
      
      
         //The Binary Quad Format
         System.out.println("\n\nThe Binary Quad Format:");  
         for (String str : array){
            int bin = Integer.parseInt(str);
            String binaryFormat = Integer.toBinaryString(bin);
            System.out.print(binaryFormat +".");
         }
         
         
         System.out.println("\n\nThe decimal dotted-quad format:"); 
         System.out.println(address.getHostAddress());
         
         
         
         
         
        
         
      } 
      //Catch for if it doesn't work
      catch (UnknownHostException e) {
         System.out.println("Unable to determine this host's address");
      }
      
      
      
      
      
   
      // for (int i = 0; i < args.length; i++) {
      //    // Get name(s)/address(es) of hosts given on command-line
      //    
         // try {
            // InetAddress[] addressList = InetAddress.getAllByName(args[i]);
            // System.out.println(args[i] + ":");
         //    // Print the first name.  Assume array contains at least one entry.
            // System.out.println("\t" + addressList[0].getHostName());
            // for (int j = 0; j < addressList.length; j++)
               // System.out.println("\t" + addressList[j].getHostAddress());
         // } catch (UnknownHostException e) {
            // System.out.println("Unable to find address for " + args[i]);
         // }
      // }
      
      
   }
}
