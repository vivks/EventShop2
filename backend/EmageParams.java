package backend;

public class EmageParams {
	
	private final int uid;
	
	//TODO pmarx: This should probably be some other type, or maybe even
	//two vars, start/end time
	private final int timeWindow;
	
	/*
	 * @Author pmarx
	 * Basic setup just so it compiles
	 */ 
	public EmageParams(
			int uid, 
			int timeWindow ) {
		
		//TODO this should be enforceably unique amongst all Emage UID's
		this.uid = uid;
		this.timeWindow = timeWindow;
	}
}