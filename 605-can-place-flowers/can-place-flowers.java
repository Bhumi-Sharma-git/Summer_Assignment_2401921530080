class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;
        int k= flowerbed.length;
        for(int i=0;i<k;i++){
            if(flowerbed[i]==0){
                boolean leftEmpty;
                boolean rightEmpty;
                //check left side
                if (i == 0) {
                    leftEmpty = true;
                } else {
                    leftEmpty = (flowerbed[i - 1] == 0);
                }

                // Check right side
                if (i == flowerbed.length - 1) {
                    rightEmpty = true;
                } else {
                    rightEmpty = (flowerbed[i + 1] == 0);
                }
                //plant flower
                if(leftEmpty==true&&rightEmpty==true){
                    flowerbed[i]=1;
                    n--;
                }
                if(n==0) return true;
            }
        }
        return false;
    }
}