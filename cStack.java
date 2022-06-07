package palindrome;

public class cStack {
    cItem top, bottom;
    int jumlah;
    cStack(){
        top = bottom = null;
        jumlah = 0;
    }
    
    public void push(cItem hrf){
        if (top == null) {
            top = bottom = hrf;
        }else{
            hrf.next = top;
            top.prev = hrf;
            top = hrf;
        }
    }
    
    public cItem pop(){
        if (top == null) {
            System.out.println("CLEARED");
            return null;
        }else if(top.next == null){
            cItem temp = top;
            top = bottom = null;
            temp.next = null;
            temp.prev = null;
            return temp;
        }else{
            cItem temp = top;
            top = top.next; top.prev = null;
            temp.next = null; temp.prev = null;
            return temp;
        }
    }
    
    public void reset(){
        for (cItem temp = top; temp != null; temp = temp.next) {
            if(temp==null){
                System.out.println("EMPTY");
            }
            pop();
        }
    }
    
    public void print(){
        for (cItem temp = top; temp != null; temp = temp.next) {
            System.out.print(temp.getHuruf());
        }
    }
    
    public String cekatas(){
        String hasil="";
        for (cItem temp = top; temp != null; temp = temp.next) {
             String t = Character.toString(temp.getHuruf());
            hasil += t;
        }
        System.out.println("Dari atas: "+hasil);
        return hasil;
    }
    
    public String cekbawah(){
        String hasil="";
        for (cItem temp = bottom; temp != null; temp = temp.prev) {
             String t = Character.toString(temp.getHuruf());
            hasil += t;
        }
        System.out.println("Dari bawah: "+hasil);
        return hasil;
    }
}
