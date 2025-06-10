package client;

import service.ProductService;

public class Main {

	public static void main(String[] args) {
           ProductService productservice = new ProductService();
           productservice.start();

	}

}