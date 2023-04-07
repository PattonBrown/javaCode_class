public class String_Test {
    char test[] = {};
}
public boolean check_pwd(String password){
    boolean check_length=false;
    boolean check_space=false;
    boolean check_letter=false;
    if(password.length()>=8&&password.length()<=15){
        check_length=true;
        char[] chars=password.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(String.valueOf(chars[i])==" "){
                check_space=true;
            }
            if(chars[i]>='A'&&chars[i]<='Z'){
                check_letter=true;
            }
        }
        // String []strs=password.split("");
        // for(String s:strs){
        //     if(s==" "){
            
        //     }
        // }
        // boolean ret=che
    }
}
