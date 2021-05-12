package ro.ase.csie.cts.g1092.dp.chain;

public class PrivateMessageHandler extends ChatHandler {

	@Override
	public void processMessage(ChatMessage message) {
		if(message.destination.toLowerCase().equals("@everyone")) {
			if(this.next != null) {
				this.next.processMessage(message);
			}
		}
		else {
			System.out.println("Private message for " + message.destination 
					+ ": " + message.text);
		}
	}

}
