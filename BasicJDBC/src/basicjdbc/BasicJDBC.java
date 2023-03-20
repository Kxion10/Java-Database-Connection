package basicjdbc;

import java.sql.*;

public class BasicJDBC {

    public static void main(String args[]) throws ClassNotFoundException, SQLException {

        try { //Use a try/catch block to catch any database exceptions
            //Create a connection to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind", "root", "admin");

            //Create a new SQL statement using the connection
            Statement stmt = con.createStatement();

            //Execute the SQL statement to retrieve a result set of records from the database.
            ResultSet rs = stmt.executeQuery("select * from categories");  //This SQL query will retrieve all of the records in the categories table

            //Use a while loop to iterate through the resultset of records
            while (rs.next()) {
                //print out the data in each of the columns in the current record
                //The first column contains an integer, so we are calling the getInt method.
                //The remaining three columns are text values, so we are calling the getString method.
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  "
                        + rs.getString(3) + "  " + rs.getString(4));
            }//end while loop

 

//Execute the SQL statement to retrieve a result set of records from the database.
            rs = stmt.executeQuery("select * from categories");  //This SQL query will retrieve all of the records in the categories table

//Use a while loop to iterate through the resultset of records
            while (rs.next()) {
                //print out the data in each of the columns in the current record
                //The first column contains an integer, so we are calling the getInt method.
                //The remaining three columns are text values, so we are calling the getString method.
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  "
                        + rs.getString(3) + "  " + rs.getString(4));
            }//end while loop

//Update a record in the database
            stmt.executeUpdate("INSERT INTO CATEGORIES (categoryID, CategoryName, Description) VALUES (21, \"wood Products\", \"Paper plates and napkins\")");

            //Execute the SQL statement to retrieve a result set of records from the database.
            rs = stmt.executeQuery("select * from categories"); //This SQL query will retrieve all of the records in the categories table

//Use a while loop to iterate through the resultset of records
            while (rs.next()) {
                //print out the data in each of the columns in the current record
                //The first column contains an integer, so we are calling the getInt method.
                //The remaining three columns are text values, so we are calling the getString method.
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  "
                        + rs.getString(3) + "  " + rs.getString(4));
            }//end while loop

//Delete a record from the database
            stmt.executeUpdate("DELETE FROM CATEGORIES WHERE CategoryID = 21;");

//Execute the SQL statement to retrieve a result set of records from the database.
            rs = stmt.executeQuery("select * from categories");  //This SQL query will retrieve all of the records in the categories table

//Use a while loop to iterate through the resultset of records
            while (rs.next()) {
                //print out the data in each of the columns in the current record
                //The first column contains an integer, so we are calling the getInt method.
                //The remaining three columns are text values, so we are calling the getString method.
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  "
                        + rs.getString(3) + "  " + rs.getString(4));
            }//end while loop

            //Execute the SQL statement to retrieve a result set of records from the database.
            rs = stmt.executeQuery("select * from products");  //This SQL query will retrieve all of the records in the categories table

            System.out.println("Display the Northwind products using the column name:");
            //Use a while loop to iterate through the resultset of records
            while (rs.next()) {
                //print out the data in each of the columns in the current record
                //The first column contains an integer, so we are calling the getInt method.
                //The remaining three columns are text values, so we are calling the getString method.
                System.out.println(rs.getInt("ProductID") + "  " + rs.getString("ProductName"));
            }//end while loop
            
            //Execute the SQL statement to retrieve a result set of records from the database.
            rs = stmt.executeQuery("select * from customers");  //This SQL query will retrieve all of the records in the categories table

//Use a while loop to iterate through the resultset of records
            while (rs.next()) {
                //print out the data in each of the columns in the current record
                //The first column contains an integer, so we are calling the getInt method.
                //The remaining three columns are text values, so we are calling the getString method.
                System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  "
                        + rs.getString(3) + "  " + rs.getString(4));
            }//end while loop
            
                        //Execute the SQL statement to retrieve a result set of records from the database.
            rs = stmt.executeQuery("select FirstNAme, LastName from Employees");  //This SQL query will retrieve all of the records in the categories table

//Use a while loop to iterate through the resultset of records
            while (rs.next()) {
                //print out the data in each of the columns in the current record
                //The first column contains an integer, so we are calling the getInt method.
                //The remaining three columns are text values, so we are calling the getString method.
                System.out.println(rs.getString(1) + "  " + rs.getString(2));
            }//end while loop
            
                                    //Execute the SQL statement to retrieve a result set of records from the database.
            rs = stmt.executeQuery("select * from shippers");  //This SQL query will retrieve all of the records in the categories table

//Use a while loop to iterate through the resultset of records
            while (rs.next()) {
                //print out the data in each of the columns in the current record
                //The first column contains an integer, so we are calling the getInt method.
                //The remaining three columns are text values, so we are calling the getString method.
                System.out.println(rs.getInt(1) + "  " + rs.getString(2)+ "  " + rs.getString(3));
            }//end while loop
            
            //Update a record in the database
            stmt.executeUpdate("INSERT INTO Employees (EmployeeID, LastName, FirstName,BirthDate) VALUES (20,\"Kong\", \"Xiong\", 1996-04-05)");

            //Execute the SQL statement to retrieve a result set of records from the database.
            rs = stmt.executeQuery("select * from employees"); //This SQL query will retrieve all of the records in the categories table

//Use a while loop to iterate through the resultset of records
            while (rs.next()) {
                //print out the data in each of the columns in the current record
                //The first column contains an integer, so we are calling the getInt method.
                //The remaining three columns are text values, so we are calling the getString method.
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  "
                        + rs.getString(3)+ "  " + rs.getInt(6));
            }//end while loop

            //Close the connection to the database
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        } //end try catch

    }

}
