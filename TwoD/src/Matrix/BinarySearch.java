package Matrix;

public class BinarySearch {
	
	
	public static void main(String[] args) {
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		searchElement(a,8);
		search(a, 8);
		
	}
	
	static void searchElement(int a[][],int target) {
		for(int i=0;i<a.length;i++) {
			if(a[i][0]<=target && target<=a[i][a[i].length-1]) {
				
				int x=binarySearch(a[i], target);
				
				if(x!=-1) {
					System.out.println(i+","+x);
					return;
				}
				
			}
		}
		System.out.println("Not found");
	}
	
	
	static int binarySearch(int a[],int target) {
		
		int s=0;
		int e=a.length-1;
		while(s<=e) {
			int mid=(s+e)/2;
			if(a[mid]==target) {
				return mid;
			}
			else if(a[mid]<=target) {
				s=mid+1;
			}
			else {
				e=mid-1;
			}
		}
		return -1;
	}
	
	static void search(int a[][], int target) {
		int s=0;
		int e=a.length*a[0].length-1;
		
		while(s<=e) {
			int mid=(s+e)/2;
			int r=mid/a[0].length;
			int c=mid%a[0].length;
			
			if(a[r][c]==target) {
				System.out.println(r+" "+c);
				return;
			}
			else if(a[r][c]<target) {
				s=mid+1;
			}
			else {
				e=mid-1;
			}
		}
		System.out.println("Not found");
	}

}
