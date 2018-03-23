package com.thaonguyen.java.share;

public class Share {
	
	public boolean check_SHT(int n){
		int tong =0;
		int temp=n;
        for ( int i = 1; i < temp ; i ++){
            if ( temp % i == 0 ) tong = tong + i;
        }
		if(tong == temp){
			return true;
		}
		return false;
	}
	
	public boolean check_SNT(int n){
        if (n < 2) {
            return false;
        }
        int s = (int) Math.sqrt(n);
        for (int i = 2; i <= s; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
	}
	
	public boolean check_nsole(int n){
		
		   int i;
		   while (n!=0)
		   {
		       i = n % 10;
		       if (i % 2 == 0){
		           return false;
		       }

		       n=n/10;
		   }
		return true;
	}
}
