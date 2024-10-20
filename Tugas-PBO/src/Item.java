public class Item {
    private double itemPrice;
    private String itemName;
    private String itemCode;
    private int itemQuantity;

    // Konstruktor default
    public Item() {}

    // Konstruktor untuk inisialisasi item
    public Item(String code, String name, double price, int quantity) {
        this.itemCode = code;
        this.itemName = name;
        this.itemPrice = price;
        this.itemQuantity = quantity;
    }

    // Mendapatkan harga per item
    public double getPrice() {
        return itemPrice;
    }

    // Mendapatkan kode item
    public String getCode() {
        return itemCode;
    }

    // Mendapatkan nama item
    public String getName() {
        return itemName;
    }

    // Mendapatkan jumlah item
    public int getQuantity() {
        return itemQuantity;
    }

    // Mendapatkan subtotal (harga * jumlah)
    public double getSubTotal() {
        return itemPrice * itemQuantity;
    }
}
