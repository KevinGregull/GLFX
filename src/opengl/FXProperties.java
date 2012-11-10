package opengl;

import java.util.HashMap;

public class FXProperties
{

    private HashMap<Integer,Object> properties;

    public FXProperties()
    {
        this.properties=new HashMap<>();
    }

    public void addProperty(int property,Object value)
    {
        this.properties.put(property,value);
    }

    public Object getProperty(int property)
    {
        return this.properties.get(property);
    }
}