package br.com.seniorsolution.singleton;

public class AppGenericDao {

	public static void main(String[] args) {
		
		//O METODO getInstance() RETORNA UMA NOVA INSTANCIA SE FOR EXECUTADO PELA 1� VEZ
		//OU UMA INSTANCIA EXISTENTE, SE ESTA J� EXISTIR.
		
		//O Pattern Singleton permite a economia de instancia na memoria HEAP
		GenericDao dao = RepositorioSingleton.getInstance();
		dao.incluir();
		dao.listar();
	}

}
