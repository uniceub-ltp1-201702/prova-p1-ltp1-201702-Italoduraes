
import java.time.LocalDateTime;

public class Ligacao {

	
	
	private int codigo;
	private String NumDeTelDestino;
	private LocalDateTime DataEHoraDeInicio;
	private LocalDateTime DataEHoraDeFim;
	private String cidadeDeDestino;
	private String UFDeDestino;
	private Cliente cliente;
	private double valor;
	
	// metodo to String 
	@Override
	public String toString() {
		return "Codigo da Ligação= " + codigo + "\n" +
				"Numero de Telefone= " + NumDeTelDestino + "\n" +
				"Data e Hora de Inicio= " + DataEHoraDeInicio + ", até " + DataEHoraDeFim + "\n" +
				"Cidade de destino= " + cidadeDeDestino + ", UF de destino= " + UFDeDestino + "\n";
	}
	
	
	
	
	public String gerarConta(){
		return "\n" +
	           "--------Ligações-------- \n" +
				"Data e Hora do inicio= " + DataEHoraDeInicio + "\n" +
	           "Numero do destino= " + NumDeTelDestino  + "\n" +
				"Cidade e UF do destino= " + cidadeDeDestino + ", "+ UFDeDestino + "\n" +
	           "Valor= " + (valor * 0.05) + "\n";
	}
	
	
	
	
	
	// Metodo construto
	
	public Ligacao(int codigo, String numDeTelDestino, LocalDateTime localDateTime, LocalDateTime localDateTime2,
			String cidadeDeDestino, String uFDeDestino, Cliente cliente, double valor) {
		this.codigo = codigo;
		NumDeTelDestino = numDeTelDestino;
		DataEHoraDeInicio = localDateTime;
		DataEHoraDeFim = localDateTime2;
		this.cidadeDeDestino = cidadeDeDestino;
		UFDeDestino = uFDeDestino;
		this.cliente = cliente;
		this.valor = valor;
	}
	
	// Metodo get e set
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNumDeTelDestino() {
		return NumDeTelDestino;
	}
	public void setNumDeTelDestino(String numDeTelDestino) {
		NumDeTelDestino = numDeTelDestino;
	}
	public LocalDateTime getDataEHoraDeInicio() {
		return DataEHoraDeInicio;
	}
	public void setDataEHoraDeInicio(LocalDateTime dataEHoraDeInicio) {
		DataEHoraDeInicio = dataEHoraDeInicio;
	}
	public LocalDateTime getDataEHoraDeFim() {
		return DataEHoraDeFim;
	}
	public void setDataEHoraDeFim(LocalDateTime dataEHoraDeFim) {
		DataEHoraDeFim = dataEHoraDeFim;
	}
	public String getCidadeDeDestino() {
		return cidadeDeDestino;
	}
	public void setCidadeDeDestino(String cidadeDeDestino) {
		this.cidadeDeDestino = cidadeDeDestino;
	}
	public String getUFDeDestino() {
		return UFDeDestino;
	}
	public void setUFDeDestino(String uFDeDestino) {
		UFDeDestino = uFDeDestino;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	

	
	

	
	
	
	
	
}
