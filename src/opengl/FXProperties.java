package opengl;

import java.util.HashMap;

public class FXProperties
{
	private HashMap<String,FXProperty> properties;
	public FXProperties()
	{
		this.properties=new HashMap<>();
		this.properties.put("test",new FXPropInt(23));
	}
}
