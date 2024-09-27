package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	public String getMyChoice() {
		System.out.println("じゃんけんの手を入力してください（rspでの入力）");
		Scanner scanner = new Scanner(System.in);
		String input = "";
		boolean isValid = false;
		
		while(!isValid) {
			input = scanner.nextLine();
			if(input.equals("r") || input.equals("s") || input.equals("p")) {
				isValid = true;
				scanner.close();
			}else {
				System.out.println("無効な値です。再度じゃんけんの手を入力してください(rspでの入力)");
			}
		}
		
		return input;
	}
	
	public String getRandom() {
		//配列設定
		String[] hand = {"r", "s", "p"};
		//ハンド設定
		String random = hand[(int) Math.floor(Math.random() * 3)];
		//ハンドを返す
		return random;
	}
	
	public void playGame() {
		
		//ハンドの定義
		String myHand = getMyChoice();
		String yourHand = getRandom();
				
		//じゃんけんの手をコレクション
		HashMap<String,String> hand = new HashMap<String, String>();
		hand.put("r", "グー");
		hand.put("s", "チョキ");
		hand.put("p", "パー");
		
		//手の出力
		System.out.println("自分の手は" + hand.get(myHand) + "です");
		System.out.println("コンピューターの手は" + hand.get(yourHand) + "です");
		
		//じゃんけん結果の出力
		if(myHand.equals(yourHand)) {
			System.out.println("あいこです");
		//自分がｒ	
		}else if(myHand.equals("r")) {
			if(yourHand.equals("s")) {
				System.out.println("自分の勝ちです");
			}else {
				System.out.println("自分の負けです");
			}
		//自分がｓ	
		}else if(myHand.equals("s")) {
			if(yourHand.equals("p")) {
				System.out.println("自分の勝ちです");
			}else {
				System.out.println("自分の負けです");
			}
		//自分がｐ	
		}else {
			if(yourHand.equals("r")) {
				System.out.println("自分の勝ちです");
			}else {
				System.out.println("自分の負けです");
			}
		}
	}
	
	
	
}
