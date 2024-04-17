import java.util.Scanner;

public class Transaksi {
    public double saldo;
    public double saldoAwal;
    public double saldoAkhir;
    public String tanggalTransaksi;
    public String type;
    public String noRekening;
    
    void Transakasi (double a, double b, double c, String d, String e){
        saldo = a;
        saldoAwal = b;
        saldoAkhir = c;
        tanggalTransaksi = d;
        type = e;
    } 
    
    void dataTransaksi(){
        System.out.println("|\t" + noRekening + "\t|\t" + saldo + "\t|\t" + saldoAwal + "\t|\t" + saldoAkhir + "\t|\t" + tanggalTransaksi + "\t|");
    }
}
    