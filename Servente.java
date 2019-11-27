import java.rmi.*;
//import java.rmi.server.UnicastRemoteObject;

public class Servente implements Servico{
	private static final long serialVersionUID = 1L;

	protected Servente() throws RemoteException{
		super();
	}

	public double calcularIMC(float peso, float altura) throws RemoteException{
		return peso / Math.pow(altura/100, 2);
	}

	public float calcularTBM(int idade, float peso, float altura, char sexo) throws RemoteException{
		if(sexo == 'm' || sexo == 'M'){
			double aux = 0;
			aux =  66 + (13.8 * peso) + (5.0 * altura) - (6.8 * idade);
			float tbm = (float) aux;
			return tbm;
		}
		else if(sexo == 'f' || sexo == 'F'){
			double aux = 0;
			aux = 655 + (9.6 * peso) + (1.8 * altura) - (4.7 * idade);
			float tbm = (float) aux;
			return tbm;
		}
		else
			return 0;
	}

	public float calcularCaloriasGanharPeso(int idade, float peso, float altura, char sexo) throws RemoteException{
		float tbm = 0;
		tbm = calcularTBM(idade, peso, altura, sexo);
		if(sexo == 'f' || sexo == 'F')
			return tbm + 500;
		else if(sexo == 'M' || sexo == 'm')
			return tbm + 500;
		else 
			return 0; 
	}

	public float calcularCaloriasPerderPeso(int idade, float peso, float altura, char sexo) throws RemoteException{
		float tbm;
		tbm = calcularTBM(idade, peso, altura, sexo);
		if(sexo == 'f' || sexo == 'F')
			return tbm - 500;
		else if(sexo == 'M' || sexo == 'm')
			return tbm - 500;
		else
			return 0;
	}

	public float calcularCaloriasManterPeso(int idade, float peso, float altura, char sexo) throws RemoteException{
		float tbm;
		tbm = calcularTBM(idade, peso, altura, sexo);
		if(sexo == 'f' || sexo == 'F')
			return tbm;
		else if(sexo == 'M' || sexo == 'm')
			return tbm;
		else
			return 0;
	}
}