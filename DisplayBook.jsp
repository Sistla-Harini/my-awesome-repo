<%@page isELIgnored="false" %>
<!DOCTYPE html>
<body>
     <form action="bkCRUD">
     <table align=center width=50%>
     <tr>
     <th> Book Id</th>
     <td><input type=text name=bid value=${bk.bid }></td>
     </tr>
     <tr>
     <th>Book Name</th>
     <td><input type=text name=bname value=${bk.bname }></td>
     </tr>
     <tr>
     <th>Book Price</th>
     <td><input type=text name=price value=${bk.price }></td>
     </tr>
     <tr>
     <th>Book Author</th>
     <td><input type=text name=author value=${bk.author }></td>
     </tr>
     <tr>
     <td><input type=submit value="Add_Book" name="sub"></td>
     <td><input type=submit value="Del_Book" name="sub"></td>
     <td><input type=submit value="Mod_Book" name="sub"></td> 
     <td><input type=submit value="Get_Book" name="sub"></td> 
     </tr>
     </table>
     </form>
</body>
</html>