package _JDBC.GUN01;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_NexPrevAbsRel extends JDBCParent {
    @Test
    public void nextPrev() throws SQLException {
        ResultSet rs=statement.executeQuery("select * from language");

        rs.next();//ilk satır---çıktı English
        System.out.println("1.satır diladi="+ rs.getString(2));

        rs.next();//2. satır ---çıktı Italian
        System.out.println("1.satır diladi="+ rs.getString(2));//rs.getString(2) buradaki 2 column sırası

        rs.next();//3. satır ---çıktı Japanese
        System.out.println("1.satır diladi="+ rs.getString(2));//rs.getString(2) buradaki 2 column sırası

        rs.previous();// bir önceki satıra geri gider --- çıktı Italian
        System.out.println("1 geri satır diladi="+ rs.getString(2));


    }
    //rs.next(); bir sonraki satır git demek
    //rs.previous(); bir önceki satıra git demek
    //rs.absolute(10); baştan itibaren 10. satıra git
    //rs.relative(10); bulunduğu yerden 10. satıra gider
    //rs.absolute(-10); (-) eksi sondan 10. satıra gider
    //rs.relative(-5);  (-) eksi bulunduğu yerden 5 satır geri gider
    @Test
    public void AbsoluteRelative() throws SQLException {
        ResultSet rs=statement.executeQuery("select * from film");

        rs.absolute(10);//10. satıra git demek
        System.out.println("10. satır title = "+rs.getString("title"));   // ALADDIN CALENDAR

        rs.relative(5); //15. satıra gider niye?=çünkü en son bulunduğu yerden 5 satır gider
        System.out.println("15. satır title = "+rs.getString("title"));  // ALIEN CENTER

        rs.absolute(-10);//sondan 10. satıra git
        System.out.println("Sondan 10. satır = " + rs.getString("title"));   //WORST BANGER


    }
}
