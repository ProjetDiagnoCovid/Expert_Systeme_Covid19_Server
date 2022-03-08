package ma.fstm.ilisi2.ExpertSysCovid19.model.bo;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DrlTest {

	public void Testing(Diagnostic d)
	{
		try {
			
			KieServices ks = KieServices.Factory.get();
		    KieContainer kContainer = ks.getKieClasspathContainer();
	    	KieSession kSession = kContainer.newKieSession("ksession-rules");
	    	
	    	kSession.insert(d);
	        kSession.fireAllRules();
	        
	        
		} catch (Throwable t) {
	        System.out.println("exception !!");
			t.printStackTrace();
	    }
	}
	
	public static void main(String[] args) {
		 Client cl = new Client();
         
         
         Diagnostic diag = new Diagnostic(cl);
         
         Etatpandemie etat = new Etatpandemie("faible");
         Region r = new Region("casablanca-settat",etat);
         Ville v = new Ville("casa",r);
          cl.setVille(v);
          
          Symptome s1 = new Symptome();
          s1.setDescription("fievre");
          
          Mesure m = new Temperature(40);
          s1.setMesure(m);
          
          
          Symptome s2 = new Symptome();
          s2.setDescription("congestion nasal");
          
          Symptome s3 = new Symptome();
          s3.setDescription("toux sèche");
          
          Symptome s4 = new Symptome();
          s4.setDescription("fatigue");
          
          Symptome s5 = new Symptome();
          s5.setDescription("perte de goût");
          
          
          
          diag.ajouter_symptome(s1);
          diag.ajouter_symptome(s2);
          diag.ajouter_symptome(s3);
          diag.ajouter_symptome(s4);
          diag.ajouter_symptome(s5); 
          
          diag.setContact_Covid19(true);
          
          cl.ajouter_diagnostic(diag);
          
          new  DrlTest().Testing(diag);
          
          System.out.println(diag.getDegreCont_C19());
		
	}
	
	

}
