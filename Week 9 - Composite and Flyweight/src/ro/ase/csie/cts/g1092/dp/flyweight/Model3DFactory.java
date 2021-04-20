package ro.ase.csie.cts.g1092.dp.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Model3DFactory {

	static Map<String, Model3DFlyweightInterface> models = new HashMap<>();
	
	
	static {
		models.put(Model3DType.SOLDIER.toString(), new Model3DFlyweight());
		models.put(Model3DType.LEVEL_BOSS.toString(), new Model3DFlyweight());
	}
	
	//enumeration > string
	static Model3DFlyweightInterface getModel(Model3DType type) {
		return models.get(type.toString());
	}
}
