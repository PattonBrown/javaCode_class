package finalTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Log {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sale","root","123456");
		
		
		System.out.println("欢迎使用****超市收银系统，请登录");
		String sql="SELECT * FROM tuser WHERE userName=? AND password=?";
		
		PreparedStatement pstm=conn.prepareStatement(sql);
		for(int i=1;i<=3;i++) {
		System.out.println("UserName：");
		Scanner scanner=new Scanner(System.in);
		String userNameString=scanner.nextLine();
		pstm.setString(1, userNameString);
		System.out.println("Password：");
		String passwordString=scanner.nextLine();
		pstm.setString(2, passwordString);
		
		ResultSet rs=pstm.executeQuery();
		
			if(rs.next()) {
			System.out.println("Welcome!");
			System.out.println("Welcome to use this System!");
			Date date=new Date();
			SimpleDateFormat sdmt=new SimpleDateFormat("yyyy年MM月dd日,HH:mm:ss");
			System.out.println("The server now:"+rs.getString("chrName"));
			System.out.println("The time now:"+sdmt.format(date));
			break;
		}
		else {
			System.out.println("Sorry!"+" You have"+(3-i)+" choices now");
		}
			if(i==3) {
				System.out.println("you have no choice!");
			}
		}
		
		
	}
}
