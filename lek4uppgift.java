import java.util.Scanner;


public class lek4uppgift {


    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("Skriv ditt förstat tal: ");
        double tal_1 = tangentbord.nextDouble();
        System.out.println("Ange ditt andra tal: ");
        double tal_2 = tangentbord.nextDouble();
        double Kvot1 = tal_1 / tal_2;
        System.out.println("Kvoten av dessa två är "+Kvot1);

    
    Scanner sub = new Scanner (System.in);
    System.out.println("Nämn ett substantiv: ");
    String substanti_v4 = sub.nextLine();
    String pluralsub = substanti_v4+"er";
    System.out.println("Plural av det här ordet är : "+pluralsub);




    
}

}
