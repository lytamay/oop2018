package week5_6;

import java.util.ArrayList;
import java.util.*;

public class Layer {
	private List<Shape> listShape;
	
	public void deleteCircle() {
		List<Shape> toRemove  = new ArrayList<>();
		for(Shape  s : listShape) {
			if(s instanceof Circle) {
				toRemove.add(s);
			}
		}
		listShape.removeAll(toRemove);
	}
	
}
