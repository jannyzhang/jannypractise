public class Range {
    public static void speedRange(int[] arr,int start,int end){
        if (start >= end)
            return;

//        if (end - start == 1){
//            if (arr[end] < arr[start]) {
//                int tt = arr[end];
//                arr[end] = arr[start];
//                arr[start] = tt;
//            }
//        }
        int base = arr[start];
        int i = start;
        int j = end;
        int temp;
        while (i!=j){
            while (arr[j]>=base&&j>i)
                j--;
            while (arr[i]<=base&&i<j)
                i++;


            if (i<j){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        arr[start] = arr[i];
        arr[i] = base;
//        System.out.println(start+"_"+end);
//        for (int kk = start;kk<=end;kk++)
//        {
//            System.out.print(arr[kk]+",");
//        }
//        System.out.println();
        speedRange(arr,start,i-1);
        speedRange(arr,i+1,end);
    }

    public static void guibingSort(int[] a,int start,int end){
        if (start >= end)
            return;
        int mid = (start+end)/2;
        guibingSort(a, start, mid);
        guibingSort(a, mid + 1, end);
        jointogether(a, start, mid, end);

    }

    public static void jointogether(int[] a,int start,int mid,int end){
        int i = start;
        int j = mid+1;
        int[] tmepArray = new int[end-start+1];
        int index = 0;
        while (mid-i>=0 && end - j>=0){
            if (a[i]<a[j]){
                tmepArray[index++] = a[i++];
            }
            else {
                tmepArray[index++] = a[j++];
            }
        }
        while (end - j >= 0)
            tmepArray[index++] = a[j++];
        while (mid - i >= 0)
            tmepArray[index++] = a[i++];

        for (int k = 0; k < index; k++){
            a[start++] = tmepArray[k];
        }
    }
    public static void quickSort01(int[] a, int start, int end) {
        if(start >= end)
            return;
        int i = start;
        int j = end;
        int base = a[start];
        while(i != j) {
            while(a[j] >= base && j > i)
                j--;
            while(a[i] <= base && i < j)
                i++;
            if(i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }

        }
        a[start] = a[i];
        a[i] = base;
        quickSort01(a, start, i - 1);
        quickSort01(a, i + 1, end);
    }

    public static void bubbleSort(int[] arr){
        int temp;
        for (int i = 0; i < arr.length-1;i++)
            for (int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
    }

    public static void selectSort2(int[] arr){
        int temp ;
        int t = 0;
        for (int i = arr.length - 1; i >= 0; i--){
            for (int j = 0; j < arr.length - 1 - t ; j++){
                if (arr[j]>arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            t++;
        }
    }

    public static void selectSort(int[] arr){
        int t = -1;
        int temp;
        for (int i = 0; i <arr.length-1; i++){
            t = i;
            for (int j = i+1; j < arr.length  ; j++){
                if (arr[j] < arr[t]) {
                    t = j;
                }
            }
            temp = arr[t];
            arr[t] = arr[i];
            arr[i] = temp;
int temp22 = 0;
        }
    }

    public static void insertSort(int[] arr){
        int temp = 0;
        int j = 0;
        for (int i = 1; i < arr.length ; i++){
            temp =  arr[i];
            for ( j = i; j>0&&arr[j-1]>temp; j--){
                arr[j] = arr[j-1];
            }
            arr[j] = temp;


        }
    }


    public static void main(String args[]){
        int[] arr = {6,1,3,2,222};
//        int[] arr = {6,2,2,1,3,2,222,7,1};
//        speedRange(arr,0,arr.length-1);
        guibingSort(arr,0,4);
        for (int i = 0;i<arr.length;i++){

            System.out.print(arr[i]+",");
        }
    }
}
