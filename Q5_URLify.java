public class Q5_URLify {

    public static int findLastChar(char[] str){
        for(int i=str.length-1; i>=0; i-- ){
            if(str[i]!=' '){
                return i;
            }
        }
        return -1;
    }

    public static void replaceSpaces(char[] str, int tlen){
        int spaces=0, index, i=0;
        for(i=0; i<tlen; i++){
            if(str[i]==' ')
                spaces++;
        }

        index = tlen+ spaces*2;

        for(i=tlen-1; i>=0; i--){
            if(str[i]==' '){
                str[index-1]='0';
                str[index-2]='2';
                str[index-3]='%';
                index=index-3;
            }
            else{
                str[index-1]=str[i];
                index--;
            }
        }
    }

    public static void main(String[] args) {
        String string = "Mr John Doe     ";
        // String str = string.trim().replaceAll(" ", "%20");
        // System.out.println(str);
        char[] strArr = string.toCharArray();
        int tlen = findLastChar(strArr)+1;
        replaceSpaces(strArr, tlen);
        System.out.println(new String(strArr));

    }
}
