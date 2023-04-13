package _JDBC.GUN01;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_Intro {
    @Test
    public  void test1() throws SQLException {

        String hostUrl="jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username="root";
        String password="'\"-LhCB'.%k[4S]z";
        //connection açılıyor , fileInputstream
        Connection connection= DriverManager.getConnection(hostUrl,username,password);//bağlantıya click yaptık 1.madde

        Statement statement=connection.createStatement(); //sorguları çalıştırmak için sorgu gönderme ortamı sayi yazılan sayfayı açar.2. madde

        ResultSet rs=statement.executeQuery("select * from customer");//sorguları yazdık gönderip çalıştırdık.3.madde
        //sonuçlar rs de

        //ilk satırı mı istiyorsun son satırı mı 5. satırımı?
        rs.next();//sıradaki satırı verir, şuan 1. satıra gitti
        String firstName=rs.getString("first_name");
        String lastName=rs.getString("last_name");
        System.out.println("Birinci satırın müşteri adı ve soyadı = "+ firstName +" "+ lastName);
        //Birinci satırın müşteri adı ve soyadı = MARY SMITH
        rs.next();
        firstName=rs.getString("first_name");
        lastName=rs.getString("last_name");
        System.out.println("İkinci satırın müşteri adı ve soyadı = "+ firstName +" "+ lastName);
        connection.close();//hafızayı temizledik close diyerek.









    }
}
