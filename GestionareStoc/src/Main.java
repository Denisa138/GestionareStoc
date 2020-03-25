import java.util.Scanner;

public class Main {
	private static Scanner input;
	
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
    System.out.println("6 - Modificati accesibilitatea unui angajat.");
    System.out.println("7 - Parasiti meniul.");
    
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
    	System.out.println("Introduceti numele angajatului:");
        String angajat = input.next();
        
        if(angajat.equals(a.Get_Nume()))
		{
			int acces = a.Get_accesibilitate();
			
			if(acces == 0)
			{
				a.Set_accesibilitate(1);
			}
			else if (acces == 1)
			{
				a.Set_accesibilitate(0);
			}	
		}
        if(angajat.equals(b.Get_Nume()))
		{
			int acces = b.Get_accesibilitate();
			
			if(acces == 0)
			{
				b.Set_accesibilitate(1);
			}
			else if (acces == 1)
			{
				b.Set_accesibilitate(0);
			}	
		}
        if(angajat.equals(c.Get_Nume()))
		{
			int acces = c.Get_accesibilitate();
			
			if(acces == 0)
			{
				c.Set_accesibilitate(1);
			}
			else if (acces == 1)
			{
				c.Set_accesibilitate(0);
			}	
		}
        if(angajat.equals(d.Get_Nume()))
		{
			int acces = d.Get_accesibilitate();
			
			if(acces == 0)
			{
				d.Set_accesibilitate(1);
			}
			else if (acces == 1)
			{
				d.Set_accesibilitate(0);
			}	
		}
        if(angajat.equals(e.Get_Nume()))
		{
			int acces = e.Get_accesibilitate();
			
			if(acces == 0)
			{
				e.Set_accesibilitate(1);
			}
			else if (acces == 1)
			{
				e.Set_accesibilitate(0);
			}	
		}
        break;
     case 7:
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
