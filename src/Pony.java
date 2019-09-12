import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Pony extends OC {
	
	enum Tribe {
		EARTH,//Nothing
		PEGASUS,//Wings
		UNICORN,//Uni Horn
		KIRIN,//Kirin Features
		ALICORN,//Wings and Uni Horn
		CUSTOM//If you wanna go Chimera
	}
	
	//Constituent Features
	
	protected class Build extends Feature{
		
		protected int height;
		protected int weight;
		protected int musculature;
		
		public Build(int height, int weight, int musculature) {
			super("Build", "The Pony's Physical Build");
			
			this.height = height;
			this.weight = weight;
			this.musculature = musculature;
		}
		
		public Build(Build b1, Build b2) {
			super("Build", "The Pony's Physical Build");
			
			Random rand = new Random();
			if (b1.height < b2.height) {
				this.height = b1.height + rand.nextInt(b2.height-b1.height);
			}
			else {
				this.height = b2.height + rand.nextInt(b1.height-b2.height);
			}
			
			if (b1.weight < b2.weight) {
				this.weight = b1.weight + rand.nextInt(b2.weight-b1.weight);
			}
			else {
				this.weight = b2.weight + rand.nextInt(b1.weight-b2.weight);
			}
			
			if (b1.musculature < b2.musculature) {
				this.musculature = b1.musculature + rand.nextInt(b2.musculature-b1.musculature);
			}
			else {
				this.musculature = b2.musculature + rand.nextInt(b1.musculature-b2.musculature);
			}
		}
		
	}
	
	protected class Colours extends Feature{

		private ArrayList<Gene> coatGenes;
		
		private ArrayList<Gene> hairGenes;
		
		
		
		public Colours(Trait coatBase, Trait coatSecondary, Trait coatTertiary, Trait hairBase, Trait hairSecondary, Trait hairHighlight) {
			super("Colours", "The Pony's Colours");
			
			this.addTrait(coatBase);
			this.addTrait(coatSecondary);
			this.addTrait(coatTertiary);
			
			coatGenes = new ArrayList<Gene>();
			coatGenes.add(coatBase.getDominant());
			coatGenes.add(coatBase.getRecessive());
			coatGenes.add(coatSecondary.getDominant());
			coatGenes.add(coatSecondary.getRecessive());
			coatGenes.add(coatTertiary.getDominant());
			coatGenes.add(coatTertiary.getRecessive());
		
			this.addTrait(hairBase);
			this.addTrait(hairSecondary);
			this.addTrait(hairHighlight);
			
			hairGenes = new ArrayList<Gene>();
			hairGenes.add(hairBase.getDominant());
			hairGenes.add(hairBase.getRecessive());
			hairGenes.add(hairSecondary.getDominant());
			hairGenes.add(hairSecondary.getRecessive());
			hairGenes.add(hairHighlight.getDominant());
			hairGenes.add(hairHighlight.getRecessive());
			
			
		}
		
		public Colours(Colours c1, Colours c2) throws Exception {//adds all the genes for colours together and pulls out half at random for the new pony
			super("Colours", "The Pony's Colours");
			
			ArrayList<Gene> temp = new ArrayList<Gene>();
			ArrayList<Gene> coatGenes = new ArrayList<Gene>();
			temp.addAll(c1.getCoatGenes());
			temp.addAll(c2.getCoatGenes());
			Collections.shuffle(temp);
			for (int i = 0; i < temp.size(); i+=2) {
				coatGenes.add(temp.get(i));
			}
			this.setCoatGenes(coatGenes);
			this.addTrait(new Trait("Coat Base Colour", coatGenes.get(0), coatGenes.get(1)));
			this.addTrait(new Trait("Coat Secondary Colour", coatGenes.get(2), coatGenes.get(3)));
			this.addTrait(new Trait("Coat Tertiary Colour", coatGenes.get(4), coatGenes.get(5)));
			
			temp = new ArrayList<Gene>();
			ArrayList<Gene> hairGenes = new ArrayList<Gene>();
			temp.addAll(c1.getHairGenes());
			temp.addAll(c2.getHairGenes());
			Collections.shuffle(temp);
			for (int i = 0; i < temp.size(); i+=2) {
				hairGenes.add(temp.get(i));
			}
			this.setHairGenes(hairGenes);
			this.addTrait(new Trait("Hair Base Colour", hairGenes.get(0), hairGenes.get(1)));
			this.addTrait(new Trait("Hair Secondary Colour", hairGenes.get(2), hairGenes.get(3)));
			this.addTrait(new Trait("Hair Highlight Colour", hairGenes.get(4), hairGenes.get(5)));
			
		}

		public ArrayList<Gene> getCoatGenes() {
			return coatGenes;
		}

		private void setCoatGenes(ArrayList<Gene> coatGenes) {
			this.coatGenes = coatGenes;
		}
		
		public ArrayList<Gene> getHairGenes() {
			return hairGenes;
		}

		private void setHairGenes(ArrayList<Gene> hairGenes) {
			this.hairGenes = hairGenes;
		}

	}
	
	protected class Coat extends Feature{
		
		public Coat(Trait type, Trait pattern) {
			super("Coat","The Pony's Coat");
			this.addTrait(type);
			this.addTrait(pattern);
		}
		
		public Coat(Coat c1, Coat c2) throws Exception {
			super(c1, c2);
		}
	}
	
	protected class Mane extends Feature{
		
		public Mane(Trait hairType, Trait hairPattern, Trait highlight) {
			super("Mane","The Pony's Mane");
			this.addTrait(hairType);
			this.addTrait(hairPattern);
			this.addTrait(highlight);
		}
		
		public Mane(Mane m1, Mane m2) throws Exception {
			super(m1, m2);
		}
	}
	
	protected class Tail extends Feature{
		
		public Tail(Trait type, Trait hairType, Trait hairPattern, Trait highlight) {
			super("Tail", "The Pony's Tail");
			this.addTrait(type);
			this.addTrait(hairType);
			this.addTrait(hairPattern);
			this.addTrait(highlight);
		}
		
		public Tail(Tail t1, Tail t2) throws Exception {
			super(t1, t2);
		}
	}
	
	
	protected class Eyes extends Feature{
		
		protected boolean heterochromia;
		
		public Eyes(Trait type, Trait colour, boolean heterochromia) {
			super("Eyes", "The Pony's Eyes");
			this.addTrait(type);
			this.addTrait(colour);
			this.heterochromia = heterochromia;
		}
		
		public Eyes(Eyes e1, Eyes e2) throws Exception {
			super(e1, e2);
		}
		
	}
	
	protected class Hoof extends Feature{
		
		protected Trait type;
		
		public Hoof(Trait type){
			super("Hoof", "The Pony's Hoof");
			this.addTrait(type);
		}
		
		public Hoof (Hoof h1, Hoof h2) throws Exception {
			super(h1, h2);
		}
	}
	
	protected class Legs extends Feature{//Uses Teritary Colour
		
		public Legs(Trait pattern, Trait fetlocksType) {
			super("Legs", "The Pony's Legs");
			this.addTrait(pattern);
			this.addTrait(fetlocksType);
		}
		
		public Legs(Legs l1, Legs l2) throws Exception {
			super(l1, l2);
		}
	}
	
	protected class Ears extends Feature{//Uses Teritary Colour
		
		public Ears(Trait type, Trait pattern) {
			super("Ears","The Pony's Ears");
			this.addTrait(type);
			this.addTrait(pattern);
		}
		
		public Ears(Ears e1, Ears e2) throws Exception {
			super(e1, e2);
		}
	}

	protected class Mouth extends Feature{//Uses Teritary Colour
		
		public Mouth (Trait type, Trait pattern) {
			super("Mouth", "The Pony's Mouth and Muzzle");
			this.addTrait(type);
			this.addTrait(pattern);
		}
		
		public Mouth (Mouth m1, Mouth m2) throws Exception {
			super(m1, m2);
		}
	}

	
	protected class Scales extends Feature{
		
		public Scales(Trait pattern, Trait colour) {
			super("Scales", "The Pony's Kirin Scales");
			this.addTrait(pattern);
			this.addTrait(colour);
		}
		
		public Scales(Scales s1, Scales s2) throws Exception {
			super(s1, s2);
		}
	}
	
	protected class Wings extends Feature{//Uses Teritary Colour
		
		public Wings(Trait type, Trait pattern) {
			super("Wings", "The Pony's Wings");
			this.addTrait(type);
			this.addTrait(pattern);
		}
		
		public Wings(Wings w1, Wings w2) throws Exception {
			super(w1, w2);
		}
	}

	protected class Horn extends Feature{//Uses Teritary Colour
		
		public Horn(Trait type, Trait pattern) {
			super("Horn", "The Pony's Horn");
			this.addTrait(type);
			this.addTrait(pattern);
		}
		
		public Horn(Horn h1, Horn h2) throws Exception {
			super(h1, h2);
		}
	}

	//Fields
	protected Tribe tribe;
	
	//Constructors
	public Pony(String name, int[] buildList, ArrayList<Trait> colourList, ArrayList<Trait> coatList, ArrayList<Trait> maneList, 
			ArrayList<Trait> tailList, ArrayList<Trait> eyesList, ArrayList<Trait> hoofList, ArrayList<Trait> legsList, ArrayList<Trait> earsList,
			ArrayList<Trait> mouthList, ArrayList<Trait> scalesList, ArrayList<Trait> wingsList, ArrayList<Trait> hornList) {
		super(name);
		Build build = new Build			(buildList[0], buildList[1], buildList[2]);
		Colours colours = new Colours	(colourList.get(0),colourList.get(1),colourList.get(2),colourList.get(3),colourList.get(4),colourList.get(5));
		Coat coat = new Coat			(coatList.get(0), coatList.get(1));
		Mane mane = new Mane			(maneList.get(0), maneList.get(1), maneList.get(2));
		Tail tail = new Tail			(tailList.get(0), tailList.get(1), tailList.get(2), tailList.get(3));
		Eyes eyes = new Eyes			(eyesList.get(0), eyesList.get(1), false);//False until I figure out how to parse booleans
		Hoof hoof = new Hoof			(hoofList.get(0));
		Legs legs = new Legs			(legsList.get(0), legsList.get(1));
		Ears ears = new Ears			(earsList.get(0), earsList.get(1));
		Mouth mouth = new Mouth			(mouthList.get(0), mouthList.get(1));
		Scales scales = new Scales		(scalesList.get(0), scalesList.get(1));
		Wings wings = new Wings			(wingsList.get(0), wingsList.get(1));
		Horn horn = new Horn			(hornList.get(0), hornList.get(1));
		
		this.addFeature(build);
		this.addFeature(colours);
		this.addFeature(coat);
		this.addFeature(mane);
		this.addFeature(tail);
		this.addFeature(eyes);
		this.addFeature(hoof);
		this.addFeature(legs);
		this.addFeature(ears);
		this.addFeature(mouth);
		this.addFeature(scales);
		this.addFeature(wings);
		this.addFeature(horn);
		
		tribe = Tribe.CUSTOM;//todo add tribe selection
	}
	
	public Pony(Pony mother, Pony father) throws Exception {
		super(mother, father);
		
		//todo Must add tribe allocation
	}
	
	//Methods
}

