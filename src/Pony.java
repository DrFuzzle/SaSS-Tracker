import java.util.ArrayList;
import java.util.Collections;

public class Pony extends OC {
	
	enum tribe {
		EARTH,//Nothing
		PEGASUS,//Wings
		UNICORN,//Uni Horn
		KIRIN,//Kirin Features
		ALICORN,//Wings and Uni Horn
		CUSTOM//If you wanna go Chimera
	}
	
		
	private class Build extends Feature{
		
		protected int height;
		protected int weight;
		protected int musculature;
		
		public Build() {
			super("Build", "The Pony's Physical Build");
		}
		
	}
	
	private class Colours extends Feature{
		
		protected Trait coatBase;
		protected Trait coatSecondary;
		private ArrayList<Gene> coatGenes;
		
		protected Trait hairBase;
		protected Trait hairSecondary;
		protected Trait hairHighlight;
		private ArrayList<Gene> hairGenes;
		
		public Colours(Trait coatBase, Trait coatSecondary, Trait hairBase, Trait hairSecondary, Trait hairHighlight) {
			super("Colours", "The Pony's Colours");
			
			this.coatBase = coatBase;
			this.coatSecondary = coatSecondary;
			coatGenes = new ArrayList<Gene>();
			coatGenes.add(coatBase.getDominant());
			coatGenes.add(coatBase.getRecessive());
			coatGenes.add(coatSecondary.getDominant());
			coatGenes.add(coatSecondary.getRecessive());
			
			this.hairBase = hairBase;
			this.hairSecondary = hairSecondary;
			this.hairHighlight = hairHighlight;
			hairGenes = new ArrayList<Gene>();
			hairGenes.add(hairBase.getDominant());
			hairGenes.add(hairBase.getRecessive());
			hairGenes.add(hairSecondary.getDominant());
			hairGenes.add(hairSecondary.getRecessive());
			hairGenes.add(hairHighlight.getDominant());
			hairGenes.add(hairHighlight.getRecessive());
			
			
		}
		
		public Colours(Colours c1, Colours c2) {
			super("Colours", "The Pony's Colours");
			
			ArrayList<Gene> temp = new ArrayList<Gene>();
			ArrayList<Gene> coatGenes = new ArrayList<Gene>();
			temp.addAll(c1.getCoatGenes());
			temp.addAll(c2.getCoatGenes());
			Collections.shuffle(temp);
			for (int i = 0; i < temp.size(); i+=2) {
				coatGenes.add(temp.get(i));
			}
			
			temp = new ArrayList<Gene>();
			ArrayList<Gene> hairGenes = new ArrayList<Gene>();
			temp.addAll(c1.getHairGenes());
			temp.addAll(c2.getHairGenes());
			Collections.shuffle(temp);
			for (int i = 0; i < temp.size(); i+=2) {
				hairGenes.add(temp.get(i));
			}
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
	
	private class Coat extends Feature{
		
		protected Trait type;
		protected Trait pattern;

	}
	
	private class Mane extends Feature{
		
		protected Trait hairType;
		protected Trait hairpattern;
		protected Trait highlight;
	}
	
	private class Tail extends Feature{
		
		protected Trait type;
		protected Trait hairType;
		protected Trait hairPattern;
		protected Trait highlight;
		
	}
	
	
	
	
	
	public Pony(String name) {
		super(name);
	}
	
	public Pony(Pony mother, Pony father) throws Exception {
		super(mother, father);
	}
}
