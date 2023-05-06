package myprj;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


class Student{
	String no;
	String name;
	String major;
	String sex;
	String cla;
	public String toString() {
	return "Sno:"+no+"  major:"+major+"  name:"+name+"  sex:"+sex+"  class:"+cla;
}

}


public class Hello {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","123456");
		
		String sql="select*from student";
		
		Statement st=(Statement) conn.createStatement();
		
		ResultSet rs=st.executeQuery(sql);
		
		List<Student> students=new ArrayList<Student>();
		
		while(rs.next()) {
			Student stu=new Student();
			stu.no=rs.getString(5);
			stu.major=rs.getString(4);
			stu.name=rs.getString(3);
			stu.sex=rs.getString(2);
			stu.cla=rs.getString(1);
			
			students.add(stu);
		}
		for(Student student:students) {
			System.out.println(student);
		}
		
		System.out.println(students.size());
		rs.close();
		st.close();
		conn.close();
	}

}
