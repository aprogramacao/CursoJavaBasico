package aprogramacao.java.class3.lab;

public class Baleia extends Mamifero {
	boolean nada;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Baleia \n[nada = " + nada + ", \nmama = " + mama + ", \nvive = " + vive + ", \nrespira = " + respira
				+ ", \nmovimenta = " + movimenta + ", \nalimenta = " + alimenta + "]";
	}
}