package br.com.seniorsolution.singleton;

public  class RepositorioSingleton {
	private static GenericDao dao;
	
	public static GenericDao getInstance() {
		if(dao == null) {
			dao = new GenericDao() {};
		}
		return dao;
	}
}
