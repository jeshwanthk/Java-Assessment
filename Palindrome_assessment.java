class Solution {
    public boolean isPalindrome(int x) {
        int temp=0,y=0,originalx=x;
        while(x>0){
            temp=x%10;
            x=x/10;
            y=y*10+temp;
        }
        if(originalx==y){
                  return true;
        }
        return false;
    }
}