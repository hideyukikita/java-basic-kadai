package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	//HashMap宣言
	HashMap<String,String> dic = new HashMap<String,String>();
	
	public Dictionary_Chapter21() {
		dic.put("apple", "りんご");
		dic.put("peach", "桃");
		dic.put("banana","バナナ");
		dic.put("lemon", "レモン");
		dic.put("pear", "梨");
		dic.put("kiwi", "キウィ");
		dic.put("strawberry", "いちご");
		dic.put("grape", "ぶどう");
		dic.put("muscat", "マスカット");
		dic.put("cherry", "さくらんぼ");
	}
	
	
	public void dicSerch(String a, String b, String c, String d){
	String[] serchWord = { a, b, c, d };
	
	for(int i = 0; i < serchWord.length;i++) {
		if(serchWord[i] != null) {
			System.out.println(dic.get(serchWord[i]));
		}else {
			System.out.println("辞書に登録がありません");
		}
	}
	
	}
	
	
}
