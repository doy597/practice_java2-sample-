public class Q2_2 implements Person{
	public void speak(){
		System.out.println("話す");
	}
}

// Q2_2クラスはPersonインターフェイスを実装している
// Q2_2クラスはインターフェイスで定義されたメソッドを実装する
// インターフェイスで実装されたクラスには、暗黙的に「public」と「private」修飾子が付加される
// Person型で宣言した変数に、Q2_2クラスのオブジェクトを代入することができる

