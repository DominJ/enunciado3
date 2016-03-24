
abstract public class Dato 
{
	protected int codi;
	protected String nom;
	
	//getters y setters comunes en todas las subclases
	public int getCodi()
	{
		return this.codi;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public void setCodi(int c)
	{
		this.codi = c;
	}
	
	public void setNom(String n)
	{
		this.nom = n;
	}
}
