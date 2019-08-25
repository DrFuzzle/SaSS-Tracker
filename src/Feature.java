import java.util.ArrayList;

public class Feature {
	//Fields
	private String name;
	private String description;
	
	private ArrayList<Trait> traits;
	
	//Constructor
	public Feature(String name) {
		this.setName(name);
		setDescription("");
		setTraits(new ArrayList<Trait>());
	}
	
	public Feature(String name, String description) {
		this.setName(name);
		this.setDescription(description);
		setTraits(new ArrayList<Trait>());
	}
	
	public Feature(Feature f1, Feature f2) throws Exception {//Generates a feature form two existing features of the same name. They must have the same list of traits
		if (!f1.getName().equals(f2.getName())) {
			throw new Exception("Feature Names must be the same");
		}
		this.setName(f1.getName());
		this.setDescription(f1.getDescription());
		
		for (int i = 0; i < f1.getTraits().size(); i++) {
			Trait currentTrait = f1.getTraits().get(i);
			String currentName = currentTrait.getName();
			
			Trait breedTrait = null;
			for (int j = 0; j < f2.getTraits().size(); j++) {
				Trait secTrait = f2.getTraits().get(j);
				if (secTrait.getName().equals(currentName)){
					breedTrait = secTrait;
					break;
				}
			}
			
			if (breedTrait == null) {
				throw new Exception("No Trait to Breed With");
			}
			
			setTraits(new ArrayList<Trait>());
			this.addTrait(new Trait(currentTrait, breedTrait));
		}
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<Trait> getTraits() {
		return traits;
	}

	public void setTraits(ArrayList<Trait> traits) {
		this.traits = traits;
	}
	
	//Methods
	
	public void addTrait(Trait newTrait) {
		traits.add(newTrait);
	}
	
	public void removeTrait(Trait unwantedTrait) {
		try {
			traits.remove(unwantedTrait);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
