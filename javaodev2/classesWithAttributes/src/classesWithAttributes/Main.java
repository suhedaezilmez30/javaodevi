package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
	Product product =new Product();
	product.name="leptop";
	product.id=1;
	product.description="asus laptop";
	product.price=5000;
	product.stockAmount=3;
	
	ProductManager productManager=new ProductManager();
	productManager.Add(product);
	
	
	
	
	

	}

}
