import java.util.ArrayList;

public class Cashier {
    private ArrayList<Item> items;

    public Cashier() {
        items = new ArrayList<>();
    }

    // Menambahkan item ke daftar
    public void addItem(double price, String code, String name, int quantity) {
        items.add(new Item(code, name, price, quantity));
        System.out.println("Barang ditambahkan.");
    }

    // Menghapus item berdasarkan kode
    public void removeItem(String code) {
        for (Item item : items) {
            if (item.getCode().equals(code)) {
                items.remove(item);
                System.out.println("Barang dihapus.");
                return;
            }
        }
        System.out.println("Barang tidak ditemukan.");
    }

    // Menampilkan daftar item dan subtotal masing-masing
    public void viewItems() {
        System.out.println("\nDaftar Barang:");
        System.out.println("Kode\tNama\tHarga\tJumlah\tSubTotal");
        for (Item item : items) {
            System.out.printf("%s\t%s\t%.2f\t%d\t%.2f\n",
                    item.getCode(), item.getName(), item.getPrice(), item.getQuantity(), item.getSubTotal());
        }
    }

    // Menampilkan total harga
    public double displayTotal() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getSubTotal();
        }
        System.out.printf("\nTotal belanja: %.2f\n", total);
        return total;
    }

    // Melakukan pembayaran dan menghitung kembalian
    public void processPayment(double amountPaid) {
        double total = displayTotal();
        if (amountPaid >= total) {
            double change = amountPaid - total;
            System.out.printf("Dibayar: %.2f\n", amountPaid);
            System.out.printf("Kembali: %.2f\n", change);
        } else {
            System.out.println("Uang yang diberikan tidak cukup.");
        }
    }
}
