import java.util.Scanner;

public class MainTransaksi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("PILIHAN");
        System.out.println("1. Tampil Data Rekening");
        System.out.println("2. Tampil Data Transaksi");
        System.out.println("3. Mencari Saldo > 500000");
        System.out.println("4. Sorting By Name");
        System.out.println("5. Keluar");
        
        System.out.print("Pilih (1-5) : ");
        int pilih = sc.nextInt();
        System.out.println("");
        
        switch(pilih){
            case 1:
                // Tampilkan data rekening
                System.out.println("1. Tampil Data Rekening");
                Rekening[] rkn = new Rekening[20];
                rkn[0] = new Rekening(" No Rekening ", "    Nama ",  " Nama Ibu",        "   Phone",        "       Email");
                rkn[1] = new Rekening("16030927 3084", "   Wallace", " Chase Castro ",   " 1-458-264-3263", " ligula.Nullam@tacitisociosqu.edu");
                rkn[2] = new Rekening("16100617 0573", "   Darius",  " Julian Daniel",   " 1-357-843-0547", " nec@lectusjusto.org");
                rkn[4] = new Rekening("16270525 0112", "   Malcolm", " Keane Floyd",     " 623-0234",       " convallis@Vestibulumanteipsum.org");
                rkn[5] = new Rekening("16971204 2416", "   Geoffrey"," Stephen Pratt",   " 1-683-416-8323", " porttitor.tellus.non@Curabitur.ca");
                rkn[6] = new Rekening("16100727 8862", "   Rudyard", " Charles Morales", " 650-5379",       " ut.pellentesque@luctusutpellentesque.com");
                rkn[7] = new Rekening("16460329 4259", "   Troy",    " Damon Guerra",    " 897-7608",       " Proin.eget@velitegestaslacinia.ca");
                rkn[8] = new Rekening("16320421 3437", "   Alec",    " Cooper Lee",      " 792-4447",       " pede.Suspendisse.dui@a.ca");
                rkn[9] = new Rekening("16180729 7229", "   Walter",  " Seth Drake",      " 863-8209",       " non@mus.com");
                rkn[10] = new Rekening("16950313 6823", "  Simon",   " Burton Gates",    " 592-6919",       " Pellentesque.ut.ipsum@neque.ca");
                rkn[11] = new Rekening("16850708 3528", "  Kamal",   " Odysseus Salas",  " 1-115-339-7678", " tellus.justo.sit@commodoauctor.net");
                rkn[12] = new Rekening("16080205 9329", "  Xenos",   " Colin Carry",     " 1-891-703-2664", " dictum@nec.edu");
                rkn[13] = new Rekening("16080628 2695", "  Merrit",  " Clarke Roman",    " 1-978-632-5110", " vel@ullamcorpermagna.co.uk");
                rkn[14] = new Rekening("16130909 2979", "  Ryder",   " Joel Cunningham", " 817-1766",       " Aliquam.gravida@vestibulumMauris.net");
                rkn[15] = new Rekening("16890212 8688", "  Preston", " Brock Schroeder", " 1-675-400-4501", " interdum.Curabitur.dictum@rutrumurna.edu");
                rkn[16] = new Rekening("16141008 9963", "  Alec",    " Baker Barton",    " 527-9085",       " et.ultrices@a.co.uk");
                rkn[17] = new Rekening("16511222 7763", "  Price",   " Ashton Burke",    " 1-564-419-4285", " ut@aultriciesadipiscing.ca");
                rkn[18] = new Rekening("16720623 0943", "  Devin",   " Slades Flores",   " 977-6690",       " ac@nibhAliquamornare.com");
                rkn[19] = new Rekening("1771126 7372", "   Ignatius"," Lionel Kane",     " 353-5137",       " cubilia.Curae.Phasellus@Duis.com");
                
                // Tampilkan data rekening
                for (int i = 0; i < rkn.length; i++) {
                    System.out.println(rkn[i].noRekening + rkn[i].nama + rkn[i].namaIbu + rkn[i].phone + rkn[i].email);
                }
                break;
            case 2:
                // Tampilkan data transaksi
                System.out.println("2. Tampil Data Transaksi");
            
                break;
            case 3:
                // Mencari saldo > 500000
                System.out.println("3. Mencari Saldo > 500000");
                System.out.println("______________________________________________________");
                System.out.println("                    Pencarian Data                    ");
                System.out.println("______________________________________________________");
                System.out.println("Saldo > 500000 ");
                System.out.print("saldo : ");
                int cari = sc.nextInt();
                System.out.println("======================================================");
                System.out.println("Menggunakan Squential Search");
                break;
            case 4:
                // Sorting by name
                System.out.println("4. Sorting By Name");
                Rekening[]  rkn28 = new Rekening[20];
                rkn28[0] = new Rekening(" No Rekening ", "    Nama ",  " Nama Ibu",        "   Phone",        "       Email");
                rkn28[1] = new Rekening("16030927 3084", "   Wallace", " Chase Castro ",   " 1-458-264-3263", " ligula.Nullam@tacitisociosqu.edu");
                rkn28[2] = new Rekening("16100617 0573", "   Darius",  " Julian Daniel",   " 1-357-843-0547", " nec@lectusjusto.org");
                rkn28[4] = new Rekening("16270525 0112", "   Malcolm", " Keane Floyd",     " 623-0234",       " convallis@Vestibulumanteipsum.org");
                rkn28[5] = new Rekening("16971204 2416", "   Geoffrey"," Stephen Pratt",   " 1-683-416-8323", " porttitor.tellus.non@Curabitur.ca");
                rkn28[6] = new Rekening("16100727 8862", "   Rudyard", " Charles Morales", " 650-5379",       " ut.pellentesque@luctusutpellentesque.com");
                rkn28[7] = new Rekening("16460329 4259", "   Troy",    " Damon Guerra",    " 897-7608",       " Proin.eget@velitegestaslacinia.ca");
                rkn28[8] = new Rekening("16320421 3437", "   Alec",    " Cooper Lee",      " 792-4447",       " pede.Suspendisse.dui@a.ca");
                rkn28[9] = new Rekening("16180729 7229", "   Walter",  " Seth Drake",      " 863-8209",       " non@mus.com");
                rkn28[10] = new Rekening("16950313 6823", "  Simon",   " Burton Gates",    " 592-6919",       " Pellentesque.ut.ipsum@neque.ca");
                rkn28[11] = new Rekening("16850708 3528", "  Kamal",   " Odysseus Salas",  " 1-115-339-7678", " tellus.justo.sit@commodoauctor.net");
                rkn28[12] = new Rekening("16080205 9329", "  Xenos",   " Colin Carry",     " 1-891-703-2664", " dictum@nec.edu");
                rkn28[13] = new Rekening("16080628 2695", "  Merrit",  " Clarke Roman",    " 1-978-632-5110", " vel@ullamcorpermagna.co.uk");
                rkn28[14] = new Rekening("16130909 2979", "  Ryder",   " Joel Cunningham", " 817-1766",       " Aliquam.gravida@vestibulumMauris.net");
                rkn28[15] = new Rekening("16890212 8688", "  Preston", " Brock Schroeder", " 1-675-400-4501", " interdum.Curabitur.dictum@rutrumurna.edu");
                rkn28[16] = new Rekening("16141008 9963", "  Alec",    " Baker Barton",    " 527-9085",       " et.ultrices@a.co.uk");
                rkn28[17] = new Rekening("16511222 7763", "  Price",   " Ashton Burke",    " 1-564-419-4285", " ut@aultriciesadipiscing.ca");
                rkn28[18] = new Rekening("16720623 0943", "  Devin",   " Slades Flores",   " 977-6690",       " ac@nibhAliquamornare.com");
                rkn28[19] = new Rekening("1771126 7372", "   Ignatius"," Lionel Kane",     " 353-5137",       " cubilia.Curae.Phasellus@Duis.com");
                System.out.println("-------------------INSERTION SORT-----------------");
                
                // Tampilkan semua data rekening setelah diurutkan
                insertionSort(rkn28);
                for (int i = 0; i < rkn28.length; i++) {
                    System.out.println(rkn28[i].noRekening + " " + rkn28[i].nama + " " + rkn28[i].namaIbu + " " + rkn28[i].phone + " " + rkn28[i].email);
                }
                break;                
            default:
                System.out.println("5. Keluar");
        }
    }

    private static void insertionSort(Rekening[] rkn) {
        throw new UnsupportedOperationException("Unimplemented method 'insertionSort'");
    }
}

class Rekening {
    String noRekening;
    String nama;
    String namaIbu;
    String phone;
    String email;
    
    Rekening(String noRekening, String nama, String namaIbu, String phone, String email) {
        this.noRekening = noRekening;
        this.nama = nama;
        this.namaIbu = namaIbu;
        this.phone = phone;
        this.email = email;
    }
}

class Transaksi {
    String noRekening;
    String saldo;
    String saldoAwal;
    String saldoAkhir;
    String tanggalTransaksi;
    
    Transaksi(String noRekening, String saldo, String saldoAwal, String saldoAkhir, String tanggalTransaksi) {
        this.noRekening = noRekening;
        this.saldo = saldo;
        this.saldoAwal = saldoAwal;
        this.saldoAkhir = saldoAkhir;
        this.tanggalTransaksi = tanggalTransaksi;
    }
}
