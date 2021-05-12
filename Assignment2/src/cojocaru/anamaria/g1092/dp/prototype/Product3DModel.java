package cojocaru.anamaria.g1092.dp.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Product3DModel  {
	String color;
	int height;
	
	ArrayList<Integer> points;
	
	public Product3DModel (String color, int height) {

		System.out.println("Loading the 3D model...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		this.points = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 20; i++) {
			this.points.add(random.nextInt(1000));
		}

		System.out.println("Applying color...");
		this.color = color;
		this.height = height;
		System.out.println("Rendering final model...");
	}
	private Product3DModel () {
		
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Product3DModel  copy = new Product3DModel ();
		copy.color = this.color;
		copy.height = this.height;
		copy.points = (ArrayList<Integer>) this.points.clone();
		return copy;
		
	}
}
