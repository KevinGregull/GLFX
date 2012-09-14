package opengl;

import java.util.HashMap;

public class FXTextures
{
	private HashMap<String,FXTexture> textures;
	public FXTextures()
	{
		this.textures=new HashMap<>();
	}
	
	public FXTexture addTexture(String name,String file)
	{
		this.textures.put(name,new FXTexture(name,file));
		return this.textures.get(name);
	}
	
	public FXTexture addTexture(String name,String file,FXProperties props)
	{
		this.textures.put(name,new FXTexture(name,file,props));
		return this.textures.get(name);
	}	
	
	public FXTexture getTexture(String name)
	{
		return this.textures.get(name);
	}
	
	public int getTextureID(String name)
	{
		return this.textures.get(name).getTextureID();
	}
	
	public void useTexture(String name)
	{
		this.textures.get(name).use();
	}
	
	public void useTexture(String name,int slot)
	{
		this.textures.get(name).use(slot);
	}	
}
