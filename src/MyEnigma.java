public class MyEnigma {
    public static void main(String[] args) {

        IOManager manager = new IOManager();
        manager.inputAction();
        switch(manager.getAction()){
            case 1:
                Encoder encoder = new Encoder();
                manager.inputMessage();
                encoder.setPlainText(encoder.codingText(manager.getInputMessage()));
                manager.printMessage(encoder.getPlainText());
                break;
            case 2:
                Decoder decoder = new Decoder();
                manager.inputMessage();
                decoder.setPlainText(decoder.decodingText(manager.getInputMessage()));
                manager.printMessage(decoder.getPlainText());
                break;
            default:
                System.out.println("Neteisingai ivestas veiksmas. Programa baige darba.");
        }

    }
}
