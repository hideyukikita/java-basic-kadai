package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		//各子クラスのインスタンスを作成
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		
		//setGivenNameメソッドを実行
		hanako.setGivenName("花子");
		ichiro.setGivenName("一郎");
		taro.setGivenName("太郎");
		
		//共通部分のメソッド
		hanako.commonIntroduce("加藤", "東京都中野区〇×");
		ichiro.commonIntroduce("加藤", "東京都中野区〇×");
		taro.commonIntroduce("加藤", "東京都中野区〇×");
		
		//execIntroduceメソッドを実行
		taro.execIntroduce();
		taro.eachIntroduce();
		
		ichiro.execIntroduce();
		ichiro.eachIntroduce();
		
		hanako.execIntroduce();
		hanako.eachIntroduce();

	}

}
