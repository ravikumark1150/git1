package test;

import java.util.*;
import java.sql.*;

public class EmployeesDAO {

	public ArrayList<EmployeeBean> al = new ArrayList<EmployeeBean>();

	public ArrayList<EmployeeBean> retrieve() {
		try {
			Connection con = DBConnection.getCon();// Accsessing existing object
			PreparedStatement ps = con.prepareStatement("select * from employee61");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				EmployeeBean eb = new EmployeeBean();
				eb.seteId(rs.getString(1));
				eb.seteName(rs.getString(2));
				eb.seteDesg(rs.getString(3));
				eb.setbSal(rs.getInt(4));
				eb.setHra(rs.getFloat(5));
				eb.setDa(rs.getFloat(6));
				eb.setTotSal(rs.getFloat(7));
				al.add(eb);
					
			}//while
					} catch (Exception e) {
			System.out.println(e.toString());
		}
		return al;
	}
	
}
