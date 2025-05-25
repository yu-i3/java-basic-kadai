package kadai_018;

public abstract class Kato_Chapter18 {

	//姓を表す
	public String familyName = "加藤";
	//名を表す
	public String givenName;
	//住所を表す
	public String address = "東京都中野区○×";

	//共通の紹介を出力する
	public void commonIntroduce(){
		System.out.println("私の名前は" + this.familyName + this.givenName + "です。");
		System.out.println("住所は" + this.address);
	}

	//個別の紹介を出力する
	public abstract void eachIntroduce();


	//紹介を実行する
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}
