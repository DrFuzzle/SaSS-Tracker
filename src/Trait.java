import java.util.Random;

public class Trait {
	
	//Fields
	private String name;
	private Gene dominant;
	private Gene recessive;
	
	//Constructors
	public Trait(String name, Gene gOne, Gene gTwo) {//Evaluates the dominance of two genes and places them together correctly as a Trait
		this.setName(name);
		if (gOne.getDominance() > gTwo.getDominance()) {
			setDominant(gOne);
			setRecessive(gTwo);
		}
		
		else {
			setDominant(gTwo);
			setRecessive(gOne);
		}
	}
	
	public Trait(String name, Gene gOne) {//Creates a trait with two identical genes
		this.setName(name);
		setDominant(gOne);
		setRecessive(gOne);
	}
	
	public Trait(Trait t1, Trait t2) throws Exception{//generates trait from two existing traits of the same name
		
		if (!t1.getName().equals(t2.getName())) {
			throw new Exception("Trait Names must be the same");
		}
		this.setName(t1.getName());
		Random rand = new Random();
		int n = rand.nextInt(1000);
		
		if (n < 250) {//Dom T1 Dom T2
			if (t1.getDominant().getDominance() > t2.getDominant().getDominance()) {
				setDominant(t1.getDominant());
				setRecessive(t2.getDominant());
			}
			
			else {
				setDominant(t2.getDominant());
				setRecessive(t1.getDominant());
			}
		}
		else if (n < 500) {//Dom T1 Rec T2
			if (t1.getDominant().getDominance() > t2.getRecessive().getDominance()) {
				setDominant(t1.getDominant());
				setRecessive(t2.getRecessive());
			}
			
			else {
				setDominant(t2.getRecessive());
				setRecessive(t1.getDominant());
			}
		}
		else if (n < 750) {//Rec T1 Dom T2
			if (t1.getRecessive().getDominance() > t2.getDominant().getDominance()) {
				setDominant(t1.getRecessive());
				setRecessive(t2.getDominant());
			}
			
			else {
				setDominant(t2.getDominant());
				setRecessive(t1.getRecessive());
			}
		}
		else if (n < 1000) {//Rec T1 RecT2
			if (t1.getRecessive().getDominance() > t2.getRecessive().getDominance()) {
				setDominant(t1.getRecessive());
				setRecessive(t2.getRecessive());
			}
			
			else {
				setDominant(t2.getRecessive());
				setRecessive(t1.getRecessive());
			}
		}
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Gene getDominant() {
		return dominant;
	}

	public void setDominant(Gene dominant) {
		this.dominant = dominant;
	}

	public Gene getRecessive() {
		return recessive;
	}

	public void setRecessive(Gene recessive) {
		this.recessive = recessive;
	}
	
	//Methods
	public String getExpression() {//Returns the expression of the dominant gene
		return this.getDominant().getExpression();
	}
}
