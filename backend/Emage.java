package backend;

public class Emage {

	//TODO: is there a better datastructure for this? 
	// vks: it could simply be double valueGrid[][]
	//The x y coordindates are implicit based on the meta-data
	
	STTPoint[][] valueGrid;
	/*
	 * TODO: I think we need more params here but I'm not sure how to store them...
	 * Maybe we should just pass the instance of WrapperParams and EmageParams to the Emage itself?
	 * will that be a probably (problem?)when building an emage from the DB though?
	 *vks: Yes, I pointer to WrapperParams might be good. Get/Put Emage in DB can also be updated to have such a 
	 * pointer
	 */
	
	/**
	 * @param valueGrid
	 */
	public Emage(STTPoint[][] valueGrid) {
		this.valueGrid = valueGrid;
	}
	
	public EmageParams getEmageParams(){
		return null;
	}
	
	public STTPoint getPoint(int xcoord, int ycoord) {
		return null;
	}
	
	//TODO: Should value be a double?
	//vks: yes, let's do double.
	public void setPoint(int xcoord, int ycoord, int value) {

	}
	
	public STTPoint[][] getValueGrid() {
		return null;
	}
}
