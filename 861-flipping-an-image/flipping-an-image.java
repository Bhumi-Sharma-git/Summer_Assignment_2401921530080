class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] a:image){
            reverse(a);
            flip(a);
        }
            return image;
        
    }

    public void reverse(int[] a){
        int start=0;
        int end=a.length-1;
        while(start<=end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    public void flip(int[] a){
        for(int i=0;i<a.length;i++){
            a[i]=a[i]^1;
        }
    }
}