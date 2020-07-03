class Q17{
	int i = 10;
	static int j = 20;
	public static void main(String[] args){

	// このままだとコンパイルエラー
	// [Q17.java:5: static でない 変数 i を static コンテキストから参照することはできません。]

		System.out.println(i);
		System.out.println(j);
	}
}

// インスタンス変数　＝　メンバ変数


