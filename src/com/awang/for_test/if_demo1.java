public class if_demo1 {
    public static void main(String []args){
        for(int i = 1;i <= 3;i++){
            // 打印倒三角
            for(int j = i;j <= 2;j++){
                System.out.print(" ");
            }
            for(int j = 1;j <= i * 2 + 1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
