package ro.ase.csie.cts.g1092.dp.builder;

public class SuperHeroesDirector {
	SuperHero.SuperHeroBuilder builder;
	public SuperHeroesDirector(SuperHero.SuperHeroBuilder builder) {
		this.builder = builder;
	}
	public SuperHero buildJoker() {
		return builder
				.isVillain()
				.addLeftWeapon(new Pistol())
				.addRightWeapon(new Pistol())
				.build();
	}
	public SuperHero buildSuperman() {
		return builder.addSuperPower("Fly")
				.addLeftWeapon(new Pistol())
				.build();
	}
}
