package com.neotech.lesson25;

public abstract class Phone {

	// implemented methods
	public void call() {
		System.out.println("every phones can make calls!");

	}

	public void text() {
		System.out.println("phones can send text!");
	}

	// un-implemented methods/ abstract method/undefined
	public abstract void takePicture();

	public abstract void playMusic();

}

class iPhone extends Phone {

	@Override
	public void takePicture() {

		System.out.println("Iphones can tahe good pictures");
	}

	@Override
	public void playMusic() {

	}
}
