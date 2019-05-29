package _05_vault;

import java.util.Random;

public class Vault {
	int code;
	boolean tryCode(int code) {
		if(this.code == code) {
			System.out.println("Found it - " + code); 
			return true;
		}
		else {
			System.out.println("working... " + code );
			return false;
		}
}
	Vault(){
		Random r = new Random();
		code = r.nextInt(1_000_001);
	}

}
