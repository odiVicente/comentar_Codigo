
/**
 * Clase para manejar las entradas de un blog.
 * @author Vicente
 * @version 12/02/2021
 */
public class EntradaBlogVAS {
	
	/**
	 * separador es el ccarácter que separa ENTRADA DE del
	 * nombre del autor
	 */
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	/**
	 * @param id recibe el número de entrada
	 * @param autor el nombre del autor de la entrada
	 * @param texto el texto que contiene la entrada
	 * @throws IllegalArgumentException se captura con try-catch para no detener ejecución.
	 */

	public EntradaBlogVAS(int id,String autor,String texto)throws IllegalArgumentException{
		try {
			if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
			this.id=id;
			this.autor=autor;
			this.texto=texto;
		}
		catch(Exception e) {
			System.out.println("El id no puede ser negativo");
		}
	}
	
	

	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/**
	 * @return Devuelve el número de la entrada
	 */

	public int getId(){
		return this.id;
	}
	
	
	/**
	 * @return devuelve el texto completo de la entrada
	 */
	
	public String getTexto(){
		return this.texto;
	}
	
	
	/**
	 * @return devuelve el nombre del autor de la entrada en mayúsculas
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	
	/**
	 * @return devuelve el nombre del autor
	 * @deprecated Ya no se usa. 
	 */
	public String devuelveAutor(){
		return this.autor;
	}
	
	/**
	 * @param args No tiene porqué tener argumentos.
	 */
	
	public static void main(String[] args) {
                
		EntradaBlogVAS e1=new EntradaBlogVAS (-3,"ana","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}

