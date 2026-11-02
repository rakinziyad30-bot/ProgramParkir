import java.util.ArrayList;

class jasaPerbaikan {
    String namaJasa;
    int hargaJasa;
    
    jasaPerbaikan (String namaJasa, int hargaJasa) {
        this.namaJasa = namaJasa;
        this.hargaJasa = hargaJasa;
    }
}

class detailPart {
    String namaPart;
    int hargaPart;
    int qty;
    
    detailPart (String namaPart, int hargaPart, int qty) {
        this.namaPart = namaPart;
        this.hargaPart = hargaPart;
        this.qty = qty;
    }
}

class  dataKendaraan {
    private String noPolisi;
    private String jenisKendaraan;
    ArrayList<jasaPerbaikan> daftarJasa;
    ArrayList<detailPart> daftarPart;
    
    dataKendaraan (String noPolisi, String jenisKendaraan) {
        this.noPolisi = noPolisi;
        this.jenisKendaraan = jenisKendaraan;
        this.daftarJasa = new ArrayList<>();
        this.daftarPart = new ArrayList<>();
    }
    public void inputJasa(jasaPerbaikan jasa) {
        this.daftarJasa.add(jasa);
    }
    public void inputPart(detailPart part) {
        this.daftarPart.add(part);
    }
    public void cetakKwitansi() {
         System.out.println("No.Plat            : " + this.noPolisi);
         System.out.println("Jenis Kendaraan    : " + this.jenisKendaraan); 
         System.out.println("========================================");
         
         System.out.println("Input Jasa");
         int totalJasa = 0;
         for (jasaPerbaikan j : daftarJasa) {
             System.out.println("- " + j.namaJasa + " (Rp" + j.hargaJasa + ")");
             totalJasa += j.hargaJasa;
         }

         System.out.println("Input Part");
         int totalPart = 0;
         for (detailPart p : daftarPart) {
             int qtyTotal = p.hargaPart * p.qty;
             System.out.println("- " + p.namaPart +" = "+ p.qty + " pcs x Rp" + p.hargaPart + " = Rp" + qtyTotal);
             totalPart += qtyTotal;
         }
         
    System.out.println("================================================");
    System.out.println("Total Jasa                    : Rp " + totalJasa);
    System.out.println("Total Part                    : Rp " + totalPart);
    int totalBayar = totalJasa + totalPart;
    System.out.println("Total yang harus dibayar      : Rp " + totalBayar);
    System.out.println("================================================");
    }
}

