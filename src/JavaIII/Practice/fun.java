package JavaIII.Practice;

public class fun {
    static int fun(int y)
    {
        if(y == 0)
            return 3;
        else
            return fun(y - 2);
    }

    static int test(int n){
        if (n == 0)
            return 1;
        else
            return n * test(n - 2);
    }

    static int test2(int n){

        return  test2(n + 2);
    }

    static int function(int n){
        if (n == 0) return 1;

        return n * function(n + 1);
    }



    public static void main(String[] args) {
//        System.out.println(fun(4));
//        System.out.println(test(6));
//        System.out.println(test2(2));
        System.out.println(function(0));


    }
}
