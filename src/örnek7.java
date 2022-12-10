public class örnek7 {
    public static void main(String[] args) {
    int taban =7 , kuvvet = 3;

    long sonuc = 1;

    for (;kuvvet != 0; --kuvvet)
    {
        sonuc *= taban;
    }

    System.out.println("CEVAP = " + sonuc);
}
}
