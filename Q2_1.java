public class Q2_1{
	private String name;
	public void setName(String userName){
		name = userName;
	}
	public String getName(){
		return name;
	}
}

// name という属性を扱うために、setNameなどの操作を定義している
// このように属性を定義をひとまとめにることを「カプセル化」という
// これによりオブジェクトは自律的にふるまうことができる
