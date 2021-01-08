class Parent{
	int a;
	Parent(){
		a = 100;
		System.out.println("Parent Constructor");
	}
	void show() {
		//System.out.println(a);
		System.out.println("Parent Method");
	}
	protected int demo() {
		return 0;
	}
}
class Child extends Parent{
	int a;
	int b;
	public Child() {
		a=200;
		b=300;
		System.out.println("Child Constructor");
	}
	void show() {
		//System.out.println(a);
		//System.out.println(super.a);
		//System.out.println(this.a);
		System.out.println("Child Method");
	}
	void show(int a) {
		System.out.println(a);
	}
	
	public int demo() {
		return 1;
	}
}
public class Test {

	public static void main(String[] args) {
		Child c = new Child();
		//c.show();
		//Parent p = new Parent();
		//p.show();
		//c.show(300);
		
		Parent obj = c; 			//up casting
		//c.show();
		//obj.show();
		Parent ppp = c; 	// up casting
		Child ch = (Child) obj; 	//down casting
		
		ppp.show();
		obj.show();
		ch.show();
	}

}
