package opengl;

public class Float2D
{
	// Attributes
	public float x;
	public float y;

	// Constructors
	public Float2D(float x,float y)
	{
		this.x=x;
		this.y=y;
	}
	public Float2D()
	{
		
	}
	
	// Getter
	public float getX()
	{
		return this.x;
	}
	public float getY()
	{
		return this.y;
	}
	public float getR()
	{
		return this.x;
	}
	public float getG()
	{
		return this.y;
	}
	
	// Setter
	public void setX(float value)
	{
		this.x=value;
	}
	public void setY(float value)
	{
		this.y=value;
	}
	public void setR(float value)
	{
		this.x=value;
	}
	public void setG(float value)
	{
		this.y=value;
	}	
}
