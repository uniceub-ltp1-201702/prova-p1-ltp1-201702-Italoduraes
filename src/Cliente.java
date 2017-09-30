import java.time.LocalDate;

public class Cliente {

	
	private String nome;
	private String CPF;
    private LocalDate dataNascimento;
	private String NunDeTelefone;
	private String cidade;
	private String UF;
	
	
	//Metodo construtor
	
	public Cliente(String nome, String cPF, LocalDate dataNascimento, String nunDeTelefone, String cidade, String uF) {
		this.nome = nome;
		CPF = cPF;
		this.dataNascimento = dataNascimento;
		NunDeTelefone = nunDeTelefone;
		this.cidade = cidade;
		UF = uF;
	}
	
	// metodo to String 
	
	public String toString() {
		return "Nome do cliente= " + nome + "\n" +
				"CPF= " + CPF + "\n" +
				"Data de Nascimento= " + dataNascimento + "\n" +
				"Numero de telefone= " + NunDeTelefone + "\n" +
				"Cidade= " + cidade +  "\n" +
				"UF= " + UF ;
	}


	
	
	
	
	
	
	// Metodo get e set 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNunDeTelefone() {
		return NunDeTelefone;
	}
	public void setNunDeTelefone(String nunDeTelefone) {
		NunDeTelefone = nunDeTelefone;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	
	
	
	
	
	// Data de nascimento
		public String getDataComoString(){
			return dataNascimento.getDayOfMonth() + "/" +
				   dataNascimento.getMonthValue() + "/" +
					dataNascimento.getYear();
		}








	
	
	
	
	
	
	
	
	
	
}
