package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Product;

public class ProductDAO {// Database name => product_purchasingorder Product table name => productdetails
	private static final String URL = "jdbc:mysql://localhost:3306/product_purchasingorder";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "manjula2709@";
	private static final String ADD_PRODUCT_SQL = "INSERT INTO productdetails (productId,productName,productColor,productPrice,productQuantity) VALUES (?,?,?,?,?)";
	private static final String UPDATE_PRODUCT_SQL = "UPDATE productdetails SET productName=? , productColor=? , productPrice=? ,productQuantity=? WHERE productId=?";
	private static final String DELETE_PRODUCT_SQL = "DELETE FROM productdetails WHERE productId=?";

	public void addProduct(Product product) {
		
		try {
			
			Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			PreparedStatement ps = con.prepareStatement(ADD_PRODUCT_SQL);
			ps.setInt(1, product.getProductId());
			ps.setString(2, product.getProductName());
			ps.setString(3, product.getProductColor());
			ps.setDouble(4, product.getProductPrice());
			ps.setInt(5, product.getProductQuantity());
			ps.executeUpdate();
			System.out.println("Product is added successfully....");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateProduct(Product product) {
		try {
			
			Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			PreparedStatement ps = con.prepareStatement(UPDATE_PRODUCT_SQL);

			ps.setInt(1, product.getProductId());
			ps.setString(2, product.getProductName());
			ps.setString(3, product.getProductColor());
			ps.setDouble(4, product.getProductPrice());
			ps.setInt(5, product.getProductQuantity());
			ps.executeUpdate();

			System.out.println("Product Details Updated successfully....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deleteProduct(int productId) {
		try {
			Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			PreparedStatement ps = con.prepareStatement(DELETE_PRODUCT_SQL);
			ps.setInt(1, productId);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
