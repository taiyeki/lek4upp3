import java.util.Scanner;

public class LEKTIONSEX {
    

public static void main(String[] args) throws Exception {

 // A)

    Scanner tangentbord = new Scanner(System.in);
    System.out.print(" Ange ålder");
    int ålder = tangentbord.nextInt();
    // Myhndig ålder lika med elle större än 18
    System.out.println("Du är myndig:"+(ålder>=18   ));


// B)
int[] numbers = new int[3];
    numbers[0] = 4;
    numbers[1] = 5;
    numbers[2] = 2;

    boolean greater1 = numbers[0] > numbers[1];
    boolean greater2 = numbers[0] > numbers[2];
    System.out.print(greater1);
    System.out.println(greater2);

    boolean less1 = numbers[0] < numbers[1];
    boolean less2 = numbers[0] < numbers[2];
    System.out.print(less1);
    System.out.println(less2);

    boolean equals1 = numbers[0] == numbers[1];
    boolean equals2 = numbers[0] == numbers[2];
    System.out.print(equals1);
    System.out.println(equals2);

        //1:a elementet är lika med än 2:a ELLER 3:e elementet
       //  1:a elementet är mindre än 2:a ELLER 3:e elementet 
    
}
}
