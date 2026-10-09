public class for_demo1 {
    public  static void  main(String[] args){
        // 打印上半部分三角形
        for(int i = 1;i <= 4;i++) {
            for (int k = i;k <= 3;
            k++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1;
            k++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 打印下半部分三角形
        for(int i = 1;i <= 3;i++){
            for(int k = 1;k <= i;k++){
                System.out.print(" ");
            }
            for(int k = 1;k <= 7-2 * i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
