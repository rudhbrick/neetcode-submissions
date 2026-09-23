class Solution{
    public int compress(char[] chars){
        int read=0,write=0,end=read;
        while(end<chars.length){
            while(end<chars.length&&chars[end]==chars[read]) end++;
            int count=end-read;
            chars[write++]=chars[read];
            if(count>1){
                String countStr=String.valueOf(count);
                for(char c:countStr.toCharArray()) chars[write++]=c;
            }
            read=end;
        }
        return write;
    }
}