package ro.ase.csie.cts.g1092.dp.chain;

public class EnglishFilter extends ChatHandler {

	public static String[] forbiddenWords = new String[] {"violent", "hit", "kill"};
	
	
	public int agelimit;
	
	public EnglishFilter(int agelimit) {
		super();
		this.agelimit = agelimit;
	}

	@Override
	public void processMessage(ChatMessage message) {
		boolean isSafe = true;
		for(String word : forbiddenWords) {
			if(message.text.toLowerCase().contains(word)) {
				isSafe = false;
				break;
			}
		}
		
		if(isSafe) {
			if(this.next != null) {
				this.next.processMessage(message);
			}
		}
	}

}
