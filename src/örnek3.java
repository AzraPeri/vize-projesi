public class örnek3 {

    public static void main(String[] args) {
        double n1 = -10, n2 =23, n3 = 12;

        System.out.println(" Sayılar ");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println("");

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " sayısı büyüktür.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " sayısı büyüktür.");

        else
            System.out.println(n3 + " sayısı büyüktür.");
    }
}
