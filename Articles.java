package packagebac3;
import java.util.Scanner;
import java.util.Hashtable;
import java.util.Map;

public class Articles {

	public static void main(String[] args) {
		Hashtable <String, String> stock = new Hashtable <String, String>();
		Scanner lect = new Scanner(System.in);
		stock.put("001", "PAPIER");
		stock.put("002", "STYLO");
		stock.put("003", "YES");
		stock.put("004", "COWBEL");
		stock.put("005", "RAMA");
		stock.put("006", "CAKE");
		stock.put("007", "EAU");
		stock.put("008", "MOUCHOIRE");
		stock.put("009", "COCA ZERO");
		stock.put("010", "SARDINE");
		stock.put("011", "PILCHARD");
		stock.put("012", "SAVON");
		stock.put("013", "TOMATE");
		stock.put("014", "POULET");
		stock.put("015", "KWANGA");
		stock.put("016", "YOYO");
		stock.put("017", "BONBON");
		stock.put("018", "PAIN");
		stock.put("019", "EMPOULE");
		stock.put("020", "SAC");
		System.out.println("entre soit le code de l'article ou le nom de l'article:");
		String rech = lect.next();
		for (Map.Entry mapentry : stock.entrySet()) {
			if(mapentry.getValue().equals(rech) || mapentry.getKey().equals(rech))
				System.out.println("cle: " + mapentry.getKey() + "| valeur : " + mapentry.getValue());
			}
     	}
}