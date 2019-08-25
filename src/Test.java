
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OC Panda = new OC("Panda");
		OC Hearth = new OC("Hearth");
		
		//Pony Coat
		Trait HEARTH_coatColour = new Trait("Coat Colour", new Gene("White", -10));
		Trait HEARTH_coatPattern = new Trait("Coat Pattern", new Gene("Plain", 0));
		Trait HEARTH_coatType = new Trait("Coat Type", new Gene("Fluffy", 10), new Gene("Trim", 0));
		Feature HEARTH_coat = new Feature("Coat", "A Coat of Fur");
		HEARTH_coat.addTrait(HEARTH_coatType);
		HEARTH_coat.addTrait(HEARTH_coatPattern);
		HEARTH_coat.addTrait(HEARTH_coatColour);
				
		//Pony Mane
		Trait HEARTH_maneType = new Trait("Mane Type", new Gene("Kirin", 7));
		Trait HEARTH_maneColourOne = new Trait("Mane Colour One", new Gene("Crimson", -2));
		Trait HEARTH_maneColourTwo = new Trait("Mane Colour Two", new Gene("Crimson", -2));
		Trait HEARTH_maneColourHighlight = new Trait("Mane Highlight", new Gene("None", -5));
		Feature HEARTH_mane = new Feature("Mane", "A Mane of Hair");
		HEARTH_mane.addTrait(HEARTH_maneColourHighlight);
		HEARTH_mane.addTrait(HEARTH_maneColourTwo);
		HEARTH_mane.addTrait(HEARTH_maneColourOne);
		HEARTH_mane.addTrait(HEARTH_maneType);
				
		//Pony Tail
		Trait HEARTH_tailType = new Trait("Tail Type", new Gene("Kirin", 7));
		Trait HEARTH_tailColourOne = new Trait("Tail Colour One", new Gene("Crimson", -2));
		Trait HEARTH_tailColourTwo = new Trait("Tail Colour Two", new Gene("Crimson", -2));
		Trait HEARTH_tailColourHighlight = new Trait("Tail Highlight", new Gene("None", -5));
		Feature HEARTH_tail = new Feature("Tail", "A Tail....");
		HEARTH_tail.addTrait(HEARTH_tailType);
		HEARTH_tail.addTrait(HEARTH_tailColourOne);
		HEARTH_tail.addTrait(HEARTH_tailColourTwo);
		HEARTH_tail.addTrait(HEARTH_tailColourHighlight);
				
		//Pony Eyes
		Trait HEARTH_eyeType = new Trait("Eye Type", new Gene("Pony", 5), new Gene("Draconic", 0));
		Trait HEARTH_eyeColour = new Trait("Eye Colour", new Gene("Gold", 6), new Gene("Purple", 3));
		Feature HEARTH_eye = new Feature("Eyes", "Peepers to See");
		HEARTH_eye.addTrait(HEARTH_eyeType);
		HEARTH_eye.addTrait(HEARTH_eyeColour);
		
		//Hoof Type
		Trait HEARTH_hoofType  = new Trait("Hoof Type", new Gene("Cloven", 5));
		Feature HEARTH_hoof = new Feature("Hoof", "Lil Stompers");
		HEARTH_hoof.addTrait(HEARTH_hoofType);
				
		//Ears
		Trait HEARTH_earType = new Trait("Ear Type", new Gene("Floofy", 8), new Gene("Pointed", 0));
		Feature HEARTH_ear = new Feature("Ears", "Auditory Peepers");
		HEARTH_ear.addTrait(HEARTH_earType);
				
		//Mouth
		Trait HEARTH_mouthType = new Trait("Mouth Type", new Gene("Fanged Omnivore", 7), new Gene("Omnivore", 5));
		Feature HEARTH_mouth = new Feature("Mouth", "Nommer");
		HEARTH_mouth.addTrait(HEARTH_mouthType);
		
		//Pony Coat
		Trait PANDA_coatColour = new Trait("Coat Colour", new Gene("Black and White", 8), new Gene("Brown", -5));
		Trait PANDA_coatPattern = new Trait("Coat Pattern", new Gene("Panda", 7), new Gene("None", -5));
		Trait PANDA_coatType = new Trait("Coat Type", new Gene("Fluffy", 7), new Gene("Coarse", -5));
		Feature PANDA_coat = new Feature("Coat", "A Coat of Fur");
		PANDA_coat.addTrait(PANDA_coatType);
		PANDA_coat.addTrait(PANDA_coatPattern);
		PANDA_coat.addTrait(PANDA_coatColour);
				
		//Pony Mane
		Trait PANDA_maneType = new Trait("Mane Type", new Gene("Straight", 5), new Gene("Curvy", -5));
		Trait PANDA_maneColourOne = new Trait("Mane Colour One", new Gene("Orange", -2), new Gene("Brown", 5));
		Trait PANDA_maneColourTwo = new Trait("Mane Colour Two", new Gene("Orange", -2), new Gene("Brown", 5));
		Trait PANDA_maneColourHighlight = new Trait("Mane Highlight", new Gene("None", 5), new Gene("Tips", -2));
		Feature PANDA_mane = new Feature("Mane", "A Mane of Hair");
		PANDA_mane.addTrait(PANDA_maneColourHighlight);
		PANDA_mane.addTrait(PANDA_maneColourTwo);
		PANDA_mane.addTrait(PANDA_maneColourOne);
		PANDA_mane.addTrait(PANDA_maneType);
				
		//Pony Tail
		Trait PANDA_tailType = new Trait("Tail Type", new Gene("Pony Straight", 5), new Gene("Pony Curly", -2));
		Trait PANDA_tailColourOne = new Trait("Tail Colour One", new Gene("Orange", -2), new Gene("Brown", 5));
		Trait PANDA_tailColourTwo = new Trait("Tail Colour Two", new Gene("Orange", -2), new Gene("Brown", 5));
		Trait PANDA_tailColourHighlight = new Trait("Tail Highlight", new Gene("None", 5), new Gene("Tips", -2));
		Feature PANDA_tail = new Feature("Tail", "A Tail....");
		PANDA_tail.addTrait(PANDA_tailType);
		PANDA_tail.addTrait(PANDA_tailColourOne);
		PANDA_tail.addTrait(PANDA_tailColourTwo);
		PANDA_tail.addTrait(PANDA_tailColourHighlight);
				
		//Pony Eyes
		Trait PANDA_eyeType = new Trait("Eye Type", new Gene("Pony", 5));
		Trait PANDA_eyeColour = new Trait("Eye Colour", new Gene("Brown", 5), new Gene("Red", -5));
		Feature PANDA_eye = new Feature("Eyes", "Peepers to See");
		PANDA_eye.addTrait(PANDA_eyeType);
		PANDA_eye.addTrait(PANDA_eyeColour);
		
		//Hoof Type
		Trait PANDA_hoofType  = new Trait("Hoof Type", new Gene("Pony", 5), new Gene("Soft Pads", -6));
		Feature PANDA_hoof = new Feature("Hoof", "Lil Stompers");
		PANDA_hoof.addTrait(PANDA_hoofType);
				
		//Ears
		Trait PANDA_earType = new Trait("Ear Type", new Gene("Regular Pony", 5), new Gene("Rounded", -2));
		Feature PANDA_ear = new Feature("Ears", "Auditory Peepers");
		PANDA_ear.addTrait(PANDA_earType);
				
		//Mouth
		Trait PANDA_mouthType = new Trait("Mouth Type", new Gene("Herbivore", 2), new Gene("Omnivore", 5));
		Feature PANDA_mouth = new Feature("Mouth", "Nommer");
		PANDA_mouth.addTrait(PANDA_mouthType);
		
		//ADD to OCs
		Hearth.addFeature(HEARTH_mouth);
		Hearth.addFeature(HEARTH_ear);
		Hearth.addFeature(HEARTH_hoof);
		Hearth.addFeature(HEARTH_eye);
		Hearth.addFeature(HEARTH_tail);
		Hearth.addFeature(HEARTH_mane);
		Hearth.addFeature(HEARTH_coat);
		
		Panda.addFeature(PANDA_mouth);
		Panda.addFeature(PANDA_ear);
		Panda.addFeature(PANDA_hoof);
		Panda.addFeature(PANDA_eye);
		Panda.addFeature(PANDA_tail);
		Panda.addFeature(PANDA_mane);
		Panda.addFeature(PANDA_coat);

		Panda.describe();
		System.out.println("");
		Hearth.describe();
		
		OC Babbu1 = null;
		OC Babbu2 = null;
		OC Babbu3 = null;
		OC Babbu4 = null;
		
		try {
			Babbu1 = new OC(Panda,Hearth);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Babbu2 = new OC(Panda,Hearth);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Babbu3 = new OC(Panda,Hearth);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Babbu4 = new OC(Panda,Hearth);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Babbu1.describe();
		Babbu2.describe();
		Babbu3.describe();
		Babbu4.describe();
		
	}
}
