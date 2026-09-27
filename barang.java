public class barang{ 
    public String kodebarang;
    public String namabarang;
    public int stok;
    public double harga;


    public barang(String kode, String nama, int stokAwal, double hargabarang) {
        this.kodebarang = kode;
        this.namabarang = nama;
        this.stok = stokAwal;
        this.harga = hargabarang;
    }

    public void tambahStok() {
        this.stok = this.stok + 1;
    }

    public void tambahStok(int jumlah) {
        this.stok = this.stok + jumlah;
    }

    public double hitungTotalNilaiStok() {
        return this.stok * this.harga;
    }

    public void tampilkanInfo(){
        System.out.println("Kode : " + this.kodebarang);
        System.out.println("Nama : " + this.namabarang);
        System.out.println("Stok : " + this.stok + " unit");
        System.out.println("Harga: Rp " + this.harga);
        System.out.println("Nilai Total Stok: Rp " + hitungTotalNilaiStok());
        System.out.println("------------------------------------");
    }
}

