package ro.ase.csie.cts.g1092.dp.composite;

public class NPCCharacter extends AbstractNode {
	
	String name;
	int power;

	public NPCCharacter(String name, int power) {
		super();
		this.name = name;
		this.power = power;
	}

	@Override
	public void attack(String playerName) {
		System.out.println(String.format("%s is attacking %s", this.name, playerName));
	}

	@Override
	public void retreat() {
		System.out.println(String.format("%s is retreating", this.name));
	}

	@Override
	public void move() {
		System.out.println(String.format("%s is moving", this.name));
	}

	//no hierarchy -> throw an error for operations that don't make sense
	//we can also implement the methods in AbstractNode class, for a cleaner class
	@Override
	public void addNode(AbstractNode node) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void removeNode(AbstractNode node) {
		throw new UnsupportedOperationException();
	}

	@Override
	public AbstractNode getNode(int key) {
		throw new UnsupportedOperationException();
	}

}
