import java.util.Scanner;

public class lektionsju {
    


public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int score = 0;

    System.out.println("Fråga 1, vad är huvudstaden i Sverige?");
    String svar1 = scanner.nextLine();
    if (svar1.equalsIgnoreCase("Stockholm")) {
        score++;
    }

    System.out.println("Fråga 2, vad är huvudstaden i Frankrike?");
    String svar2 = scanner.nextLine();
    if (svar2.equalsIgnoreCase("Paris")) {
        score++;
    }

    System.out.println("Fråga 3, vad heter Yone's bror i League of Legends?");
    String svar3 = scanner.nextLine();
    if (svar3.equalsIgnoreCase("Yasuo")) {
        score++;
    }

    System.out.println("Fråga 4, hur många dagar i en vecka?");
    String svar4 = scanner.nextLine();
    if (svar4.equals("7"))  {
        score++;
    }


    System.out.println("Fråga 5: Vilken planet är närmast solen?");
    String svar5 = scanner.nextLine();
    if (svar5.equalsIgnoreCase("Merkurius")) {
        score++;
     }

     System.out.println("Dina totala poäng "+score+"/5");

     scanner.close();
    }



}














