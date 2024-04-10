public class Main {
    public static void main(String[] args) {


        Encoder encoder = new Encoder();
        encoder.setCypher(encoder.codingText("Labas"));
        String cypher = encoder.getCypher();
        System.out.println("Cypher: " + cypher);
        //System.out.println("Cypher: " + encoder.getCypher());

        Decoder decoder = new Decoder();
        decoder.setPlainText(decoder.decodingText(cypher));
        String plainText = decoder.getPlainText();
        System.out.println("PlainText: " + plainText);

        IOManager manager = new IOManager();
        manager.inputAction();
        manager.inputMessage();
        String message = manager.getInputMessage();
        manager.printMessage(message);
        System.out.println();

    }
}