import java.io.*;
public class Readline{
	public static void main(String[] args) {
		if (args.length < 1)
		{
			System.err.println("Usage: Readline filename");
			System.exit(0);
		}
		LineNumberReader lnrd = null;
		try
		{
			lnrd = new LineNumberReader(new FileReader(args[0]));
		}
		catch(FileNotFoundException e)
		{
			System.err.println(e.getMessage());
			System.exit(0);
		}
		try
		{
			while (lnrd.readLine() != null);
		}
		catch(IOException e)
		{
			System.err.println(e.getMessage());
			System.exit(0);
		}
		System.out.println("File " + args[0] + " contains " + lnrd.getLineNumber() + " lines.");
	}
}
