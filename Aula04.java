import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class Aula04 {

	public static void main(String[] args) {
      Date relogio = new Date();
      System.out.println("A data do sistem �: ");
      System.err.println(relogio.toString());  
     
      Locale lingua = Locale.getDefault();
      System.out.println("O seu sistema est� em " + lingua.getDisplayLanguage());
      // OU
      System.err.println("O seu sistema est� em " + lingua.getLanguage()); 
      
      Toolkit tk = Toolkit.getDefaultToolkit();
      Dimension d = tk.getScreenSize();
      System.out.println("A resolu��o do seu sistema �:" + d.width + " X " + d.height);
      // OU
      System.out.println(tk.getScreenSize());
      
      
      
	}

}
