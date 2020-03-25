public class Stoc {
    private int nr_produse;
    
    public Stoc(int produse)
    {
    	this.nr_produse = produse;
    }
    
    public void Get_produs()
	{
    	System.out.print(nr_produse);
	}
    
    public void Adaugare(int nr_adaugari)
    {
    	nr_produse = nr_produse + nr_adaugari;
    }
    
    public void Stergere(int nr_stergeri)
    {
    	nr_produse = nr_produse - nr_stergeri;
    }    
}

