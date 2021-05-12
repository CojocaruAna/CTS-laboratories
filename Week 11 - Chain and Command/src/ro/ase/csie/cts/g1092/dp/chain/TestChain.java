package ro.ase.csie.cts.g1092.dp.chain;

public class TestChain {

	public static void main(String[] args) {
		
		ChatHandler broadcastNode = new BroadcastMessageHandler();
		ChatHandler privateNode = new PrivateMessageHandler();
		ChatHandler filterNode = new EnglishFilter(7);
		
		filterNode.setNext(privateNode);
		privateNode.setNext(broadcastNode);
		

		
		ChatHandler chatServer = filterNode;

		chatServer.processMessage(new ChatMessage("@everyone", "Hi everyone!", 0));
		chatServer.processMessage(new ChatMessage("@everyone", "hit it, it's a bot", 0));
		chatServer.processMessage(new ChatMessage("@John", "Let's join the party", 0));
	}

}
