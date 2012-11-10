package opengl;

import static org.lwjgl.opengl.GL11.*;

import engine.Engine;

public class FXOpenGL
{

    private FXTextures textureManager;
    private FXModels modelManager;
    private FXScenes sceneManager;
    private FXShaders shaderManager;
    private FXFogs fogManager;
    private FXCamera camera;

    public FXOpenGL()
    {
        this.init();
        this.camera=new FXCamera();
        this.textureManager=new FXTextures();
        this.shaderManager=new FXShaders();
        this.modelManager=new FXModels();
        this.sceneManager=new FXScenes();
        this.fogManager=new FXFogs();
    }

    public void init()
    {
        glEnable(GL_TEXTURE_2D);
        glClearColor(0.0f,0.0f,0.0f,0.0f);
        glEnable(GL_BLEND);
        glBlendFunc(GL_SRC_ALPHA,GL_ONE_MINUS_SRC_ALPHA);
        glViewport(0,0,Engine.getWidth(),Engine.getWidth());
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0,Engine.getWidth(),Engine.getWidth(),0,1,-1);
        glMatrixMode(GL_MODELVIEW);
    }

    public FXTextures getTextureManager()
    {
        return this.textureManager;
    }

    public FXModels getModelManager()
    {
        return this.modelManager;
    }

    public FXScenes getSceneManager()
    {
        return this.sceneManager;
    }

    public FXShaders getShaderManager()
    {
        return this.shaderManager;
    }

    public FXFogs getFogManager()
    {
        return this.fogManager;
    }

    public FXCamera getCamera()
    {
        return this.camera;
    }
}
