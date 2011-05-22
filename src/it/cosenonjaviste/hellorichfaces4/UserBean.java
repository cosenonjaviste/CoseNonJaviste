package it.cosenonjaviste.hellorichfaces4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.validation.constraints.Size;

@ManagedBean
public class UserBean implements Serializable {

	@Size(min = 3, max = 12, message = "Must be between 3 and 12 chars")
	private String name;
	private String state;

	public String getName() {
		return name;
	}

	public String getState() {
		return state;
	}

	private List<String> getRegioni() {
		List<String> regioni = new ArrayList<String>();
		regioni.add("Toscana");
		regioni.add("Liguria");
		regioni.add("Lombardia");
		regioni.add("Lazio");
		regioni.add("Sicilia");
		return regioni;
	}

	public List<String> autocomplete(String prefix) {

		List<String> result = new ArrayList<String>();
		List<String> regioni = getRegioni();

		for (String regione : regioni) {
			if (regione.toLowerCase().startsWith(prefix.toLowerCase()))
				result.add(regione);
		}
		return result;
	}
}
