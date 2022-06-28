package one.digitalinnovation.gof.singleton;
/**
 * Singleton "pregui�oso"
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
