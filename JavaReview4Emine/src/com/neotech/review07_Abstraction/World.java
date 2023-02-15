package com.neotech.review07_Abstraction;

public class World {
	public static void main(String[] args) {

		// Human h1=new Human("Melih");//we can not create an object from Human class
		// because it is abstract

		Human a1 = new Albanian("Valbona");// up-casting==this can done only because of inheritance and also
											// down-casting
		a1.talk();
		a1.sleep();

		Human t1 = new Turkish("Vane");// up-casting
		t1.talk();
		t1.sleep();

		Turkish tur = (Turkish) t1;// down=casting

		tur.makeBaklava();

	}

}
