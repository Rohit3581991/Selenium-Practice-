package arraybasic;

 class Arrayexample {
  static int[]getArray(){
		  int num[]=new int[3];
		  num[0]=10;
		  num[1]=13;
		  num[2]=15;
		  return num;
		  //return new int [](10,30,50,90,60);
	  }
  }
	 class Array5 {
		 public static void main(String args[]) {
			 int arr[]=Arrayexample.getArray();
			 for (int i=0;i<arr.length;i++) {
				 System.out.println(arr[i]);
				 
			 }
		 }
		
	  }


