package HB_helbert;

import javax.security.auth.login.Configuration;

public class Hb {
 
public static void main(String[] args) {
 
 Configuration c= Configurador.getConfigurador   ("mis datos", "miinformacion");  
 
 System.out.println("Singleton");
 
 System.out.println("Codigo Simple");
 
}
 
}