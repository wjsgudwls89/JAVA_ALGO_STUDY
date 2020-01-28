public class BinarySearch {
    public static void main(String[] args) {
        //바이너리 서치를 하기 위해서는 정렬이 되어있어야함.
        int arr[] = {1,2,3,4,5,6,7,8};
        int myKeyIdx = BinarySearch(arr,4);
        System.out.println(myKeyIdx);
    }
    public static int BinarySearch(int arr[],int key){
        int mid;
        int left = 0;
        int right = arr.length - 1;

        while(true){
            mid = (right+left) / 2; //중간값 찾기

            if(key == arr[mid]){ //찾을 경우 인덱스 리턴
                return mid;
            }
            else if (key > arr[mid]){ // 찾는값이 중간값보다 더 클경우 시작점 변경
                left = mid +1;
            }
            else{
                right = mid -1; // 나머지 경우 마지막 변경
            }
        }
    }
}
