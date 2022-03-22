import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;

public class ExempleHashage {
	
	public static void main(String[] args){
		if(args.length != 1 && args.length != 2){
			System.out.println("Usage :\njava ExempleHashage mot_de_passe [algorithme]\nOu\njava ExempleHashage ?");
			System.exit(0);
		}
		
		if(args[0].equals("?")){
			System.out.println("Les algorithme supportés sont :\n" +
				"SHA-1\n" +
				"SHA-224\n" +
				"SHA-256\n" +
				"SHA-384\n" +
				"SHA-512\n" +
				"SHA-512/224\n" +
				"SHA-512/256");
			System.exit(0);
		}
		
		String message = args[0];
		String algorithme = args.length == 2 ? args[1] : "SHA-512";
		
		try{
		
			System.out.println("Hashage en utilisant " + algorithme);
			MessageDigest messageDigest = MessageDigest.getInstance(algorithme);
			byte[] hashBytes = messageDigest.digest(message.getBytes(StandardCharsets.UTF_8));
			String hashString = Base64.getEncoder().encodeToString(hashBytes);
			System.out.println("La valeur du hash est : \n" + hashString);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}