class PrimetoC {
    public static void main(String args[]){
        int n=100;
        int C[]= new int[n];
        for(int i=0; i<n; i++){
            C[i]= i+1;
        }
        for(int i=0; i<n; i++){
            int count=0;
            for(int j=1; j<=C[i]; j++){
                if(C[i]%j==0)
                count++;
            }
            if(count==2)
                System.out.print(C[i]+", ");
        }
    }
}