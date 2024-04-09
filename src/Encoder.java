import java.util.Random;

public class Encoder {
    private String plainText;
    private String cypher;

    public Encoder() {
        this.plainText = plainText;
    }

    public String getCypher() {
        return cypher;
    }

    public void setCypher(String cypher) {
        this.cypher = cypher;
    }

    public char randomChar(){
        Random random = new Random();
        int randomNumber = random.nextInt(26) + 65;
        char randomChar = (char) randomNumber;
        return randomChar;
    }

    public String codingText(String plainText){
        String newPlainText = "";
        for(int i = 0; i < plainText.length(); i++){
            newPlainText += plainText.charAt(i);
            newPlainText += String.valueOf(randomChar());
        }
        plainText = String.valueOf(randomChar()) + String.valueOf(randomChar()) + newPlainText + String.valueOf(randomChar());
        return plainText;
    }
}
