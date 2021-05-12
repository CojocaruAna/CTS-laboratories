package ro.ase.csie.cts.g1092.dp.strategy;

public class Player {

	String username;
	int playTime;
	int experiencePoints;
	
	
	BonusStrategyInterface bonusCampaign = new NoCampaign();
	
	public void setBonusCampaign(BonusStrategyInterface bonusCampaign) {
		this.bonusCampaign = bonusCampaign;
	}

	public Player(String username, int playTime, int experiencePoints) {
		super();
		this.username = username;
		this.playTime = playTime;
		this.experiencePoints = experiencePoints;
	}
	
	public void getExperiencePoints(int pointsReceivedInGame) {
		if(this.bonusCampaign != null) {
			this.bonusCampaign.getBonusPoints(pointsReceivedInGame, this);
		}
	}
	
}
