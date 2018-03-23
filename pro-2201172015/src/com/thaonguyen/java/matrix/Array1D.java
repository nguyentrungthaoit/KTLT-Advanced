package com.thaonguyen.java.matrix;
import com.thaonguyen.java.share.Share;



/**
 * @author Nguyễn Trung Thảo
 * MSSV: 2201172015
 * Class: 07DHLT1
 * Date: 23/03/2018
 * Bài tập trang 48 từ bài 1 đến 25. Mảng 1 chiều
 */
public class Array1D {
	public Share share = new Share();
	
	public Array1D(){
		
	}
	
	/**
	 * Đề: Viết hàm liệt kê các giá trị chẵn trong mảng 1 chiều các số nguyên.
	 * Input:
	 * Output:
	 * 
	 * 
	 */
	public void Array1D_BAI01(int a[]){
		
		for(int i =0; i < a.length; i++){
			if(a[i] % 2 == 0){
				System.out.println("vị trí chứa giá trị chẵn là a[" + i + "] = " + a[i]);
			}
		}	
	}
	
	/**
	 * Đề: Viết hàm liệt kê các vị trí mà giá trị tại đó là giá trị âm trong mảng 1 chiều số nguyên
	 * Input:
	 * Output:
	 * 
	 * 
	 */
	public void Array1D_BAI02(int a[]){
		for(int i =0; i < a.length; i++){
			if(a[i] < 0){
				System.out.println("vị trí chứa giá trị âm là a[" + i + "]");
			}
		}	
	}
	
	/**
	 * Đề:Viết hàm tìm giá trị lớn nhât trong mảng 1 chiều các số thực
	 * Input:
	 * Output:
	 * 
	 * 
	 */
	public void Array1D_BAI03(float a[]){
		
		float max = a[0];
		for(int i =0; i < a.length; i++){
			if(a[i] > max ){
				max = a[i];
			}
		}	
		System.out.println("Số thực lớn nhất của mảng là " + max);
	}
	
	/**
	 * Đề: Viết hàm tìm giá trị dương đầu tiên trong mảng 1 chiều các số thực. Nếu mảng không có giá trị dương thì trả về trừ -1.
	 * Input:
	 * Output:
	 * 
	 * 
	 */
	public float Array1D_BAI04(float a[]){
		for(int i = 0; i < a.length; i++){
			if(a[i] >= 0){
				return a[i];
			}
			
		}
		return -1;
	}
	
	/**
	 * Đề: Viết hàm tìn số chăn cuối cùng trong mảng 1 chiều các số nguyên. Nếu mảng không có gia trị chẳn thì trả về giá trị -1.
	 * Input:
	 * Output:
	 * 
	 * 
	 */
	public int Array1D_BAI05(int a[]){
		
		for(int i= a.length;i < 0; i--){
			if(a[i] % 2 == 0){
				return a[i];
			}
		}
		
		return -1;
		
	}


