import java.util.Scanner;

public class serviceSystem
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        //input kendaraan
        System.out.println("===Input Kendaraan===");
        System.out.print("Input No.Plat         : ");
        String nopol = input.nextLine();
        System.out.print("Input Jenis Kendaraan : ");
        String jenis = input.nextLine();
        
        dataKendaraan farid = new dataKendaraan(nopol, jenis);
        
        // input jasa
        System.out.println("\n===Input Jasa===");
        String lanjutInputJasa = "y";
        while (lanjutInputJasa.equalsIgnoreCase("y")){    
        System.out.print("Nama Perbaikan : ");
        String jasa = input.nextLine();
        System.out.print("Harga Jasa     : ");
        int price = input.nextInt();
        input.nextLine();
        
        farid.inputJasa(new jasaPerbaikan(jasa, price));
        
        System.out.print("Tambah Perbaikan Lagi? (y/n): ");
        lanjutInputJasa = input.nextLine();
        }
        
        //input part
        System.out.println("\n===Input Part===");
        String lanjutInputPart = "y";
        while (lanjutInputPart.equalsIgnoreCase("y")){
            System.out.print("Nama Part   : ");
            String part = input.nextLine();
            System.out.print("Harga Part  : ");
            int hargaP = input.nextInt();
            System.out.print("Quantity    : ");
            int qty = input.nextInt();
            input.nextLine();
            
            farid.inputPart(new detailPart(part, hargaP, qty));
            
            System.out.print("Tambah Part Lagi? (y/n): ");
            lanjutInputPart = input.nextLine();
        }
        
        //cetak kwitansi
        System.out.println("Sedang Mencetak Kwitansi....");
        farid.cetakKwitansi();
        
        input.close();
    }
}