import java.rmi.*;

public interface Servico extends Remote{

	public double calcularIMC(float peso, float altura) throws RemoteException;

	public float calcularTBM(int idade, float peso, float altura, char sexo) throws RemoteException;

	public float calcularCaloriasGanharPeso(int idade, float peso, float altura, char sexo) throws RemoteException;

	public float calcularCaloriasPerderPeso(int idade, float peso, float altura, char sexo) throws RemoteException;

	public float calcularCaloriasManterPeso(int idade, float peso, float altura, char sexo) throws RemoteException;
}