package opengl;

import java.util.HashMap;

public class FXShaders
{
	private HashMap<String,FXShader> shaders;
	public FXShaders()
	{
		this.shaders=new HashMap<>();
	}
	
	public FXShader addShader(String name,String vertex,String fragment)
	{
		this.shaders.put(name,new FXShader(vertex,fragment));
		return this.shaders.get(name);
	}
	
	public FXShader addShader(String name,FXShader shader)
	{
		this.shaders.put(name,shader);
		return this.shaders.get(name);
	}	
	
	public FXShader getShader(String name)
	{
		return this.shaders.get(name);
	}
	
	public int getShaderID(String name)
	{
		return this.shaders.get(name).getShaderID();
	}
	
	public void bindShader(String name)
	{
		this.shaders.get(name).bind();
	}	
}
