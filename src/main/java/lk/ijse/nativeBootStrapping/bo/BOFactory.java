package lk.ijse.nativeBootStrapping.bo;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory(){}

    public static BOFactory getBoFactory(){
     return    (boFactory == null)? boFactory = new BOFactory():boFactory;
    }

    public enum BOTypes{

    }
}
