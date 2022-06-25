package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Query05 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/okul?serverTimezone=UTC", "root", "1234");
        Statement st = con.createStatement();

        /*
        //SORU: Isciler adinda bir tablo olustur. id int, birim VARCHAR(10), maas int
        String sorgu = "create table isciler (id int,birim VARCHAR(10),maas int);";
        st.execute(sorgu);
        System.out.println("Isciler tablosu olusturuldu.");
        /*


        /*
        //SORU: Isciler tablosunu sil
        st.execute("drop table isciler");
        System.out.println("isciler tablosu silindi");
        */

        /*
        //SORU: Isciler tablosunda soyisim varchar(20), sehir varchar(10) adinda 2 sütun ekleyin
        st.execute("alter table isciler add soyisim varchar(20)");
        st.execute("alter table isciler add sehir varchar(10)");
        System.out.println("iki sütun eklendi");
        */

        /*
        //SORU: Isciler tablosundaki sehir sütunun ismini ülke olarak degistirin
        st.execute("alter table isciler rename column sehir to ülke");
        System.out.println("Sütun ismi degistirildi");
        */

        /*
        //SORU: Tablonun ismini employee olarak degistirin
        st.execute("alter table isciler rename to employee");
        System.out.println("Tablonun ismi degistirildi.");
        */

        //SORU: Ulke sütunun data türünü char(30) yapin
        st.execute("alter table employee modify ülke char(30)");
        System.out.println("Data türü degistirildi.");


    }
}
