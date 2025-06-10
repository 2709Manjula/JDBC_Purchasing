package service;

import java.util.Scanner;

import dao.ProductDAO;
import model.Product;

public class ProductService { 
	private final Scanner sc;
	private final ProductDAO productdao;
	public ProductService() {
		sc = new Scanner(System.in);
		productdao = new ProductDAO();

	}

	public void start() {
		boolean exit = false;
		System.out.println("-------WELCOME TO PURCHASING ORDER SYSTEM---------");
		while(!exit) {
			
			System.out.println("\n 1.Add a Product Details");
			System.out.println(" 2.Update Product Details");
			System.out.println(" 3.Delete Product Details");
			System.out.println(" 4.Display Product Details");
			System.out.println(" 5.Exit");
			
			System.out.println(" Select your choice");
			 if (!sc.hasNextInt()) { 
	                System.out.println("Invalid input! Please enter a number between 1 and 5.");
	                sc.next();  
	                continue;
	            }
		
		int choice = sc.nextInt();
		sc.nextLine();

		switch(choice) {
		case 1 :
			addProduct();
			break; 
		case 2 :
			updateProduct();
			break;
		case 3 :
			deleteProduct();
			break;
		case 4 :
			getAllProducts();
			break;
		case 5:
             exit = true;
             System.out.println("Exiting...");
             break;
         default:
             System.out.println("Invalid choice. Please enter a number between 1 and 5.");
     }
	}

}
		 

		//Method for adding ProductDetails
		private void addProduct() {
		    System.out.println("Enter the Product Details");
		    // Entering the product details
			System.out.println("1.ProductId");
			int productId = sc.nextInt();
			sc.nextLine();
			System.out.println("2.ProductName");
			String productName = sc.nextLine();
			System.out.println("3.ProductColor");
			String productColor = sc.nextLine();
			System.out.println("4.ProductPrice");
			Double productPrice = sc.nextDouble();
			System.out.println("5.ProductQuantity");
			int productQuantity = sc.nextInt();
			
			//Accessing private fields
			Product product = new Product(productId,productName,productColor,productPrice,productQuantity);
			productdao.addProduct(product);	
			
	}
        // method for updating ProductDetails
		private void updateProduct() {
		   System.out.println("Enter the Update ProductId");
		   int productId = sc.nextInt();
		   sc.nextLine();
		   
		   //Entering updated product details 
		   System.out.println("Enter new ProductName");
		   String productName = sc.nextLine();
		   System.out.println("Enter new ProductColor");
		   String productColor = sc.nextLine();
		   System.out.println("Enter new ProductPrice");
		   Double productPrice = sc.nextDouble();
		   System.out.println("Enter new ProductQuantity");
		   int productQuantity = sc.nextInt();
		   
		   Product product = new Product(productId,productName,productColor,productPrice,productQuantity);
		   productdao.updateProduct(product);
		   
		
	}   //method for deleting  ProductDetails
		private void deleteProduct() {
			   // Enter the ID to deleted
			   System.out.println("Enter the ProductId to delete");
			   int productId = sc.nextInt();
			  
			   productdao.deleteProduct(productId);
			   System.out.println("Product is deleted succesfully....");
			
		}
		
		 private void getAllProducts() {
				
				
			}

}
