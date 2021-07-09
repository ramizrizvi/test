
public class MyFirst {

    public static void main(String[] args) {


        Free ob = new Free();
        Book<Free> obj = new Book<>(ob);
        obj.meth1();
        obj.meth2(obj);



    }
}
