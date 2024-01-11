package item;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StageLoot {
	
	private static final Random RANDOM = new Random();
	
	private static final List<StageItem> FORESTBIGGINING_ITEM;
	static{
		FORESTBIGGINING_ITEM = new ArrayList<>();
		FORESTBIGGINING_ITEM.add(new StageItem("Herb", 0.5));
		FORESTBIGGINING_ITEM.add(new StageItem("Glass", 0.2));
		FORESTBIGGINING_ITEM.add(new StageItem(null, 0.3));
	}

	public static StageItem pickUpItemInForestStage() {
		double roll = RANDOM.nextDouble();
		double accumulatedProbability = 0.0;
		
		for(StageItem item : FORESTBIGGINING_ITEM) {
			accumulatedProbability += item.getProbability();
			if(roll < accumulatedProbability) {
				return item;
			}
		}
		return null;
	}
}

