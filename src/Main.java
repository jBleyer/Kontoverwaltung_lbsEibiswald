import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Menü
        Scanner scanner = new Scanner(System.in);
        System.out.println("Was moechten Sie?");
        char input = scanner.next().charAt(0);
        System.out.println(
                "1. Konto anlegen \n " +
                "2. einzahlen \n " +
                "3. abheben \n" +
                "4. Kontoauszug \n" +
                "5. Konto aufloesen \n " +
                "q/Q = Programm beenden");


        switch (input){
            case '1':
                System.out.println("Welches Konto moechten Sie anlegen? \n 1. Girokonto, 2. Sparkonto, 3. Kreditkonto");
                char kontoartInput = scanner.next().charAt(0);
                        switch (kontoartInput){
                            case '1':
                                //Erstelle Girokonto
                            break;
                            case '2':
                                //Erstelle Sparkonto
                                break;
                            case '3':
                                //Erstelle Kreditkonto
                                System.out.println("doesnt show shit");
                                break;
                        }
                break;
            case '2':
                break;
            case '3':
                break;
            case '4':
                break;
            case '5':
                break;
            case 'q':
                System.out.println("quit that shit");
                break;
        }



        //use array
    }
}
