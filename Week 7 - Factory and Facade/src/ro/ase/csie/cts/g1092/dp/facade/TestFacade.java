package ro.ase.csie.cts.g1092.dp.facade;

public class TestFacade {

	public static void main(String[] args) {
		
		// in order to connect to the game from an external application, you need to:
		/*
		 * // 1. create player profile and login
		 * 
		 * PlayerProfile profile = new PlayerProfile();
		 * profile.login();
		 * profile.getUserSettings();
		 * 
		 * // 2. check subscription
		 * Subscription subscription = new Subscription();
		 * subscription.checkSubscription();
		 */
		
		
		GameAPIFacade.createProfileAndConnect();
		
		// 3. get the main character
		SuperHero superHero = new SuperHero("Superman", new Helmet(), new SuperPower());
		
	}

}
