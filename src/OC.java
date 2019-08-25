import java.time.LocalDateTime;
import java.util.ArrayList;

public class OC {
	//Fields
	private String name;
	private LocalDateTime birthDate;
	private String notes;
	
	private OC sire;
	private OC dam;
	
	private ArrayList<Feature> features;
	
	//Constructor
	public OC (String name) {//Create a blank OC with only a name
		this.setName(name);
		this.setBirthDate(null);
		this.setNotes("");
		
		this.setSire(null);
		this.setDam(null);
		
		this.setFeatures(new ArrayList<Feature>()); 
	}
	
	public OC (OC father, OC mother) throws Exception {
		this.setName("newborn");
		this.setBirthDate(LocalDateTime.now());
		this.setNotes("");
		
		this.setSire(father);
		this.setDam(mother);
		
		this.setFeatures(new ArrayList<Feature>());
		
		for (int i = 0; i < mother.getFeatures().size(); i++) {
			Feature currentFeat = mother.getFeatures().get(i);
			String currentName = currentFeat.getName();
				
			Feature breedFeat = null;
			for (int j = 0; j < father.getFeatures().size(); j++) {
				Feature secFeat = father.getFeatures().get(j);
				if (secFeat.getName().equals(currentName)){
					breedFeat = secFeat;
					break;
				}
			}
				
			if (breedFeat == null) {
				throw new Exception("No Feature to Breed With");
			}
				
			this.addFeature(new Feature(currentFeat, breedFeat));
			
		}
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDateTime localDateTime) {
		this.birthDate = localDateTime;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public OC getSire() {
		return sire;
	}

	public void setSire(OC sire) {
		this.sire = sire;
	}

	public OC getDam() {
		return dam;
	}

	public void setDam(OC dam) {
		this.dam = dam;
	}

	public ArrayList<Feature> getFeatures() {
		return features;
	}

	public void setFeatures(ArrayList<Feature> features) {
		this.features = features;
	}
	
	//methods
	public void addFeature(Feature newFeature) {
		features.add(newFeature);
	}
	
	public void removeFeature(Feature unwantedFeature) {
		try {
			features.remove(unwantedFeature);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void describe() {
		System.out.println(this.getName()+": ");
		System.out.println("");
		for (int i = 0; i < features.size(); i++) {
			System.out.println(features.get(i).getName()+": ");
			
			ArrayList<Trait> traitlist = features.get(i).getTraits();
			for (int j = 0; j < traitlist.size(); j++) {
				Trait current = traitlist.get(j);
				System.out.println(current.getName() + ": " + current.getExpression());
			}
			System.out.println("");
			
		}
	}
}

	
