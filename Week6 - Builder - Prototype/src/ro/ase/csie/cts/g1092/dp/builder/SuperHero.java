package ro.ase.csie.cts.g1092.dp.builder;

public class SuperHero {
	String name;
	int lifePoints;
	boolean isVillain;
	boolean isWounded;
	
	//String leftWeapon; do not do this,if the object will have attributes,u should implement a class
	WeaponInterface leftWeapon;
	WeaponInterface rightWeapon;
	
	String superPower;
	String superSuperPower;
	
	private SuperHero() {
		
	}

	private SuperHero(String name, int lifePoints, boolean isVillain, boolean isWounded, WeaponInterface leftWeapon,
			WeaponInterface rightWeapon, String superPower, String superSuperPower) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.isVillain = isVillain;
		this.isWounded = isWounded;
		this.leftWeapon = leftWeapon;
		this.rightWeapon = rightWeapon;
		this.superPower = superPower;
		this.superSuperPower = superSuperPower;
		
		
	}
	
	public void takesAHit(int points) {
		this.lifePoints -= points;
		this.isWounded = true;
	}
	
	public void heal(int points) {
		this.lifePoints += points;
		if(this.lifePoints > 100) {
			this.lifePoints = 100;
			this.isWounded = false;
		}
	}
	
	//inner class,is static since we don't need to build and object
	public static class SuperHeroBuilder{
		private SuperHero superhero = null;
		//eager instantiation
		public SuperHeroBuilder(String name,int lifePoints) {
			superhero = new SuperHero();
			superhero.name = name;
			superhero.lifePoints = lifePoints;
			
		}
		
		public SuperHeroBuilder isVillain() {
			superhero.isVillain = true;
			return this;
		}
		public SuperHeroBuilder isWounded() {
			superhero.isWounded = true;
			return this;
		}
		public SuperHeroBuilder addLeftWeapon(WeaponInterface weapon) {
			superhero.leftWeapon = weapon;
			return this;
		}
		public SuperHeroBuilder addRightWeapon(WeaponInterface weapon) {
			superhero.rightWeapon = weapon;
			return this;
		}
		public SuperHeroBuilder addSuperPower(String superPower) {
			superhero.superPower = superPower;
			return this;
		}
		public SuperHeroBuilder addSuperSuperPower(String superSuperPower) {
			superhero.superSuperPower = superSuperPower;
			return this;
		}
		//DO NOT FORGET TO PROVIDE THIS
		public SuperHero build() {
			return this.superhero;
		}
		
	}
	
	
	
	
}
