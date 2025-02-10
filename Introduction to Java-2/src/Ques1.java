enum House {
    APARTMENT(50000),
    FREEHOLD(75000),
    VILLA(150000),
    BUNGALOW(200000),
    MANSION(500000);

    private final int price;

    House(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
public class Ques1 {
    public static void main(String[] args) {
        System.out.println("House Types and Their Prices:");

        for (House house : House.values()) {
            System.out.println(house + " Rs " + house.getPrice());
        }
    }
}