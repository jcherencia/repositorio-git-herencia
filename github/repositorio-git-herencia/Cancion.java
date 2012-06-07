/** @author Juan Carlos Herencia */
public class Cancion {
	String titulo, artista, grupo;
	int anno;

	Cancion(String titulo, String artista, String grupo, int anno) {
		this.titulo = titulo;
		this.artista = artista;
		this.grupo = grupo;
		this.anno = anno;
	}

	@Override
	public String toString() {
		return titulo + "\t" + artista + "\t" + grupo + "\t" + anno;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}
}
