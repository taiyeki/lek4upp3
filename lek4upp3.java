    import java.util.Scanner;


public class lek4upp3 {
    public static void main(String[] args) throws Exception {

        Scanner shinobi = new Scanner(System.in);
        System.out.println("Skriv: Förnamn, Efternamn, Length, Age   ");
       
     
     String inputLine = shinobi.nextLine();

     
     String[] parts = inputLine.split(" ");

    
     if (parts.length >= 4) {
       
         String förnamn = parts[0];
         String efternamn = parts[1];
         String lengthStr = parts[2].replaceAll("cm", ""); 
         double length = Double.parseDouble(lengthStr);
         int age = Integer.parseInt(parts[3]);

         System.out.println("Förnamn: " + förnamn);
         System.out.println("Efternamn: " + efternamn);
         System.out.println("Length: " + length);
         System.out.println("Age: " + age);
   
     }












    }

}
