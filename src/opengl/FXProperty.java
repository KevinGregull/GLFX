package opengl;

class FXProperty
{
	protected Object value;
	public FXProperty(Object value)
	{
		this.value=value;
	}
	public Object getValue()
	{
		return this.value;
	}
	public void setValue(Object value)
	{
		this.value=value;
	}
}
