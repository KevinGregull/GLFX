package opengl;

import static org.lwjgl.opengl.ARBFragmentShader.*;
import static org.lwjgl.opengl.ARBShaderObjects.*;
import static org.lwjgl.opengl.ARBVertexShader.*;

import java.io.File;
import java.io.FileReader;
import java.io.InputStream;

public class FXShader
{
	private int shaderID;
	private int vertID;
	private int fragID;
	
	public FXShader(String vertfilename,String fragfilename)
	{
		File vertfile=new File(vertfilename);
		
		
		// Create Shader
		glCreateProgramObjectARB();
		
		// Create VertexShader
		this.vertID=glCreateShaderObjectARB(GL_VERTEX_SHADER_ARB);
		glShaderSourceARB(this.vertID,"");
		glCompileShaderARB(this.vertID);
		
		// Create FragmentShader
		this.fragID=glCreateShaderObjectARB(GL_FRAGMENT_SHADER_ARB);
		glShaderSourceARB(this.fragID,"");
		glCompileShaderARB(this.fragID);
		
		// Attack Shaders to main Shader
        glAttachObjectARB(this.shaderID,this.vertID);
        glAttachObjectARB(this.shaderID,this.fragID);
        glLinkProgramARB(this.shaderID);
        glValidateProgramARB(this.shaderID);
	}
}
