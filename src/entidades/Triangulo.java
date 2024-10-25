package entidades;

//Criando a Classe para representar a entidade Triangulo
public class Triangulo { 
	
	// Declarando os atributos da Entidade (publicos)
	public double base; 
	public double altura;
	
	// Criando um construtor padrão para a classe (Construtor vazio)
	public Triangulo() { 
		
	}
	
	// Criando o construtor com parâmetros / atributos, para poder instanciar um objeto de fato.
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	// Criando o método que calcula área. Ele retorna um valor do tipo `double`.
	public double calcularArea() {
		return ((base * altura)/2);
	}

}
