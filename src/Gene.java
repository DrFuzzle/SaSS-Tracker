public class Gene{
	//Fields
	private String expression;
	private int dominance;
		
	//Constructor
	public Gene(String exp, int dom) {
		expression = exp;
		dominance = dom;//Used to evaluate Gene expressions
	}
	
	//Getters and Setters
	public String getExpression() {
		return expression;
	}
	
	public void setExpression(String exp) {
		expression = exp;
	}
	
	public int getDominance() {
		return dominance;
	}
	
	public void setDominance(int dom) {
		dominance = dom;
	}
}