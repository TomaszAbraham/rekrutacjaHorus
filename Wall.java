package sciana;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
	private List<CompositeBlock> blocks;
	
	//zwraca pierwszy napotkany element o danym kolorze "opakowany" w objekt Optional
	public Optional findBlockByColor(String color) {
		if (color == null){
			throw new IllegalArgumentException("Color is null!");
		}
		return blocks.stream()
				.filter(b->b.getColor().equals(color))
				.findAny();
	}

	// zwraca wszystkie elementy z danego materiału
	public List findBlocksByMaterial(String material) {
		if (material == null){
			throw new IllegalArgumentException("Material is null!");
		}
		return blocks.stream()
				.filter(b->b.getMaterial().equals(material))
				.collect(Collectors.toList());
	}

	//zwraca liczbę wszystkich elementów tworzących strukturę
	public int count() {
		return this.blocks.size();
	}	
}

	

	
