class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        else{
            StringBuilder temp = new StringBuilder();
            temp.append(countAndSay(n-1));
            int len = temp.length();
            int count=1 ;
            StringBuilder temp1 = new StringBuilder();
            for(int i=0;i<len;i++){
                int j=i+1;
                if((j<len)&&(temp.charAt(i)==temp.charAt(j))){
                    count++;
                }
                else{
                    String temp2 = Integer.toString(count);                   
                    temp1.append(temp2);
                    temp1.append(temp.charAt(i));
                    count = 1;
                }
            }
            return temp1.toString();
        }
    }
}
