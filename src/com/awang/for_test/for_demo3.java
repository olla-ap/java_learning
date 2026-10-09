public class for_demo3 {
    // 利用for循环打印九九乘法表

    public static void main(String[] args){
        for(int i = 1;i <= 9;i++){
            for(int k = 1;k <= i;k++){
                // 利用\t 制表符使排版整齐
                System.out.print(k + "*" + i + "=" + k * i + "\t");
            }
            System.out.println();
        }



    }
}
