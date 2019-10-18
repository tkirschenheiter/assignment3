

public class Fruit {
	String name;
	String taste;
	Double size;
	
	public Fruit (String name, String taste, Double size) {
		this.name = name;
		this.taste = taste;
		this.size = size;
	}

	public Fruit () {
	
	}
	
	public static void main(String[] args) {
		Fruit apple = new Apple();
		Fruit orange = new Orange();
		
		apple.eat();
		orange.eat();
	}
	
	public void eat() {
		System.out.printf("Fruit tastes good \n");	
	}
}
