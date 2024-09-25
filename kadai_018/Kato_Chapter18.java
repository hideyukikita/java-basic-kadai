package kadai_018;

public abstract class Kato_Chapter18 {
	
	//フィールド
	public String familyName = "";
	public String givenName = "";
	public String address = "";
	
	//メソッド
	public void commonIntroduce() {
		this.familyName = "加藤";
		this.address = "東京都中野区〇×";
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	abstract public void eachIntroduce();
	
	public void execIntroduce() {
		this.commonIntroduce();
		this.eachIntroduce();
	};

}
