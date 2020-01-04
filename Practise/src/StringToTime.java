public class StringToTime {
    public static void getTime(String str){
        char[] nums_char = str.toCharArray();
        int[] nums = new int[6];
        for (int i = 0 ; i < nums.length; i++){
            nums[i] = nums_char[i]-'0';
        }
        getAllSort(nums);
    }

    public static void getAllSort(int[] arr){
        int max = 0;
        int min = Integer.MAX_VALUE;
        int max_arr[] = new int[6];
        int min_arr[] = new int[6];
        int temp = 0;
        int active = 0;
        for (int i = 0; i<arr.length;i++) {
            if (arr[i] > 2)
                continue;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] * 10 + arr[j]>= 24||i == j)
                    continue;
                for (int k = 0;  k < arr.length; k++) {
                    if (arr[k]>6||k == i || k == j )
                        continue;
                    for (int l = 0;  l < arr.length; l++) {
                        if (arr[k]*10+arr[l]>59 ||l == i || l == k || l == j )
                            continue;
                        for (int n = 0;  n < arr.length; n++) {
                            if (arr[n] > 6 ||n == i || n == j || n == k || n == l )
                                continue;
                            for (int m = 0;  m < arr.length; m++){
                                if (arr[n]*10+arr[m] >59 || m == i || m == j || m == k || m == l || m == n )
                                    continue;
                                temp = (arr[i]*10+arr[j])*3600 + (arr[k]*10+arr[l])*60 + (arr[n]*10+arr[m]);
                                active = 1;
                                if (temp>max) {
                                    max = temp;
                                    max_arr[0]=arr[i];
                                    max_arr[1]=arr[j];
                                    max_arr[2]=arr[k];
                                    max_arr[3]=arr[l];
                                    max_arr[4]=arr[n];
                                    max_arr[5]=arr[m];
                                }

                                if (temp<min) {
                                    min = temp;
                                    min_arr[0]=arr[i];
                                    min_arr[1]=arr[j];
                                    min_arr[2]=arr[k];
                                    min_arr[3]=arr[l];
                                    min_arr[4]=arr[n];
                                    min_arr[5]=arr[m];
                                }

                            }
                        }
                    }
                }
            }
        }

        if (active == 0){
            System.out.println("N/A");
            return;
        }

        for (int i = 0; i < min_arr.length;i++)
        {
            System.out.print(min_arr[i]);
        }
        System.out.print(",");
        for (int i = 0; i < min_arr.length;i++)
        {
            System.out.print(max_arr[i]);
        }
        System.out.println();
    }

    public static void bubblesort(int[] arr){
        int temp = 0;
        for (int i = 0; i< arr.length;i++){
            for(int j = 0; j< arr.length -i-1;j++){
                if (arr[j]>arr[j+1]){
                    temp = arr[i];
                    arr[i] = arr[i+i];
                    arr[i+1] = temp;
                }
            }
        }
    }

    public static void main(String args[]){
        long startTime = System.currentTimeMillis();
        getTime("123428");
        long endTime = System.currentTimeMillis();
        System.out.println("Time cost:" + (endTime-startTime));
    }
}
