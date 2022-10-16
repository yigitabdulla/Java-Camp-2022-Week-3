package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product1 = new Product();
		
		product1.name = "Mouse";
		product1.price = 1000;
		
		manager.add(product1);
		
		DatabaseHelper.Crud.delete();
	}

}
