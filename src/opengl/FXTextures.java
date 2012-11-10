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
        this.textures.put(name,new FXTexture(file));
        return this.textures.get(name);
    }

    public FXTexture addTexture(String name,FXTexture texture)
    {
        this.textures.put(name,texture);
        return this.textures.get(name);
    }

    public FXTexture addTexture(String name,String file,FXProperties props)
    {
        this.textures.put(name,new FXTexture(file,props));
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

    public void bindTexture(String name)
    {
        this.textures.get(name).bind();
    }

    public void bindTexture(String name,int slot)
    {
        this.textures.get(name).bind(slot);
    }
}
