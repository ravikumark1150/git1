<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*,test.EmployeeBean"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{
background-color:blue;
text-align:center;
   color:yellow;
 backgroud-position:center center;
 text-decoration:underline;
}
.box{
width:760px;
height:200px;
border:3px solid black;
background-color:lightgray;
text-align:center;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><div style="font-size:33px; font-style:italic;font-weight:bold; font-family:fort;"class="box">
	<%
	ArrayList<EmployeeBean> al = (ArrayList<EmployeeBean>) request.getAttribute("alist");
	Iterator<EmployeeBean> it = al.iterator();
	while (it.hasNext()) {
		EmployeeBean eb = (EmployeeBean) it.next();
		out.println(eb.geteId()+"&nbsp&nbsp"+eb.geteName()+ "&nbsp&nbsp" + eb.geteDesg()+"&nbsp&nbsp" + eb.getbSal()
		+ "&nbsp&nbsp"+eb.getHra()+"&nbsp&nbsp"+eb.getDa()+"&nbsp&nbsp"+ eb.getTotSal() + "<br>");
	}
	
	%>
	<%@include file="home.html"%>
</div>
</body>
</html>