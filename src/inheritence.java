class product {
	// Attributes
	int pid;
	String name;
	int price;

	product() {
		System.out.println("product objects constructed");
	}

	// methods
	void setProductDetails(int pid, String name, int price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
		System.out.println("data writen in prouduct object");
	}

	void showProductDetails() {

		System.out.println("product" + pid);
		System.out.println("name" + name);
		System.out.println("price" + price);

	}

	// getter and setter methods
	void setpid(int pid) {
		this.pid = pid;
	}

	int getpid() {
		return pid;
	}
}

class Mobile extends product {

	String os;
	int ram;

	Mobile() {
		System.out.println("Mobile object is constructed");
	}

	void setProductDetails(int pid, String name, int price, String os, int ram) {
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.os = os;
		this.ram = ram;
		System.out.println("data writen in mobile object");
	}

	void showProductDetails() {

		System.out.println("product" + pid);
		System.out.println("name" + name);
		System.out.println("price" + price);
		System.out.println("Os:" + os);
		System.out.println("ram:" + ram);
	}

}

public class inheritence {
	public static void main(String arg[]) {
		/*
		 * product p= new product(); System.out.println("product is :"+p);
		 * p.setProductDetails(101,"iphone" ,7000); p.showProductDetails(); product p2=
		 * new product(); p2.pid=201; p2.name="nike"; p2.price=5000;
		 * p2.showProductDetails();
		 */
		Mobile m = new Mobile();
		m.setProductDetails(301, "iphonex", 233000);
		m.showProductDetails();
		m.setProductDetails(300, "iphonexx", 6000000, "ios", 67);
		m.showProductDetails();
	}
}
