package cursoJava;

public class Rectangulo extends Figura{
	
	private float base;
	private float altura;
	
	public Rectangulo(String pNombre) {
		super(pNombre);
		// TODO Auto-generated constructor stub
	}

	public Rectangulo() {
		super();
	}

	public Rectangulo(String pNombre, float base, float altura) {
		super(pNombre);
		this.base = base;
		this.altura = altura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float calcularSuperficie() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getValores() {
		// TODO Auto-generated method stub
		return null;
	}

}
