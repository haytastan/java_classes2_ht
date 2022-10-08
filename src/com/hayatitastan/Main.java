package com.hayatitastan;

/**
 * Created by Dr. Hayati TASTAN on 3.10.2022
 **/

public class Main {
    public static void main(String[] args) {

        // classes

        //variables of value type:
        int sayi1 = 10; // int, double, String, boolean tipindeki değişkenler value tipindedir.
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1= 30;
        System.out.println(sayi2);  //Ekrana 30 yazar.
        // value türündeki değişkenlerin tamamı,
        // yani hem değişken tanımlaması hem de değişken değeri,
        // STACK belleğinde tutulur.

        //variables of reference type:
        int[] sayilar1 = new int[]{1,2,3}; //diziler ve class'lar referans tipinde değişkenlerdir.
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0] =10;
        System.out.println(sayilar2[0]); // Ekrana 10 yazar.
        // REFERENCE türündeki değişkenlerin
        // tanımlamaları (yani referans değerleri, adresleri) STACK belleğinde,
        // değerleri ise HEAP belleğinde (adreslerin gösterdiği yerde) tutulur.

        // variables of reference type:
        CustomerManager manager1 = new CustomerManager();
        CustomerManager manager2 = new CustomerManager();
        manager1 = manager2; //manager için STACK belleğindeki referans (adres) değeri,
        // HEAP tamındaki manager değişkeni değerine değil, manager2 değişkeni değerine işaret eder.

        manager2.setName("Hayati"); // 2 inci manager adına değer olarak hayati verildi
        System.out.println(manager1.getName()); // STACK'teki 1 inci manager HEAP'teki 2 inci manager değerine işaret etiğinden
        // 1 inci manager adı da aynı değer yani hayati olarak ekrana yazılır.

    }
}
