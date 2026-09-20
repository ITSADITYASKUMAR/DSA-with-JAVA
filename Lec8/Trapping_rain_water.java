package Lec8;

public class Trapping_rain_water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,0,2,1,0,1,3,2,1,2,1};
		int ans=sol(arr);
		System.out.println(ans);
	}
	public static int sol(int arr[]) {
		int ans =0;
		for (int i = 0; i<arr.length; i++) {
			int lMax=arr[i];
			int rMax=arr[i];
			for (int j =i+1; j<arr.length; j++) {
				rMax=Math.max(rMax,  arr[j]);
				
			}
			for (int j = i-1; j>=0; j--) {
				lMax=Math.max(lMax,arr[j]);
			}
			int temp=Math.min(lMax, rMax);
			ans+=temp-arr[i];		
		}
		return ans;
	}

}
