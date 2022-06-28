package one.digitalinnovation.gof.singleton;
/**
 * Singleton "preguiçoso"
 * @author joaolmb
 *
 */
public class SingletonEager {
	private static SingletonEager instancia = new SingletonEager();
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
