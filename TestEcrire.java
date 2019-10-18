import java.io.*;
import java.util.*;

public class TestEcrire
{
	public static void  main (String[] args)
	{
		String prenomEtudiant = "Laurent";
		String nomEtudiant = "Martin";
		String note = "A";

		try
		{
			PrintWriter sortie = new PrintWriter(new FileOutputStream("Etudiant.dat"));
			sortie.println(prenomEtudiant);
			sortie.println(nomEtudiant);
			sortie.println(note);
			sortie.close();
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	} 
}