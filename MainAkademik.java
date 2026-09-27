public class MainAkademik {
public static void main(String[] args) {

Mahasiswa mhs1 = new Mahasiswa("12046125018", "Meicha Heli Aulia", 20, 3.50);
Mahasiswa mhs2 = new Mahasiswa("12046125016", "Syifa Fauziah", 20, 3.60);

System.out.println("=== DATA MAHASISWA SEBELUM TRANSAKSI NILAI ===");
mhs1.tampilkanData();
mhs2.tampilkanData();

mhs1.hitungIPKSemester(3.80);            
mhs2.hitungIPKSemester(4.00, 4);          
System.out.println("=== DATA MAHASISWA SESUDAH TRANSAKSI NILAI ===");
mhs1.tampilkanData();
mhs2.tampilkanData();
}
}