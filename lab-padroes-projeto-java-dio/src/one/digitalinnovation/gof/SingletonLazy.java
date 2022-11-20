package one.digitalinnovation.gof;

/**
 * Singleton "preguiçoso"
 * 
 *@author Luiz Henrique
 */
public final class SingletonLazy {

	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia () {
		if (instancia==null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
