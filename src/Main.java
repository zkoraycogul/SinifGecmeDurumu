import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,trkce,kimya,mzik;
        double toplam=0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notu : ");
        mat = inp.nextInt();
        if(mat<101 && mat>=0){
            toplam = toplam + mat;
        }

        System.out.print("Fizik Notu : ");
        fizik = inp.nextInt();
        if(fizik<101 && fizik>=0){
            toplam = toplam + fizik;
        }
        System.out.print("Türkçe Notu : ");
        trkce = inp.nextInt();
        if(trkce<101 && trkce>=0){
            toplam = toplam + trkce;
        }
        System.out.print("Kimya Notu : ");
        kimya = inp.nextInt();
        if(kimya<101 && kimya>=0){
            toplam = toplam + kimya;
        }
        System.out.print("Müzik Notu : ");
        mzik = inp.nextInt();
        if(mzik<101 && mzik>=0){
            toplam = toplam + mzik;
        }
        System.out.println(toplam/5 >= 55 ? "Sınıfı Geçtiniz" : "Sınıfta kaldınız");
    }
}
