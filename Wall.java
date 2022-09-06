package sciana;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
	private List<CompositeBlock> blocks;
	
	//zwraca pierwszy napotkany element o danym kolorze
	public Optional findBlockByColor(String color) {
		Optional<CompositeBlock> result = Optional.empty();
		for(CompositeBlock element: this.blocks) {
			
			if( element.getColor().equals(color)) {
				result = Optional.ofNullable(element);
				return result;
			}
		}
		return result;
	}

	// zwraca wszystkie elementy z danego materiału
	public List findBlocksByMaterial(String material) {
		List<CompositeBlock> lista = new LinkedList<>();
		
		for(CompositeBlock element: this.blocks) {
			if( element.getMaterial().equals(material)) lista.add(element);
		}
		return lista;
	}

	//zwraca liczbę wszystkich elementów tworzących strukturę
	public int count() {
		return this.blocks.size();
	}
	
	
}

	

	