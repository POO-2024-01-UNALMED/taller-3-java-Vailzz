package taller3.televisores;

public class Control {
	private TV tv;
	
	public void turnOn() {
		tv.turnOn();
	}
	
	public void turnOff() {
		tv.turnOff();
	}
	
	public void canalUp() {
		tv.canalUp();
	}
	
	public void canalDown() {
		tv.canalDown();
	}
	
	public void volumenUp() {
		tv.volumenUp();
	}
	
	public void volumenDown() {
		tv.volumenDown();
	}
	
	public void setCanal() {
		tv.setCanal(0);
	}
	
	public void setVolumen() {
		tv.setVolumen(0);
	}
	
    public void enlazar(TV televisor){
        tv=televisor;
        tv.setControl(this);
    }
	
	public TV getTv() {
		return this.tv;
	}
	
	public void setTv(TV tv) {
		this.tv = tv;
	}
}
