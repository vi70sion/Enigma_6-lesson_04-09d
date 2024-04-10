import java.util.Scanner;

public class IOManager {
    private int action;
    private String inputMessage;
    Scanner scaner = new Scanner(System.in);

    public int getAction() { return action; }

    public String getInputMessage() { return inputMessage; }

    public void inputAction(){
        System.out.println("Pasirinkite veiksmą- užkoduoti (1), atkoduoti (2): ");
        this.action = scaner.nextInt();
    }
    public void inputMessage(){
        System.out.println("Įveskite žinutę, kurią norite už(at)koduoti: ");
        this.inputMessage = scaner.next();
        scaner.close();
    }

    public void printMessage(String message){
        System.out.println("Jūsų slaptas pranešimas yra: "+ message);
    }
}
