package entidades;

//Criando a Classe para representar a entidade Triangulo
public class Triangulo { 
	
	// Declarando os atributos da Entidade (publicos)
	private double base; 
	private double altura;
	
	// Criando um construtor padrão para a classe (Construtor vazio)
	public Triangulo() { 
		
	}
	
	// Criando o construtor com parâmetros / atributos, para poder instanciar um objeto de fato.
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	// Criando os Getters e Setters
	// Get = Método para acessar o valor de atributos privados
	// Set = Método para modificar o valor de atributos privados
	
	// Get e Set para o atributo "base"
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	// Get e Set para o atributo "altura"
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	// Criando o método que calcula área. Ele retorna um valor do tipo `double`.
	
	public double calcularArea() {
		return ((base * altura)/2);
	}
	

}
