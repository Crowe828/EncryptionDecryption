
public class EncryptDecrypt {

	public static void main(String[] args) {
		
		int key = 6;
		System.out.println("Encrypted message:");
		String text = "Nu}-y&oz&muotmE";
		System.out.println(text);
		System.out.println("");
		System.out.println("Decrypted message:");
		
		char[] chars = text.toCharArray();
		
		for (char c : chars) {
			c -= key;
			
			System.out.print(c);
		}

	}

}
