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
    
    public static void main(String[] args) {
    	
    	Angajat a = new Angajat("masina", 5000, 4000, 3400, "Lia", 1);
    	Angajat b = new Angajat("ciocolata", 8.7, 35, 115, "Ion", 0);
    	Angajat c = new Angajat("pix", 2.8, 29, 11500, "Maria", 1);
    	Angajat d = new Angajat("telefon", 1999.9, 335, 33500, "Ioana", 0);
    	Angajat e = new Angajat("perna", 59.99, 78, 1105, "Alina", 1);
    
    do {
    	System.out.println("\nAlegeti o optiune:");
        System.out.println("1 - Adaugati un produs in stoc.");
        System.out.println("2 - Stergeti un produs din stoc.");
        System.out.println("3 - Vindeti un produs din stoc.");
        System.out.println("4 - Modificati denumirea unui produs din stoc.");
        System.out.println("5 - Modificati valabilitatea unui produs din stoc.");
        System.out.println("6 - Parasiti meniul.");
        
    try {
    	input = new Scanner(System.in);
    	int optiune = input.nextInt();
    
        switch (optiune) {
        case 1:  
        	System.out.println("Introduceti numele produsului:");
            String produs = input.next();
    		System.out.println("Introduceti de cate ori vreti sa adaugati produsul la stoc: ");
    		int adaugari = input.nextInt();
    		
    		if(produs.equals(a.Get_nume()))
    		{
    			int acces = a.Get_accesibilitate();
    	        a.Adaugare_produs(adaugari, acces);
    		}
    		else if(produs.equals(b.Get_nume()))
    		{
    			int acces = b.Get_accesibilitate();
    	        b.Adaugare_produs(adaugari, acces);
    		}
    		else if(produs.equals(c.Get_nume()))
    		{
    			int acces = c.Get_accesibilitate();
    	        c.Adaugare_produs(adaugari, acces);
    		}
    		else if(produs.equals(d.Get_nume()))
    		{
    			int acces = d.Get_accesibilitate();
    	        d.Adaugare_produs(adaugari, acces);
    		}
    		else if(produs.equals(e.Get_nume()))
    		{
    			int acces = e.Get_accesibilitate();
    	        e.Adaugare_produs(adaugari, acces);
    		}
                 break;    
        case 2:
        	input = new Scanner(System.in);
        	System.out.println("Introduceti numele produsului:");
            produs = input.next();
    		System.out.println("Introduceti de cate ori vreti sa stergeti produsul din stoc: ");
    		int stergeri = input.nextInt();
    		
    		if(produs.equals(a.Get_nume()))
    		{
    			int acces = a.Get_accesibilitate();
    	        a.Stergere_produs(stergeri, acces);
    		}
    		else if(produs.equals(b.Get_nume()))
    		{
    		    int acces = b.Get_accesibilitate();
    	        b.Stergere_produs(stergeri, acces);
    		}
    		else if(produs.equals(c.Get_nume()))
    		{
    		    int acces = c.Get_accesibilitate();
    	        c.Stergere_produs(stergeri, acces);
    		}
    		else if(produs.equals(d.Get_nume()))
    		{
    		    int acces = d.Get_accesibilitate();
    	        d.Stergere_produs(stergeri, acces);
    		}
    		else if(produs.equals(e.Get_nume()))
    		{
    		    int acces = e.Get_accesibilitate();
    	        e.Stergere_produs(stergeri, acces);
    		}
            break;
        case 3:
        	input = new Scanner(System.in);
        	System.out.println("Introduceti numele produsului:");
            produs = input.next();
    		System.out.println("Introduceti numarul de produse vandute: ");
    		int vanzari = input.nextInt();
    		
    		if(produs.equals(a.Get_nume()))
    		{
    			int acces = a.Get_accesibilitate();
    			a.Vanzare(vanzari, acces);
    		}
    		else if(produs.equals(b.Get_nume()))
    		{
    		    int acces = b.Get_accesibilitate();
    		    b.Vanzare(vanzari, acces);
    		}
    		else if(produs.equals(c.Get_nume()))
    		{
    		    int acces = c.Get_accesibilitate();
    		    c.Vanzare(vanzari, acces);
    		}
    		else if(produs.equals(d.Get_nume()))
    		{
    		    int acces = d.Get_accesibilitate();
    		    d.Vanzare(vanzari, acces);
    		}
    		else if(produs.equals(e.Get_nume()))
    		{
    		    int acces = e.Get_accesibilitate();
    		    e.Vanzare(vanzari, acces);
    		}
            break;
        case 4:
        	System.out.println("Introduceti numele produsului:");
            produs = input.next();
    
            if(produs.equals(a.Get_nume()))
    		{
    			int acces = a.Get_accesibilitate();
    			a.Modificare_nume_produs(acces);
    		}
    		else if(produs.equals(b.Get_nume()))
    		{
    		    int acces = b.Get_accesibilitate();
    		    b.Modificare_nume_produs(acces);
    		}
    		else if(produs.equals(c.Get_nume()))
    		{
    		    int acces = c.Get_accesibilitate();
    		    c.Modificare_nume_produs(acces);
    		}
    		else if(produs.equals(d.Get_nume()))
    		{
    		    int acces = d.Get_accesibilitate();
    		    d.Modificare_nume_produs(acces);
    		}
    		else if(produs.equals(e.Get_nume()))
    		{
    		    int acces = e.Get_accesibilitate();
    		    e.Modificare_nume_produs(acces);
    		}
            break;
        case 5:
        	System.out.println("Introduceti numele produsului:");
            produs = input.next();
            
            if(produs.equals(a.Get_nume()))
    		{
    			int acces = a.Get_accesibilitate();
    			a.Modificare_valabilitate_produs(acces);
    		}
    		else if(produs.equals(b.Get_nume()))
    		{
    		    int acces = b.Get_accesibilitate();
    		    b.Modificare_valabilitate_produs(acces);
    		}
    		else if(produs.equals(c.Get_nume()))
    		{
    		    int acces = c.Get_accesibilitate();
    		    c.Modificare_valabilitate_produs(acces);
    		}
    		else if(produs.equals(d.Get_nume()))
    		{
    		    int acces = d.Get_accesibilitate();
    		    d.Modificare_valabilitate_produs(acces);
    		}
    		else if(produs.equals(e.Get_nume()))
    		{
    		    int acces = e.Get_accesibilitate();
    		    e.Modificare_valabilitate_produs(acces);
    		}
            break;
         case 6:
            System.out.println("Ati iesit din meniu.");
            System.exit(0);
            break;
        default:
        	System.out.println("Nu ati ales o optiune valida.");
       }
      } catch (NumberFormatException f) {}

    }
    while(true); 
    }
}
    
   