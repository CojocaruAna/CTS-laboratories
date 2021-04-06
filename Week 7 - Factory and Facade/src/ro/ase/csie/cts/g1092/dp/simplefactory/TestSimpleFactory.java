package ro.ase.csie.cts.g1092.dp.simplefactory;

public class TestSimpleFactory {

	public static void main(String[] args) {
		
		SuperHero superman = new SuperHero("SuperMan");
		// superman.setWeapon(new Bazooka("Boom"));
		// superman.setWeapon(new MachineGun("MG", 500, 250));
		
		
		// SIMPLE FACTORY
		AbstractWeapon bazooka = WeaponsFactory.getWeapon(WeaponType.BAZOOKA, "BOOM");
		superman.setWeapon(bazooka);
		superman.setWeapon(WeaponsFactory.getWeapon(WeaponType.MACHINE_GUN, "MG"));
	}

}
