package ro.ase.csie.cts.g1092.dp.factorymethod;

import ro.ase.csie.cts.g1092.dp.simplefactory.AbstractWeapon;
import ro.ase.csie.cts.g1092.dp.simplefactory.SuperHero;
import ro.ase.csie.cts.g1092.dp.simplefactory.WeaponType;
import ro.ase.csie.cts.g1092.dp.simplefactory.WeaponsFactory;

public class TestFactoryMethod {

	public static void main(String[] args) {
		
		SuperHero superman = new SuperHero("SuperMan");
		
		boolean kidsMode = true;
		
		AbstractWeaponsFactory abstractFactory = null;
		
		if(kidsMode) {
			abstractFactory = new WaterWeaponsFactory();
		} else {
			// WeaponsFactory from Simple Factory is static
			// and cannot be instantiated like WaterWeaponsFactory
			// in Simple Factory we can go for static - it is only one factory
			abstractFactory = new RealWeaponsFactory(); 
		}
		
		AbstractWeapon bazooka = abstractFactory.getWeapon(WeaponType.BAZOOKA, "BOOM");
		superman.setWeapon(bazooka);
		superman.setWeapon(WeaponsFactory.getWeapon(WeaponType.MACHINE_GUN, "MG"));
	}

}
