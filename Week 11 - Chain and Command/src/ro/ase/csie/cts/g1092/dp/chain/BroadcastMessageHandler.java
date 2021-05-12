package ro.ase.csie.cts.g1092.dp.chain;

public class BroadcastMessageHandler extends ChatHandler {

	@Override
	public void processMessage(ChatMessage message) {
		if(message.destination.toLowerCase().equals("@everyone")) {
			System.out.println("@everyone: " + message.text);
		}
		
		if(this.next != null) {
			this.next.processMessage(message);
		}
	}

}
