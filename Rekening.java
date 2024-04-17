import java.util.Scanner;
public class Rekening {
    String noRekening;
    String nama;
    String namaIbu;
    String phone;
    String email;
    double saldo;
    Rekening rkn[] = new Rekening[19];
    
    Rekening(String a, String b, String c, String d, String e){
        noRekening = a;
        nama = b;
        namaIbu = c;
        phone = d;
        email = e;
    }
    
    
    void insertionSort(boolean asc){
        for (int i = 1; i < rkn.length; i++) {
            Rekening temp = rkn[i];
            int j = i;
            if (asc) {
                
            } else {
                
            }
            rkn[j] = temp;
        }
    }
    
    void tampilAll(){
        for (Rekening l : rkn) {
            l.tampilAll();
            System.out.println("===============================================");
        }
    }
}