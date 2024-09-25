package kadai_018;

public abstract class Kato_Chapter18 {
	
	//フィールド
	public String familyName = "";
	public String givenName = "";
	public String address = "";
	
	//メソッド
	public void commonIntroduce(String familyName, String address) {
		this.familyName = familyName;
		this.address = address;
	};
	public void eachIntroduce() {};
	public void execIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	};

}
