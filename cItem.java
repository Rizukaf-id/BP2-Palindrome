package palindrome;

public class cItem {
    private char huruf;
    cItem next, prev;
    cItem(char h){
        huruf = h;
    }
    public char getHuruf(){
        return huruf;
    }
}
