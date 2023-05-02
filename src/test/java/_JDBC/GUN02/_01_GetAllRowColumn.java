package _JDBC.GUN02;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class _01_GetAllRowColumn extends JDBCParent {
    @Test
    public void test1() throws SQLException {
        // language tablosundaki tüm satırları ve tüm sütunları yazdırınız,
        // aynı mysql sonuç ekranında olduğu gibi
        ResultSet rs= statement.executeQuery("select * from language");
        ResultSetMetaData rsmd= rs.getMetaData();
        //int columnCount= rsmd.getColumnCount();
       // System.out.println("columnCount = " + columnCount);

        for (int i = 1; i <=rsmd.getColumnCount(); i++) {
            System.out.print(rsmd.getColumnName(i)+"\t");
        }
        System.out.println();
        while (rs.next())
        {
            for (int i = 1; i <=rsmd.getColumnCount() ; i++) {
                System.out.print(rs.getString(i)+"\t");
            }
            System.out.println();
        }
    }

    @Test
    public void test2() throws SQLException {
        ResultSet rs= statement.executeQuery("select * from store");
        ResultSetMetaData rsmd= rs.getMetaData();
        //int columnCount= rsmd.getColumnCount();
        // System.out.println("columnCount = " + columnCount);

        for (int i = 1; i <=rsmd.getColumnCount(); i++) {
            System.out.print(rsmd.getColumnName(i)+"\t");
        }
        System.out.println();
        while (rs.next())
        {
            for (int i = 1; i <=rsmd.getColumnCount() ; i++) {
                System.out.print(rs.getString(i)+"\t");
            }
            System.out.println();
        }
    }


    @Test
    public void test3() throws SQLException {
        //bir metoda sorguyu("select * from language") gönderiniz,
        // metod size sorgunun datasını bir ArrayList olarak döndürsün

     String sql="select * from language";
        ArrayList<ArrayList<String>> donenSonuc=getListData(sql);
        System.out.println("donenSonuc = " + donenSonuc);


    }
    public ArrayList<ArrayList<String>> getListData(String sql) throws SQLException {

        ArrayList<ArrayList<String>> tablo = new ArrayList<>();
       try {

           ResultSet rs = statement.executeQuery(sql);
           while (rs.next()) {
               ArrayList<String> satir = new ArrayList<>();
               for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                   satir.add(rs.getString(i));
               }
               tablo.add(satir);


           }
       }
       catch (Exception e){
           System.out.println("e.getMessage() = " + e.getMessage());
       }


        return tablo;
    }


}
