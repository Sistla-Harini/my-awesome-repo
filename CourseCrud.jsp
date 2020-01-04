<%@page import="com.del.courses.entity.Courses,com.del.courses.dao.CoursesDAO"%>
<%
  Courses c=(Courses)request.getAttribute("cou");
  if(c==null) c= new Courses();
%>
<html>
<body>
    <form action="CoursesCrudServlet">
    <table align=center width=50% bgcolor=lightblue>
    <tr>
    <th>Courses Id</th>
    <td><input type=text name=cid value=<%=c.getCid()%> %>></td>
    </tr>
    <tr>
    <th>Courses Name</th>
    <td><input type=text name=cname value=<%=c.getCname() %>></td>
    </tr>
    <tr>
    <th>Courses Duration</th>
    <td><input type=text name=duration value=<%=c.getCdura() %>></td>
    </tr>
    <tr>
    <th>Courses Fee</th>
    <td><input type=text name=fee value=<%=c.getCfee() %>></td>
    </tr>
    <tr>
    <td><input type=submit value=Add_Courses name="sub"></td>
    <td><input type=submit value=Show_Courses name="sub"></td>
    </tr>
    <tr>
    <td><input type=submit value=Delete_Courses name="sub"></td>
    <td><input type=submit value=Modify_Courses name="sub"></td>
    </tr>
    </table>
    </form>
</body>
</html>