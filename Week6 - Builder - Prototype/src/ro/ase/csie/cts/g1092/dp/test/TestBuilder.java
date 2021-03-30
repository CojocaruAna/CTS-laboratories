package ro.ase.csie.cts.g1092.dp.test;

import ro.ase.csie.cts.g1092.dp.builder.Pistol;
import ro.ase.csie.cts.g1092.dp.builder.SuperHero;
import ro.ase.csie.cts.g1092.dp.builder.SuperHero.SuperHeroBuilder;
import ro.ase.csie.cts.g1092.dp.builder.SuperHeroesDirector;

public class TestBuilder {

	public static void main(String[] args) {
		//1 approach-base constructor
		//create object
		//SuperHero superHero = new SuperHero();
		//then initialize the object: do NOT forget
		//superHero.name = "SuperMan";
		//superHero.lifePoints = 100;
		//superHero.superPower = "Can fly";
		//superHero.superPower = "Laser eyes";
		//2 approach-constructor
		//SuperHero superHero = new SuperHero("SuperMan",100,false,false,null,new Pistol(),"Laser eyes",null);
		//3 approach-builder-most common in java and .Net
		//builder is the optimal solution
		SuperHero superman = new SuperHero.SuperHeroBuilder("Superman",100)
				.addSuperPower("Fly")
				.addLeftWeapon(new Pistol())
				.build();
		
		SuperHero joker = new SuperHero.SuperHeroBuilder("Joker", 200)
				.isVillain()
				.addLeftWeapon(new Pistol())
				.addRightWeapon(new Pistol())
				.build();
		
	}
	//director stuff
	SuperHeroesDirector catalogue = new SuperHeroesDirector(new SuperHeroBuilder("Joker",200));
	SuperHero jokerClone  = catalogue.buildJoker();

}
