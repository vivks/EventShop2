package backend;


public class PersonalDataWrapper extends AbstractDataWrapper {
	
	/**
	 * 
	 * @param emageParams:
	 * vks: There seems to be a naming issue here. Why do we need emageParams for PersonalDataWrapper? We still want timewindow though. 
	 * 
	 * @param wrapperParams
	 * @param authFields
	 */
	public PersonalDataWrapper(
			EmageParams emageParams,
			WrapperParams wrapperParams, 
			AuthFields authFields ) {
		super(emageParams, wrapperParams, authFields);
		// TODO Auto-generated constructor stub
		// TODO add uid
	}

	@Override
	PointStream getWrappedData() {
		// TODO Auto-generated method stub
		return null;
	}

}
