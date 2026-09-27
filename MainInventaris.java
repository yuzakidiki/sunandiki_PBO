public class MainInventaris {
    public static void main(String[] args) {
        barang brg1 = new barang("b001", "Laptop Dell", 10, 7500000);
        barang brg2 = new barang("b002", "Mouse Logitech", 50, 150000);

        brg1.tampilkanInfo();
        brg2.tampilkanInfo();

        brg1.tambahStok();
        brg2.tambahStok(20);

        brg1.tampilkanInfo();
        brg2.tampilkanInfo();
    }
}