	/**
	 * Đề: Viết hàm tìm 1 vị trí giá trị nhỏ nhất đầu tiên trong mảng các số thực.
	 * Input:
	 * Output:
	 * 
	 * 
	 */
	public int Array1D_BAI06(float a[]){
		float min = a[0];
		for(int i = 0; i < a.length; i++){
			if(a[i]< min){
				min = a[i];
			}
		}
		
		for(int j = 0; j < a.length; j++){
			if(a[j] == min){
				return j;
			}
		}
		return -1;
	}
	
	
	/**
	 * Đề: Viết hàm tìm vị trí của giá trị 
	 * Input:
	 * Output:
	 * 
	 * 
	 */
	public int Array1D_BAI07(int a[]){
		
		for(int i = 0; i <a.length; i++)
		{
			if(a[i] % 2 ==0 )
			{
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Đề:
	 * Input:
	 * Output:
	 * 
	 * 
	 */
	public int Array1D_BAI08(int a[]){
		
		for(int i = a.length; i <0; i--){
			if(this.share.check_SHT(a[i])){
				return i;
			}
		}
		
		return -1;
	}
	
	/**
	 * Đề:
	 * Input:
	 * Output:
	 * 
	 * 
	 */
	public float Array1D_Bai09(float a[]){
		float min = a[0];
		for(int i=0; i<a.length; i++){
			if(a[i] > 0 && a[i] < min){
				min = a[i];
				
			}
		}
		if(min < 0){
			return -1;
		}
		else{
			return min;
		}
	}
	
	/**
	 * Đề:
	 * Input:
	 * Output:
	 * 
	 * 
	 */
	public int Array1D_BAI10(int a[]){
		for(int i = 0; i< a.length; i++){
			if(this.share.check_SNT(a[i])){
				return a[i];
			}
		}
		return -1;
	}
	
	/**
	 * Đề:
	 * Input:
	 * Output:
	 * 
	 * 
	 */
	public int Array1D_BAI11(int a[]){
		
		for(int i = 0; i< a.length; i++){
			if(this.share.check_SHT(a[i])){
				return a[i];
			}
		}
		return -1;
	}
	
	/**
	 * Đề:
	 * Input:
	 * Output:
	 * 
	 * 
	 */
	public float Array1D_BAI12(float a[]){
		
		float max = a[0];
		for(int i =0; i < a.length; i++){
			if(a[i] < 0 ){
				max = a[i];
				return max;
			}else{
				return 0;
			}
		}
		if(max < 0){
			for(int i = 0; i < a.length; i++){
				if(a[i] > max ){
					max = a[i];
					return max;
				}
			}
		}
		return 0;
		
	}
	
	/**
	 * Đề:
	 * Input:
	 * Output:
	 * 
	 * 
	 */
	public int Array1D_BAI13(int a[]){
		
		int max = a[0];
		for(int i =0; i < a.length; i++){
			if(this.share.check_SNT(a[i])){
				max = a[i];
				break;
			}
		}
		if(this.share.check_SNT(max)){
			for(int i =0;i <a.length; i++){
				if(this.share.check_SNT(a[i]) && a[i] > max){
					max = a[i];
				}
			}
			return max;

		}else{
			return 0;
		}
		
	}
	
	/**
	 * Đề:
	 * Input:
	 * Output:
	 * 
	 * 
	 */
	public int Array1D_BAI14(int a[]){
		
		int min = a[0];
		for(int i =0; i < a.length; i++){
			if(this.share.check_SHT(a[i])){
				min = a[i];
				break;
			}
		}
		if(this.share.check_SHT(min)){
			for(int i =0;i <a.length; i++){
				if(this.share.check_SHT(a[i]) && a[i] < min){
					min = a[i];
				}
			}
			return min;

		}else{
			return 0;
		}
		
	}
	
	/**
	 * Đề:
	 * Input:
	 * Output:
	 * 
	 * 
	 */
	public int Array1D_BAI15(int a[]){
		
		int min = a[0];
		for(int i =0; i < a.length; i++){
			if(a[i] % 2 == 0){
				min = a[i];
				break;
			}
		}
		if(min % 2 == 0){
			for(int i =0;i <a.length; i++){
				if((a[i] % 2 == 0) && (a[i] < min)){
					min = a[i];
				}
			}
			int dem = 0,pos = 0;
			for(int i =0;i <a.length; i++){
				if(a[i] == min){
					dem++;
					pos = a[i];
				}
			}
			if(dem > 1){
				return pos;
			}else{
				return min;
			}

		}else{
			return 0;
		}
		
	}
	
	/**
	 * Đề:
	 * Input:
	 * Output:
	 * 
	 * 
	 */
	public float Array1D_BAI16(float a[], float x){
		float temparr[] = null;
		float max;
		for(int i = 0; i< a.length; i++){
			if(a[i] < x ){
				temparr[i] = x -a[i]; 
			}else{
				temparr[i] = a[i] - x;
			}
		}
		max = temparr[0];
		for(int i = 0; i < temparr.length; i++){
			if(temparr[i] > max){
				max = temparr[i];
			}
		}
		return max;
	}
	
	/**
	 * Đề:
	 * Input:
	 * Output:
	 * 
	 * 
	 */
	public float Array1D_BAI17(float a[], float x){
		float temparr[] = null;
		float min;
		for(int i = 0; i< a.length; i++){
			if(a[i] < x ){
				temparr[i] = x -a[i]; 
			}else{
				temparr[i] = a[i] - x;
			}
		}
		min = temparr[0];
		for(int i = 0; i < temparr.length; i++){
			if(temparr[i] > min){
				min = temparr[i];
			}
		}
		return min;
	}
	
	/**
	 * Đề:
	 * Input:
	 * Output:
	 * 
	 * 
	 */
	public void Array1D_BAI18(float a[]){
		float max = a[0];
		float min = a[0];
		for(int i = 0; i< a.length; i++){
			if(a[i] < min ){
				min = a[i]; 
			}else if(a[i] > max){
				max = a[i];
			}
		}
		System.out.println("Đoạn ["+ min +","+ max +"] chứa tất cả các giá trị trong mảng.");
	}
	
	/**
	 * Đề:
	 * Input:
	 * Output:
	 * 
	 * 
	 */
	public void Array1D_BAI19(float a[]){
		float x = a[0];
		for(int i = 0; i< a.length; i++){
			if(Math.abs(a[i]) > x){
				x = a[i];
			}
		}
		System.out.println("Đoạn [-"+ x +","+ x +"] chứa tất cả các giá trị trong mảng.");
	}
	
	/**
	 * Đề:
	 * Input:
	 * Output:
	 * 
	 * 
	 */
	public int Array1D_BAI20(int a[], int x, int y){
		
		for(int i = 0; i< a.length; i++){
			if(a[i] >= x && a[i] <= y){
				return a[i];
			}
		}
		return x;
		
	}
	
	/**
	 * Đề:
	 * Input:
	 * Output:
	 * 
	 * 
	 */
	public int Array1D_BAI21(int a[], int x, int y){
		
		for(int i = 1; i < a.length - 1; i++)
		{
			if(a[i] == a[i - 1] * a[i + 1])
			{
				return i;
			}
		}
		
		return -1;
	}
	
	/**
	 * Đề:
	 * Input:
	 * Output:
	 * 
	 * 
	 */
	public int Array1D_BAI22(int a[]){
		int max = a[0];
		for(int i = 0; i < a.length - 1; i++)
		{
			if(this.share.check_nsole(a[i]))
			{
				max = a[i];
				break;
			}
		}
		if(this.share.check_nsole(max)){
			for(int i = 0; i < a.length - 1; i++)
			{
				if(this.share.check_nsole(a[i]) && a[i] > max)
				{
					max = a[i];
				}
			}
			return max;
		}else{
			return 0;
		}
		
	}
	
	/**
	 * Đề:
	 * Input:
	 * Output:
	 * 
	 * 
	 */
	@SuppressWarnings("unused")
	public int Array1D_BAI23(int a[]){
		int min = a[0];
		int arr[] = null;
		for(int i = 0; i < a.length - 1; i++)
		{
			if(a[i] % 2 != 0 && a[i] < min)
			{
				min = a[i];

			}else{
				arr[i] = a[i];
			}
		}
		if(min % 2 != 0 && arr != null){
			int max = arr[0];
			for(int i=0; i < arr.length; i++){
				if(arr[i] < min && a[i] > max){
					max = arr[i];
				}
			}
			if(max > min){
				return max;
			}else{
				return 0;
			}

		}else{
			return 0;
		}
		
	}
	
	/**
	 * Đề:
	 * Input:
	 * Output:
	 * 
	 * 
	 */
	public void Array1D_BAI24(int a[]){
		int flag = 0;
		for(int i = 0; i < a.length - 1; i++ ){
			if(a[i] > Math.abs(a[i+1])){
				System.out.println("a["+ i + "] ="+ a[i]);
				flag = 1;
			}
		}
		if(flag == 0){
			System.out.println("Không có giá trị thỏa điều kiện!");
		}
		
	}
	
	/**
	 * Đề:
	 * Input:
	 * Output:
	 * 
	 * 
	 */
	public void Array1D_BAI25(int a[]){
		int flag = 0;
		for(int i = 1; i < a.length - 1; i++ ){
			if(a[i] < Math.abs(a[i+1]) && a[i] > Math.abs(a[i - 1])){
				System.out.println("a["+ i + "] ="+ a[i]);
				flag = 1;
			}
		}
		if(flag == 0){
			System.out.println("Không có giá trị thỏa điều kiện!");
		}
	}
	
}
