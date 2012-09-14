package opengl;

import java.util.HashMap;

public class FXTextures
{
	private HashMap<String,FXTexture> textures;
	public FXTextures()
	{
		textures=new HashMap<>();
	}
	
	public FXTexture addTexture(String name,String file)
	{
		textures.put(name,new FXTexture(name,file));
		return textures.get(name);
	}
	
	public FXTexture addTexture(String name,String file,FXProperties props)
	{
		textures.put(name,new FXTexture(name,file,props));
		return textures.get(name);
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
	
	public void useTexture(String name,int slot)
	{
		textures.get(name).use(slot);
	}	
}
