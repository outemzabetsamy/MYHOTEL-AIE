<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="dz.myhotel.bdd.ConnectBdMyHotel"%>
<%@page import="dz.myhotel.bdd.AES"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        
        <title>JSP Page</title>
    </head>
    <body>
        <div id="numerochambre1"></div>

        <select name="numerochambre2" id="numerochambre2">
            <option disabled="">Select chambre</option>
            <%
            AES aes=new AES();
             String secret="ssshhhhhhhhhhh!!!!";
                String type =request.getParameter("type");
            System.out.println("iwdheeeeed "+type);
                ConnectBdMyHotel cn= new ConnectBdMyHotel();
                System.out.println("avant cn.connect()");
              cn.connect();
              System.out.println("avant statement");
                Statement st = cn.connect().createStatement();
                System.out.println("apres statement )");
                ResultSet rs = st.executeQuery("select * from chambre where typechambre='" + aes.encrypt(type, secret) + "'");
                System.out.println("aprres RS");
                while (rs.next()) {
                	System.out.println("ikchem ar while");
            %>
            <option value="<%=aes.decrypt(rs.getString("numchambre"), secret)%>"><%=aes.decrypt(rs.getString("numchambre"), secret)%></option>
            <%
            System.out.println("num: "+rs.getString("numchambre"));  }
            %>
        </select>

    </body>
</html>