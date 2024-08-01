package test;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/add")
public class AddEmployeeServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String desg = req.getParameter("desg");
		int bSal = Integer.parseInt(req.getParameter("bsal"));
		float hr = Float.parseFloat(req.getParameter("hra"));
		float d = Float.parseFloat(req.getParameter("da"));
		float hra = hr * bSal;
		float da = d * bSal;
		float totSal = bSal + hra + da;
		
		EmployeeBean eb = new EmployeeBean();
			//loading data to EmployeBean object
		eb.seteId(id);
		eb.seteName(name);
		eb.seteDesg(desg);
		eb.setbSal(bSal);
		eb.setHra(hra);
		eb.setDa(da);
		eb.setTotSal(totSal);
		
		AddEmployeeDAO aed = new AddEmployeeDAO();
		int k= aed.insert(eb);
		if(k>0) {
			RequestDispatcher rd = req.getRequestDispatcher("AddEmployee.jsp");
			rd.forward(req,res);
		}
		

	}

}
