public class Fruits {
	String name, colour;
	double weight;
	public Fruits(String name) {
		this.name = name;
	    System.out.println("Fruit constructor is invoked");
	  }
}

class Apple extends Fruits{
	public Apple(String name, double weight) {
		super (name);
		this.weight = weight;
	    System.out.println(this.name + " constructor is invoked");
	    System.out.println(this.name + " weight is " + this.weight + "kg");
	  }
}

class RedApple extends Apple{
	public RedApple(String name, String colour, double weight) {
		super (name, weight);
		this.colour = colour;
		System.out.println("Colour = " + this.colour);
	}
}

class GreenApple extends Apple{
	public GreenApple(String name, String colour, double weight) {
		super (name, weight);
		this.colour = colour;
		System.out.println("Colour = "+this.colour);
	}
}

class Mango extends Fruits{
	public Mango(String name, String colour, double weight) {
		super (name);
		this.colour = colour;
		this.weight = weight;
	    System.out.println(this.name + " constructor is invoked");
	    System.out.println(this.name + " colour is "+ this.colour);
	    System.out.println(this.name + " weight is " + this.weight + "kg");
	  }
}

class Durian extends Fruits{
	public Durian(String name, String colour, double weight) {
		super (name);
		this.colour = colour;
		this.weight = weight;
		System.out.println(this.name + " constructor is invoked");
	    System.out.println(this.name + " colour is "+ this.colour);
	    System.out.println(this.name + " weight is " + this.weight + "kg");
	}
}

class Main {
	public static void main(String[] args) {
		Apple a = new Apple("Apple", 0.4);
		System.out.println();
		RedApple b = new RedApple("Red Apple", "Red", 0.6);
		System.out.println();
		GreenApple c = new GreenApple("Green Apple", "Green", 0.5);
		System.out.println();
		Mango d = new Mango("Mango","Yellow", 1.0);
		System.out.println();
		Durian e = new Durian("Durian", "Green",  2.0);
	}
}
