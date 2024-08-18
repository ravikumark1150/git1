package test;

import java.util.*;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewEmployeesServlet extends HttpServlet{
	@Override
 protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException ,IOException {
	 
	 EmployeesDAO eld = new EmployeesDAO();
	 ArrayList<EmployeeBean> al=eld.retrieve();
	 req.setAttribute("alist",al);//Addig Attribute to request object
	 RequestDispatcher rd = req.getRequestDispatcher("ViewEmployees.jsp");
	 rd.forward(req,res);
 }
}
