package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    /** Supplier return any kind of value that we want  */
    public static void main(String[] args) {

        System.out.println(getDbConnectionUrl());
        System.out.println(getDbConnectionUrlSupplier.get());
        System.out.println(getDbConnectionUrlSupplierLists.get());

    }
    /** Normal java function */
    static String getDbConnectionUrl(){
        return "jdbc://localhost:553344/users";
    }

    /** Java interface Supplier */
    static Supplier<String> getDbConnectionUrlSupplier =
            () -> "jbc://localhost:553344/users";

    static Supplier<List<String>> getDbConnectionUrlSupplierLists =
            () -> List.of("jdbc://localhost:553344/users",
                           "jdbc://localhost:3000/loging");
    }



