package bai_3;

public class MyApp {

	public static void main(String[] args) {

		//bước 0: khởi tạo mảng 10 phần tử.
		int[] arr = {3,4,6,1,11};
		
		//buoc 1
		int index = 0;
		while(index < arr.length -1){
			int pos = index;
			int max = arr[pos];
			for(int i = index + 1; i < arr.length; i++){
				if(arr[i] > max){
					max = arr[i];
					pos = i;
				}
			}
			//buoc 2
			if(pos != index){
				int tg = arr[pos];
				arr[pos] = arr[index];
				arr[index] = tg;
			}
			index = index + 1;//buoc 3 tang index 1 gia tri
		}
		//in ra man hinh
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
	}
}
