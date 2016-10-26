package formulario;

public class UsuarioForm {
	private String nombre;
	private String clave;
	
	public UsuarioForm(){
		this.nombre = "";
		this.clave = "";
	}
	public UsuarioForm(String nick, String pass){
		this.nombre = nick;
		this.clave = pass;
	}
	
	public void setNombre(String x){
		this.nombre = x;
	}
	public void setClave(String x){
		this.clave = x;
	}
	public String getNombre(){
		return nombre;
	}
	public String getClave(){
		return clave;
	}
}
