package jdbc_mysql_project;

import java.sql.*;

public class jdbcSelect {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1. load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2. Get Connection
        String url ="jdbc:mysql://localhost:3306/mydb1";
        String username ="root";
        String password ="root";
        Connection connection = DriverManager.getConnection(url, username, password);

   //3. Execute the queries
  Statement statement = connection.createStatement();
       ResultSet resultSet = statement.executeQuery("select * from student");
//        //4. use the result
       while (resultSet.next()){
          System.out.println(resultSet.getInt("id")
                   +"\t"+ resultSet.getString("name")
                   +"\t"+ resultSet.getString("email")
                    +"\t"+ resultSet.getString("phone")
                    +"\t"+ resultSet.getString("address")
            );
       }

        //5. close the connection
        System.out.print("connection successfull.");
        connection.close();
    }

}
