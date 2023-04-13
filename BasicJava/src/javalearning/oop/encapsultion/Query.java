package javalearning.oop.encapsultion;

class Car{
	private int modelId;//0 
	private String modelName;//null
	
	public int getModelId() {
		return modelId;
	}
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
//	Car(int modelId,String modelName){
//		this.modelId = modelId;
//		this.modelName = modelName;
//	}
	
	
}


public class Query {

	public static void main(String[] args) {
		Car car = new Car();

	}

}
