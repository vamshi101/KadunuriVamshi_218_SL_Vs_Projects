package abc;
import java.io.File;
public class DisplayFile
{
	public static void main(String[] args)
	{
		String path="D:\\Simpli_file\\";
		File f=new File(path);
		File filename[]=f.listFiles();
		for(File ff:filename) {
			System.out.println(ff.getName());
		}
	}
}