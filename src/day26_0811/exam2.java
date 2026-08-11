package day26_0811;

public class exam2 {
    public static void main(String[] args) {
        
        // 자바는 100% 객체지향.
        // Object(슈퍼클래스) 클래스로부터 모든 클래스는 상속관계
        // 1. A -- > Object(a)
        A a = new A(); // 총 2개
        // 2.
        B b = new B(); // 총 3개, B -> A -> object
        
        // 3.
        C c = new C(); // 총 3개, C -> A -> object
        // 4.
        D d = new D(); // 총 4개, D -> B -> A -> object
        // 5.
        E e = new E(); // 총 4개, E -> C -> A -> Object

        // [2] 자동타입변환 / 업캐스팅 object까지 가능
        A a2 = b; // B -> A [가능]
        Object o1 = a; // A -> Object [가능]

        Object aa = 1;
        Object aaa = "ㅁㅁ";
        Object[] objects = new Object[100];

        // [3] 강제타입변환 / 다운캐스팅
        B b2 = (B)a2; // A -> B [가능] 태생이 B라서
        // C c2 = (C)b;  // 즉] B는 C포함하지 않기 때문에 불가능
        // [4] 타입확인, 인스턴스 instanceOf 타입명 
        System.out.println( e instanceof Object ); // e->Object
        System.out.println( e instanceof C); // e -> C // true
        // System.out.println( e instanceof D ); // e --> D //false
        // System.out.println( e instanceof B ); // e --> B  // false
        // 즉] 타입변환 전 instanceof 키워드 활용하여 타입확인 후 타입변환<안전> **


    }
}
class A{
    A(){System.out.println("[1] A객체 생성");}
}
class B extends A{
    B(){System.out.println("[2] B객체 생성");}
}
class C extends A{
    C(){System.out.println("[3] C객체 생성");}
}
class D extends B{
    D(){System.out.println("[4] D객체 생성");}
}
class E extends C{
    E(){System.out.println("[5] E객체 생성");}
}
