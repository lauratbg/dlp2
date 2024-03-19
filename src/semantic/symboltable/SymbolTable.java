package semantic.symboltable;

import ast.program.Definition;

import java.util.*;

public class SymbolTable {

	private int scope=0;
	private List<Map<String, Definition>> table;
	public SymbolTable()  {
		table = new ArrayList<>();
		table.add(new HashMap<>());
	}

	public void set() {
		scope++;
		table.add(new HashMap<>());
	}

	public void reset() {
		table.remove(scope);
		scope--;
	}

	public boolean insert(Definition definition) {
		// If there is no other def with the same name IN THE SCOPE
		if(findInCurrentScope(definition.getName()) == null){
			// Adding a definition <String, Definition> == <DefinitionName, Definition>
			table.get(scope).put(definition.getName(), definition);
			definition.setScope(scope);
			return true;
		}
		// Already exists
		return false;
	}

	// This one looks in all the table to return the definition if it is in the table
	public Definition find(String id) {
		for(int i = scope; i >= 0; i--)
			if(table.get(i).get(id) != null)
				return table.get(i).get(id);
		return null;

	}

	// This one find in the CURRENT scope
	public Definition findInCurrentScope(String id) {
		return table.get(scope).get(id);
	}
}
