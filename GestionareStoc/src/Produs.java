public class Produs {
    private String nume_produs;
    private double pret;
	private int valabilitate_zile;
	private Stoc stoc_produs;
	
     public Produs(String n, double p, int v, int d)
	{
		this.nume_produs = n;
		this.pret = p;
		this.valabilitate_zile = v;
	    this.stoc_produs = new Stoc(d);
	}
           
    public void AdaugareProdus(int nr_adaugari)
   	{
   		stoc_produs.Adaugare(nr_adaugari);
   		System.out.println("Stocul produsului este:"); 
   		stoc_produs.Get_produs();
   	}
    
    public void StergereProdus(int nr_stergeri)
    {
    	stoc_produs.Stergere(nr_stergeri);
    	System.out.println("Stocul produsului este:"); 
   		stoc_produs.Get_produs();
    }
    
    String Get_nume()
    {
    	return nume_produs;
    }
    
    void Set_nume(String n)
    {
    	nume_produs = n;
    }
    
    double Get_pret()
    {
    	return pret;
    }
    
    void Set_pret(float n)
    {
    	pret = n;
    }
    
    int Get_valabilitate()
    {
    	return valabilitate_zile;
    }
    
    void Set_valabilitate(int n)
    {
    	valabilitate_zile = n;
    }
}

