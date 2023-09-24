package desing.pattern.creational.factory.chair;

import java.util.HashMap;
import java.util.Map;

public class ChairFactory {
	private Map<String, BaseChair> makersMap = new HashMap<>();
	public ChairFactory() {
		makersMap.put("CLASICA", new ClassicChair(90,10,"Classic Brand", "Classic Color"));
		makersMap.put("MODERNA", new ModernChair(100,150,"Modern Brand", "Modern Color"));
		makersMap.put("VINTAGE", new VintageChair(50,50,"Vintage Brand", "Vintage Color"));
		makersMap.put("ROCKERA", new RockChair(50,50,"Rock Brand", "Black/gray Color"));
	}

	public BaseChair getChair(String shapeType) {
		return makersMap.get(shapeType);
	}
}








