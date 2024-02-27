package taller3.televisores;
public class TV{
    private Marca marca;
    private int canal=1;
    private int precio=500;
    private boolean estado;
    private int volumen=1;
    protected Control control;
    private static int numTV;

    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        numTV++;   
    }
	
// GETTERS Y SETTERS
	public Marca getMarca() {
		return this.marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	
	public int getCanal() {
		return this.canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	
	public int getPrecio() {
		return this.precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	public int getVolumen() {
		return this.volumen;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	
	public Control getControl() {
		return this.control;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	
	
	public boolean getEstado() {
		return this.estado;
	}
	

	
//////////////////////////////////////////////////////////////////////////////////////////////////////
	
//Métodos TurnOn, turnOFF, canalUp, canalDown, volumenUp, volumenDown
	
	public boolean turnOn() {
		return this.estado = true;
	}
	public boolean turnOff() {
		return this.estado = false;
	}
	
	public void canalUp() {
		if (this.estado && this.canal < 120) {
			this.canal++;
		}
	}
	
	public void canalDown() {
		if (this.estado && this.canal > 1) {
			this.canal++;
		}
	}
	
	public void volumenUp() {
		if (this.estado == true && this.volumen < 7) {
			this.volumen++;
		}
	}
	
	public void volumenDown() {
		if(this.estado == true && this.volumen > 0) {
			this.volumen++;
		}
	}
	
	
	
	


}
