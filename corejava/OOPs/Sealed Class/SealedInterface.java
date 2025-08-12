sealed interface X permits Y {

}
// for extending sealed interface subinterface must be only non-sealed or sealed .
non-sealed interface Y extends X {

}
public class SealedInterface{
    public static void main(String args[]){

    }
}