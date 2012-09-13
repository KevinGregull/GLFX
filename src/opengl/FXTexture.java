package opengl;

import java.io.IOException;

import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

public class FXTexture
{
	private Texture texture;
	
	public void loadFromFile(String filename)
	{
		// Detect FILE Format
		String getExtension=filename.toLowerCase();
		String extension="NONE";
		if (getExtension.contains(".jpg") || getExtension.contains(".jpeg"))
		{
			extension="JPG";
		}
		else if (getExtension.contains(".png"))
		{
			extension="PNG";
		}
		else
		{
			System.out.println("Invalid File Format for File '"+filename+"'");
		}
		
		// Load the actual Texture
		try
		{
			texture=TextureLoader.getTexture(extension,ResourceLoader.getResourceAsStream(filename));
		}
		catch(IOException e)
		{
			System.out.println("File '"+filename+"' could not be found!");
		}
	}
	
	public FXTexture(String filename)
	{
		loadFromFile(filename);
	}
	
	public FXTexture()
	{
	}
	
	public int getWidth()
	{
		return texture.getImageWidth();
	}
	
	public int getHeight()
	{
		return texture.getImageHeight();
	}
	
	public int getTextureWidth()
	{
		return texture.getTextureWidth();
	}
	
	public int getTextureHeight()
	{
		return texture.getTextureHeight();
	}
	
	public void remove()
	{
		texture.release();
	}
	
	public byte[] getData()
	{
		return texture.getTextureData();
	}
	
	public int getTextureID()
	{
		return texture.getTextureID();
	}
	
}
