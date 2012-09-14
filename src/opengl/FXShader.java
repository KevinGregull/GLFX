package opengl;

import static org.lwjgl.opengl.ARBFragmentShader.*;
import static org.lwjgl.opengl.ARBShaderObjects.*;
import static org.lwjgl.opengl.ARBVertexShader.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FXShader
{
	private int shaderID;
	private int vertID;
	private int fragID;
	
	public FXShader(String vertfilename,String fragfilename)
	{
		// Read Vertex Shader from File
		String vertShader=FXFile.read(vertfilename);
		String fragShader=FXFile.read(fragfilename);
		
		// Create Shader
		glCreateProgramObjectARB();
		
		// Create VertexShader
		this.vertID=glCreateShaderObjectARB(GL_VERTEX_SHADER_ARB);
		glShaderSourceARB(this.vertID,vertShader);
		glCompileShaderARB(this.vertID);
		
		// Create FragmentShader
		this.fragID=glCreateShaderObjectARB(GL_FRAGMENT_SHADER_ARB);
		glShaderSourceARB(this.fragID,fragShader);
		glCompileShaderARB(this.fragID);
		
		// Attack Shaders to main Shader
        glAttachObjectARB(this.shaderID,this.vertID);
        glAttachObjectARB(this.shaderID,this.fragID);
        glLinkProgramARB(this.shaderID);
        glValidateProgramARB(this.shaderID);
	}
}
