package com.matrixbi.utils;

import java.io.Serializable;

//WPD import org.kie.api.runtime.StatelessKieSession;
import org.kie.api.runtime.KieSession;

public class RuleEngine implements Serializable {

	private static final long serialVersionUID = 5067156438156998327L;
	//WPD private StatelessKieSession kiaSession;
	private KieSession kieSession;

	public static RuleEngine createSession(String filepath) {
		return new RuleEngine(filepath);
	}

	private RuleEngine(String filepath) {
		kieSession = KieSessionFactory.getNewKieSession(filepath);
	}

	public void execute(Object object) {
		kieSession.insert( object );
		kieSession.fireAllRules( );
		//kieSession.dispose();
		
	}

	public void execute(Iterable objects) {
		kieSession.insert( objects );
		kieSession.fireAllRules();
		//kieSession.dispose();

	}

}
