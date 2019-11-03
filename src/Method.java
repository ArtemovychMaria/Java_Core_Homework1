public class Method {
    public int add(int a,int b){
        check(a,b);
        return a+b;
    }
    public int sub(int a,int b){
        check(a,b);
        return a-b;
    }
    public int mul(int a,int b){
        check(a,b);
        return a*b;
    }
    public int div(int a,int b){
        check(a,b);
        return a/b;
    }
    public void check(int a,int b){
        if((a==0 && b!=0) || (a!=0 && b==0)){
            throw new ArithmeticException();
        }else if(a<0 && b<0){
            throw new IllegalArgumentException();
        }else if(a==0 && b==0){
            try {
                throw new IllegalAccessException();
            } catch (IllegalAccessException e) {
               e.printStackTrace();
            }
        }
        else if(a>0 && b>0){
            try {
                throw new MarichkaException();
            } catch (MarichkaException e) {
                e.printStackTrace();
                e.toString();
            }
        }}

    public static void main(String[] args) {
        Method method=new Method();
        //method.add(0,2);
        //method.sub(2,0);
        //method.mul(0,7);
        method.div(3,5);
    }
}

