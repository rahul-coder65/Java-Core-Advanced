sealed class A permits B , C {

}
// for extending a sealed class subclass must be final, sealed or non-sealed only.
final class B extends A  {

}
non-sealed class C extends A {

}
class D extends C {

}

public class SealedDemo{
    public static void main(String args[]){
        
    }
}