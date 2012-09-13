package opengl;

import java.util.HashMap;

public class FXTextures
{
	private HashMap<String,FXTexture> textures;
	public FXTextures()
	{
		textures=new HashMap<>();
	}
	
	public void addTexture(String name,String file)
	{
		textures.put(name,new FXTexture(name,file));
	}
	
	public void addTexture(String name,String file,FXProperties props)
	{
		textures.put(name,new FXTexture(name,file,props));
	}
	
	public FXTexture getTexture(String name)
	{
		return textures.get(name);
	}
	
	public int getTextureID(String name)
	{
		return textures.get(name).getTextureID();
	}
	
	public void useTexture(String name)
	{
		textures.get(name).use();
	}
}
