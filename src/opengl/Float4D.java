package opengl;

public class Float4D
{
	// Attributes
	public float x;
	public float y;
	public float z;
	public float a;

	// Constructors
	public Float4D(float x,float y,float z,float a)
	{
		this.x=x;
		this.y=y;
		this.z=z;
		this.a=a;
	}
	public Float4D()
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
	public float getZ()
	{
		return this.z;
	}
	public float getA()
	{
		return this.a;
	}	
	public float getR()
	{
		return this.x;
	}
	public float getG()
	{
		return this.y;
	}
	public float getB()
	{
		return this.z;
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
	public void setZ(float value)
	{
		this.z=value;
	}
	public void setA(float value)
	{
		this.a=value;
	}
	public void setR(float value)
	{
		this.x=value;
	}
	public void setG(float value)
	{
		this.y=value;
	}
	public void setB(float value)
	{
		this.z=value;
	}
}
