package opengl;

public class Int4D
{
	// Attributes
	public int x;
	public int y;
	public int z;
	public int a;

	// Constructors
	public Int4D(int x,int y,int z,int a)
	{
		this.x=x;
		this.y=y;
		this.z=z;
		this.a=a;
	}
	public Int4D()
	{
		
	}
	
	// Getter
	public int getX()
	{
		return this.x;
	}
	public int getY()
	{
		return this.y;
	}
	public int getZ()
	{
		return this.z;
	}
	public int getA()
	{
		return this.a;
	}	
	public int getR()
	{
		return this.x;
	}
	public int getG()
	{
		return this.y;
	}
	public int getB()
	{
		return this.z;
	}	
	
	// Setter
	public void setX(int value)
	{
		this.x=value;
	}
	public void setY(int value)
	{
		this.y=value;
	}
	public void setZ(int value)
	{
		this.z=value;
	}
	public void setA(int value)
	{
		this.a=value;
	}
	public void setR(int value)
	{
		this.x=value;
	}
	public void setG(int value)
	{
		this.y=value;
	}
	public void setB(int value)
	{
		this.z=value;
	}
}
