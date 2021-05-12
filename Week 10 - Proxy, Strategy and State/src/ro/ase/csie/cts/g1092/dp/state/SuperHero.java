package ro.ase.csie.cts.g1092.dp.state;

public class SuperHero {

	public static final int CRITICAL_VALUE = 50;
	public static final int WOUNDED_VALUE = 200;

	String name;
	int lifePoints;

	// must be initialized in STATE design pattern! (here or in constructor)
	// set state method not mandatory (like for strategy)
	MoveStateInterface moveState = null;

	public SuperHero(String name, int lifePoints) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.moveState = new NormalState();
	}

	public void move() {
		if (this.moveState != null) {
			this.moveState.moveAtDifferentLocation();
		} else {
			throw new UnsupportedOperationException();
		}
	}

	public void takeAHit(int points) {
		this.lifePoints -= points;
		if (this.lifePoints <= 0) {
			this.moveState = new GameOverState();
		} else {
			if (this.lifePoints <= CRITICAL_VALUE) {
				this.moveState = new CriticalWoundedState();
			} else {
				if (this.lifePoints <= WOUNDED_VALUE) {
					this.moveState = new WoundedState();
				}
			}
		}
	}

	public void heal(int points) {
		this.lifePoints += points;
		if (this.lifePoints > WOUNDED_VALUE) {
			this.moveState = new NormalState();
		} else {
			if (this.lifePoints > CRITICAL_VALUE) {
				this.moveState = new WoundedState();
			}
		}
	}
}