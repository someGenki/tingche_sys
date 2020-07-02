import com.ting.dao.RoleMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.*;

public class Test1 {

    @Autowired
    RoleMapper mapper;

    @Test
    public  void show(){
        System.out.println("show");
    }
    @Test
    public void visMySQL() throws SQLException {
        //如果运行失败 那就是pom里的mysql驱动太老
        Connection lyq = DriverManager.getConnection("jdbc:mysql://47.106.208.132:3306/ting", "lyq", "123456");
        PreparedStatement ps = lyq.prepareStatement("select * from role");
        ResultSet rst = ps.executeQuery();
        while (rst.next()){
            System.out.println("id:"+rst.getString(1));
            System.out.println("degree:"+rst.getString(2));
            System.out.println("comment:"+rst.getString(3));
        }
        ps.close();
        lyq.close();

    }
}
