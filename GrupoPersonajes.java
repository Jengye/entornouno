package bobEsponja;

import java.util.Arrays;

public class GrupoPersonajes {
	private final static int DEFAULT=20;
	
	private Personaje[] grupo;
	public GrupoPersonajes(int n) {
		grupo=new Personaje[n];
	}//personaje
	
	public GrupoPersonajes() {
		this(DEFAULT);
	}//GrupoPersonajes
	
	public boolean añadePersonaje (Personaje p) {
		for(int i=0; i<grupo.length;i++) {
			if(grupo[i]==null) {
				grupo[i]=p;
				return true;
			}
		}
		return false;
	}//añadePersonaje
	
	public String toString () {
		return Arrays.toString(grupo);
	}

}//class
