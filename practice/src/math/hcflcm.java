package math;
public class hcflcm {
    public static void main(String[] args) {
        System.out.println("hcf is "+hcf(180,15));
        System.out.println("lcm is  "+lcm(180,15));
    }

    public static int hcf(int a,int b){
        if (b==0) return a ;
        else return hcf(b,a%b);

    }

    public static int lcm (int a, int b){
        return (a*b)/hcf(a,b);
    }
    
}
