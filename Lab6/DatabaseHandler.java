package org.example;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.*;

public class DatabaseHandler extends Config {
    Connection dbConnection;

    public Connection getDbConnection()
            throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" +
                dbPort + "/" + dbName;
        Class.forName("com.mysql.cj.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
        return dbConnection;
    }

    public void addProduct(String productName, String productType, String price,String availability) {
        String insert = "INSERT INTO " + Const.PRODUCT_TABLE + "(" + Const.PRODUCT_NAME + ", " +
                Const.PRODUCT_TYPE + ", " + Const.PRODUCT_PRICE + ", " +
                Const.PRODUCT_AVAILABILITY + ") VALUES (?, ?, ?, ?)";
        try {
                System.out.println("Successful");
                PreparedStatement prSt = getDbConnection().prepareStatement(insert);
                prSt.setString(1, productName);
                prSt.setString(2, productType);
                prSt.setString(3, price);
                prSt.setString(4, availability);
                prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void outputInfo(){
        String select = "Select * from " + Const.PRODUCT_TABLE;
        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(select);
            ResultSet resSet = preparedStatement.executeQuery();
            while(resSet.next()){
                Product product = new Product();
                product.setId(resSet.getInt(1));
                product.setProductName(resSet.getString(2));
                product.setProductType(resSet.getString(3));
                product.setPrice(resSet.getInt(4));
                product.setAvailability(resSet.getInt(5));
                System.out.println(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateProduct(int newId, int newPrice, int newAvailability, int currentId){
        String update = "UPDATE " + Const.PRODUCT_TABLE + " SET id = ?, price =  ?, availability = ? WHERE id = ?" ;
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = getDbConnection().prepareStatement(update);
            preparedStatement.setInt(1, newId);
            preparedStatement.setInt(2, newPrice);
            preparedStatement.setInt(3, newAvailability);
            preparedStatement.setInt(4, currentId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteProduct(int id){
        String delete = "Delete from " + Const.PRODUCT_TABLE + " WHERE id = ?";
        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(delete);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
