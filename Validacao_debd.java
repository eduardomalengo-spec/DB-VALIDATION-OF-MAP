import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Validacao_debd {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        Map<String, String> cpf = new HashMap<>();
        
        cpf.put("234.678.322-78", "Andre");
        cpf.put("123.456.789-90", "Roberto");
        cpf.put("456.123.789-67", "Eduardo");
        cpf.put("789.458.120-89", "Jose");
        cpf.put("870-236-458-36", "Nicolas");
        cpf.put("780.528.028-56", "Nicole");
        
        System.out.println(" PREENCHIMENTO DE DADOS ");
        
        System.out.print("DIGITE SEU NOME: ");
        String nome = sc.nextLine();
        
        System.out.print("DIGITE SEU CPF: ");
        String cpf_cli = sc.nextLine();
        
        
        if(cpf_cli.equals("789.458.120-89")) {
        	System.out.println(" OK DADOS EM ANDAMENTO DE PROCESSO DE VERIFICAÇÃO... ");
            for(Map.Entry<String, String> pf : cpf.entrySet()) {
        		System.out.println(" [ " + pf.getKey() + " = " + pf.getValue() + " ] ");
        	}
        }
        else {
        	System.out.println(" ERROR ");
        }
      
       
        
    }
}