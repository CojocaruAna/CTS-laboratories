package ro.ase.csie.cts.g1092.dp.decorator;

public class WoundedDecorator extends AbstractDecorator {

	public WoundedDecorator(SuperHeroCharacter decoratedObject) {
		super(decoratedObject);
	}

	@Override
	public void move() {
		//super.move();
		//new implementation - wounded move
		System.out.println("The hero is barely moving because of its wounds");
	}

}
