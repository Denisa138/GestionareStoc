import java.util.Scanner;

public class Angajat extends Produs {
	private String nume_angajat;
	private int accesibilitate_angajat;
	private static Scanner input;
	
    public Angajat(String n, double p, int v, int d, String l, int a) {
		super(n, p, v, d);
		nume_angajat = l;
		accesibilitate_angajat = a;
		// TODO Auto-generated constructor stub
	}
    
    public void Adaugare_produs(int nr_adaugari, int accesibilitate)
	{
    	if(accesibilitate == 1)
    	{
    		AdaugareProdus(nr_adaugari);
    	}
    	else
    	{
    		System.out.println("Nu aveti autorizatia pentru a adauga un produs.");
    	}
	}
    
    public void Stergere_produs(int nr_stergeri, int accesibilitate)
   	{
    	if(accesibilitate == 1)
    	{
   		    StergereProdus(nr_stergeri);
    	}
    	else
    	{
    		System.out.println("Nu aveti autorizatia pentru a sterge un produs.");
    	}
   	}
    
    public void Modificare_nume_produs(int accesibilitate)
    {
    	if(accesibilitate == 1)
    	{
    		System.out.println("Introduceti denumirea dorita:");
    		input = new Scanner(System.in);
    		String denumire_noua = input.next();
        	Set_nume(denumire_noua);
    	}
        else
    	{
    		System.out.println("Nu aveti autorizatia pentru a modifica denumirea unui produs.");
    	}
    }
    
    public void Modificare_valabilitate_produs(int accesibilitate)
    {
    	if(accesibilitate == 1)
    	{
    		System.out.println("Introduceti valabilitatea dorita:");
    		input = new Scanner(System.in);
    		int valabilitate_noua = input.nextInt();
        	Set_valabilitate(valabilitate_noua);
    	}
        else
    	{
    		System.out.println("Nu aveti autorizatia pentru a modifica valabilitatea unui produs.");
    	}
    }
    
    public void Bon_fiscal(int produse_cumparate)
    {
    	System.out.println("\nBon fiscal pentru produsul " + Get_nume() + ": ");
    	System.out.println("Valabilitate zile: "+ Get_valabilitate());
    	System.out.println("Pret: " + produse_cumparate * Get_pret());
    }
    
    public void Vanzare(int nr_vanzari, int accesibilitate)
    {
    	if(accesibilitate == 0)
    	{
    	   StergereProdus(nr_vanzari);
    	   Bon_fiscal(nr_vanzari);
    	}
    	else
    	{
    		System.out.println("Nu aveti autorizatia pentru a vinde un produs.");
    	}
    }
    
    int Get_accesibilitate()
    {
    	return accesibilitate_angajat;
    }
    
    void Set_accesibilitate(int n)
    {
    	accesibilitate_angajat = n;
    }
    
    String Get_Nume()
    {
    	return nume_angajat;
    }
    
    void Set_Nume(String n)
    {
    	nume_angajat = n;
    }
}
    
   