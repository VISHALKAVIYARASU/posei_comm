import java.sql.*;
class JDBC_DEMO{
    public static void main(String[] args) throws Exception{
        //Class.forName("com.mysql.jdbc.Driver");
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        String url="jdbc:mysql://localhost:3306/employee";
        String userName="root";
        String passWord="Kavint#07";
        Connection con=DriverManager.getConnection(url,userName,passWord);
        if(con.isClosed()){
            System.out.println("closed");
        }
        else{
            System.out.println("open");
        }
        Statement st=con.createStatement();
        ResultSet res=st.executeQuery("select * from emp;");
        while(res.next()){
            System.out.println(res.getInt(1)+res.getString(2)+res.getInt(3));
        }
    }
}