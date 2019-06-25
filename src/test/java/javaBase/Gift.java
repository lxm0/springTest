package javaBase;

public class Gift {
    public static void main(String[] args) {
        int i,j;
        i=2;
        j=3;
        double m = (double) i/j;
        System.out.println(m);
    }
    public static void solution(int money,int n,int[] price,int[] r ){
        double [] bizhi =new double[n];
        int curTotal=0;
        int[] curPrice = new int[n];
        int[] curR = new int[n];
        for (int i=0;i<n;i++){
            bizhi[i]= (double)r[i]/price[i];
        }
        if (price[0]<money){
            curTotal = price[0];
            curPrice[0]=price[0];
            curR[0]=r[0];
        }
        for (int i=1;i<n;i++){

        }

    }
}
