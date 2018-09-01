interface Animals
{

	void speak();

	void eat();

}

class Cat implements Animals
{

	public void speak(){

		System.out.println("Meow. . .");

	}

	public void eat(){

		System.out.println("I eat Fish.");

	}

}

class Dog implements Animals{

	public void speak(){

		System.out.println("Bow Bow. . .");

	}

	public void eat(){

		System.out.println("I eat meat.");

	}

}

class Interface{

	public static void main(String args[]){

		Animals c=new Cat();

		Animals d=new Dog();

		c.speak();

		c.eat();

		d.speak();

		d.eat();

	}

}

