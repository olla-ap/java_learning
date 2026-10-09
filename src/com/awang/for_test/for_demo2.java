public class for_demo2 {
    public  static void  main(String[] args){
        // 打印空心菱形：只打印收尾，用if-else语句
        // 打印上半部分三角形
        for(int i = 1;i <= 4;i++) {
            for (int k = i;k <= 3;
                 k++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1;
                 k++){
                if(k == 1 || k == i * 2 -1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                }
            System.out.println();
            }



        // 打印下半部分三角形
        for(int i = 1;i <= 3;i++){
            for(int k = 1;k <= i;k++){
                System.out.print(" ");
            }
            for(int k = 1;k <= 7-2 * i;k++){
                if (k == 1 || k == 7-2*i) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }




    }
}
