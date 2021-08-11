public class Assn8_1 {
    public static void main(String[] args) {

    operation add=(a,b)->{return a+b;};

    operation sub=(a,b)->{return a-b;};

    operation div=(a,b)->{return a/b;};

    operation mul=(a,b)->{return a*b;};
        System.out.println(oper(25,5,add));
        System.out.println(oper(25,5,sub));
        System.out.println(oper(25,5,div));
        System.out.println(oper(25,5,mul));


    }
    static int oper(int op1,int op2,operation o){
        return o.op(op1,op2);
    }



}

interface operation{
    int op(int a,int b);
}

