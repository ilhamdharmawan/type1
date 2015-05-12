/**
 * Created by Win7 on 5/12/2015.
 */
public class Kendaraan {
    public int KecepatanMaks;
    public int Berat;
    public int Kapasitas;

    public Kendaraan(){
        KecepatanMaks = 20;
        System.out.println("kecepatan maks kendaraan :  "+ KecepatanMaks);
    }
}

class Mobil extends Kendaraan{
    public int JumlahRoda;
    public Mobil(int i, int u, int r, int e){
        KecepatanMaks = i;
        Berat = u;
        Kapasitas = r;
        JumlahRoda = e;
    }
    public void CetakSpesifikasi(){
        System.out.println("kecepatan Maks : " + KecepatanMaks);
        System.out.println("berat : " + Berat);
        System.out.println("kepasitas : " + Kapasitas);
        System.out.println("jumlah roda : " + JumlahRoda+"\n");
    }

    public void Jalankan(int i){
        KecepatanMaks = i;
        System.out.println("Mobil dijalankan dengan : "+ KecepatanMaks);
    }
}

