public class Payer {
    String surname;
    String name;
    String address;
    String cardNumber;

    public static void main(String[] args) {
        Payer payer = new Payer("Rozenberg", "Alexsander", "Lyuberci", "1234 5678 9109 8765");
        System.out.println(payer);
    }
    private Payer(String surname, String name, String address, String cardNumber) {
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.cardNumber = cardNumber;
    }

    public String toString() {
        return "Payer: " + surname + " " + name + ", address: " + address + ", card: " + cardNumber;
    }
}
