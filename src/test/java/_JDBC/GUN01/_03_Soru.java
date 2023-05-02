package _JDBC.GUN01;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_Soru extends JDBCParent {
    //city tablosundaki tüm kayıtlardaki isimleri next ile yazdırınız

    @Test
    public void test1() throws SQLException {
        ResultSet rs= statement.executeQuery("select city from city");
        int rowCount=0;
       while (rs.next()){

           System.out.println(rs.getString("city"));
           rowCount++;
       }
        System.out.println("rowCount = " + rowCount);
        //TODO :city tablosundaki tüm kayıtlardaki isimleri absolute ile yazdırınız
        // TODO :city tablosundaki tüm kayıtlardaki isimleri relative ile yazdırınız


    }
    @Test
    public void test2() throws SQLException {
        ResultSet rs= statement.executeQuery("select city from city");
        int rowCount=0;
        while (rs.absolute(1)){
            rs.next();
            System.out.println(rs.getString("city"));
            rowCount++;
        }
        System.out.println("rowCount = " + rowCount);
    }
}
