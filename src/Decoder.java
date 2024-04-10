public class Decoder {
    private String plainText;
    private String cypher;

    public Decoder() {
        this.cypher = cypher;
    }

    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public String decodingText(String cypher){
        String newPlainText = "";
        for(int i = 2; i < cypher.length()-1; i += 2){
            newPlainText += cypher.charAt(i);
        }
        return newPlainText;
    }
}
