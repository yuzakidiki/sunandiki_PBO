public class Mahasiswa {

public String nim;
public String namaMahasiswa;
public int sks;
public double ipk;

public Mahasiswa(String nim, String namaMahasiswa, int sks, double ipk) {
this.nim = nim;
this.namaMahasiswa = namaMahasiswa;
this.sks = sks;
this.ipk = ipk;
}

public double hitungIPKSemester(double nilaiAkhir) {
this.ipk = (this.ipk + nilaiAkhir) / 2;
return this.ipk;
}

public double hitungIPKSemester(double nilaiAkhir, int bobotSks) {
this.ipk = ((this.ipk * this.sks) + (nilaiAkhir * bobotSks)) / (this.sks + bobotSks);
this.sks = this.sks + bobotSks;
return this.ipk;
}

public void tampilkanData() {
System.out.println("NIM       : " + this.nim);
System.out.println("Nama      : " + this.namaMahasiswa);
System.out.println("Total SKS : " + this.sks);
System.out.println("IPK Saat Ini: " + this.ipk);
System.out.println("------------------------------------");
}
} 