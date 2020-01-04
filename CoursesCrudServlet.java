package com.del.courses.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.del.dao.CoursesDAO;
import com.del.courses.entity.Courses;
@WebServlet("/CoursesCrudServlet")
public class CoursesCrudServlet extends HttpServlet
{
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String submit = request.getParameter("sub");
		CoursesDAO cdao= new CoursesDAO();
		Courses c = new Courses();
	    String message="successfully";
	    c.setCid(Integer.parseInt(request.getParameter("cid")));
	    RequestDispatcher rd= request.getRequestDispatcher("CourseCrud.jsp");
	    if(submit.equals("Add_Courses")|| submit.equals("Modify_Courses"))
	    {
	    	c.setCname(request.getParameter("cname"));
	    	c.setCdura(Integer.parseInt(request.getParameter("cdura")));
	    	c.setCfee(Integer.valueOf(request.getParameter("cfee")));
	    	if(submit.equals("Add_Courses"))
	    	{
	    		cdao.insertCourses(c);
	    		message=message+"Inserted Record";
	    	}
	    	else
	    	{
	    		cdao.modifyCourses(c);
	    		message=message+"Modified Record";
	    	}
	    }
	    else if(submit.equals("Delete_Courses"))
	    {
	    	if(cdao.removeCourses(c.getCid()))
	    		message=message+"Record Deleted";
	    	else
	    		message="Deletion Failed";
	    }
	    else if(submit.equals("Show_Courses"))
	    {
	      c= cdao.getCourses(c.getCid());
	      request.setAttribute("cou", c);
	      
	    }
		out.print("<h1><center>"+message+"</center></h1>");
	    rd.include(request, response);
	    
	    {
	    	
	    }

}
}
