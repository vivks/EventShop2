package backend;

/*
 * TODO: This probably needs getters and setters, still deciding what functionality this
 * class should actually have
 */

public class STTPoint {
	private int uid;
	//TODO: should this be a geolocation or a coordinate in an integer system?
	//vks: very good point. I suggest we stick to image coordinate space, once the data has been ingested. 
	// The initial wrappers, and front end interface will do the translation if needed. 
	//private GeoCoordinate geoCoordinate;
	
	//TODO: How to we make theme stronger enforced than a string? needs to be fixed
	private String theme;
	//TODO: At this point just assuming that the value is numerical, could be false though
	//vks: We will stick to double for this phase.
	private double value;
	
	/**
	 * @param uid
	 * @param theme
	 * @param value
	 */
	public STTPoint(int uid, String theme, double value) {
		this.uid = uid;
		this.theme = theme;
		this.value = value;
	}
}
