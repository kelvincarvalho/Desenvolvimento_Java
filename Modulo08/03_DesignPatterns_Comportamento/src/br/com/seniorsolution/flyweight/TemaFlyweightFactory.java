package br.com.seniorsolution.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TemaFlyweightFactory {
	
	private static Map<Class<? extends TemaFlyweight>, TemaFlyweight> temas = new HashMap<>();
	
	public static final Class<TemaAsterisco> ASTERISCO = TemaAsterisco.class;
	public static final Class<TemaHifen> HIFEN = TemaHifen.class;
	public static final Class<TemaSenior> SENIOR = TemaSenior.class;
	
	public static TemaFlyweight getTema(Class<? extends TemaFlyweight> c1) {
		if(!temas.containsKey(c1)) {
			
			try {
				temas.put(c1, c1.newInstance());
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return temas.get(c1);
	}
}