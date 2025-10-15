public class Binomial_coeff {

    public static int fact(int n){
        int facto=1;
        for(int i=1 ;i<=n; i++){
            facto*=i;

        }
        return facto;
    }

    // BINOMIAL COEFF FORMULA=(N!/(R!*(R-N)!))

    public static int binomial(int n,int r ){
        int r_fact=fact(r);
        int n_fact=fact(n);
        int nr_fact=fact(n-r);

        int bino=(n_fact/((r_fact)*(nr_fact)));

        return bino;

    }
    public static void main(String[] args) {
        System.out.println(binomial(5, 02));
    }
}
