import java.util.Scanner;
class CSIE_51015114_1031_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans[],question[] ;
        int input ;
        input = sc.nextInt();
        ans = new int[input];
        question=new int[input];
        //放進陣列
        for(int i=0 ; i<input ; i++){
            ans[i] = sc.nextInt();
            question[i]=ans[i];
        }
        //氣泡排序
        int temp=0 ; 
        for(int i=0 ; i<input ; i++){
            for(int j=i+1 ; j <input ; j++){
                if(ans[i]>ans[j]){
                    temp=ans[i];
                    ans[i]=ans[j];
                    ans[j]=temp;
                }
            }
        }
        //輸出

        for(int i=0 ; i<input ; i++){
	    if(i==0)
               System.out.print(ans[i]);
	    else
	        System.out.print(" "+ans[i]);

        }
        
    }
    
}