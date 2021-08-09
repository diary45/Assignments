class singleton{
	String s;
	static singleton ins=null;
	private singleton(String s)
	{
		this.s=s;
	}
	static singleton getInstance(String s) {
		if(ins==null)
			ins=new singleton(s);
		return ins;
	}
}

public class Assn2_1{
	public static void main(String[] args) {
		singleton k=singleton.getInstance("hi");
		System.out.print(k.s);
	}
}
//class insingleton extends singleton{
//
//}