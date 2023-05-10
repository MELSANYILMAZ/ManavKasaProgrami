import java.util.Scanner;
/*Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
örnek çıktı
 Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL*/

public class Main {
    public static void main(String[] args) {
        double Armut,Elma,Domates,Muz,Patlican;
        Scanner inp= new Scanner(System.in);
        System.out.print("Kaç kilo armut aldınız?:");
        Armut=inp.nextDouble();
        System.out.print("Kaç kilo Elma aldınız?:");
        Elma=inp.nextDouble();
        System.out.print("Kaç kilo Domates aldınız?:");
        Domates=inp.nextDouble();
        System.out.print("kaç kilo Muz aldınız?:");
        Muz=inp.nextDouble();
        System.out.print("Kaç tane Patlıcan aldınız?:");
        Patlican=inp.nextDouble();

        double tutar = (Armut*2.14 + Elma*3.67 + Domates*1.11 + Muz*0.95 + Patlican*5.00);
        System.out.print("Toplam tutar:"+tutar);

    }
}