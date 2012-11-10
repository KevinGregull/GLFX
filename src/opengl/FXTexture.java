package opengl;

import java.io.IOException;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

public class FXTexture
{

    private Texture texture;
    private FXProperties props;

    public void loadFromFile(String filename)
    {
        // Detect FILE Format
        String getExtension=filename.toLowerCase();
        String extension="NONE";
        if (getExtension.contains(".jpg")||getExtension.contains(".jpeg"))
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
            this.texture=TextureLoader.getTexture(extension,ResourceLoader.getResourceAsStream(filename));
        }
        catch (IOException e)
        {
            System.out.println("File '"+filename+"' could not be found!");
        }
    }

    public FXTexture(String filename,FXProperties props)
    {
        this.props=props;
        loadFromFile(filename);
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
        return this.texture.getImageWidth();
    }

    public int getHeight()
    {
        return this.texture.getImageHeight();
    }

    public int getTextureWidth()
    {
        return this.texture.getTextureWidth();
    }

    public int getTextureHeight()
    {
        return this.texture.getTextureHeight();
    }

    public void remove()
    {
        this.texture.release();
    }

    public byte[] getData()
    {
        return this.texture.getTextureData();
    }

    public int getTextureID()
    {
        return this.texture.getTextureID();
    }

    public FXProperties getProperties()
    {
        return this.props;
    }

    public void setProperties(FXProperties props)
    {
        this.props=props;
    }

    public void bind()
    {
        GL13.glActiveTexture(GL13.GL_TEXTURE0);
        GL11.glBindTexture(GL11.GL_TEXTURE_2D,this.getTextureID());
    }

    public void bind(int slot)
    {
        switch (slot)
        {
            case 3:
                GL13.glActiveTexture(GL13.GL_TEXTURE3);
                break;
            case 2:
                GL13.glActiveTexture(GL13.GL_TEXTURE2);
                break;
            case 1:
                GL13.glActiveTexture(GL13.GL_TEXTURE1);
                break;
            case 0:
            default:
                GL13.glActiveTexture(GL13.GL_TEXTURE0);
                break;
        }
        GL11.glBindTexture(GL11.GL_TEXTURE_2D,this.getTextureID());
    }
}
