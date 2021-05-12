package ro.ase.csie.cts.g1092.dp.command;

public class TestCommand {

	public static void main(String[] args) {
		
		TaskManager taskManager = new TaskManager();
		
		
		taskManager.addAsyncTask(new AsyncCommand("Autosave", new BackUpModule()));
		taskManager.addAsyncTask(new AsyncCommand("Update 3D models", new UpdateModule()));

		System.out.println("Game is running");
		
		taskManager.execute();
		taskManager.execute();
		taskManager.execute();

		System.out.println("Game is running");

	}

}
