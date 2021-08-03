package nuc.edu;

/**
 * @author 薛东
 * @date 2021/5/17 10:35
 */
public class Test02 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 50 + 30);
        }

        System.out.println("排序前：");
        for (int num : arr) {
            System.out.print(num + "_");
        }
        System.out.println();

        for(int end = arr.length - 1; end > 0; end--){
            for(int begin = 1; begin <= end; begin++){
                if(arr[begin] < arr[begin - 1]){
                    int temp = arr[begin];
                    arr[begin] = arr[begin - 1];
                    arr[begin - 1] = temp;
                }
            }
        }

        System.out.println("排序后：");
        for (int num : arr) {
            System.out.print(num + "_");
        }

    }
}
