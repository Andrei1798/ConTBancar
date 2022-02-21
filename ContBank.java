public class ContBank {
    private int sum;

    public ContBank(int sum){
        this.sum = sum;
    }
    public void add(int x){
        sum = sum + x;
        System.out.println("Ati adaugat: " + x + " u.m.");
        System.out.println("Suma de bani actualizata: " + sum);
    }
    public void extract(int x){
        if(x <= sum ) {
            System.out.println("True");
            sum = sum - x;
            System.out.println("Suma de bani actualizata: " + sum);
        }else{
            System.out.println("False");
        }
    }
    public int getSum() {
        return sum;
    }
    public void afs(){
        System.out.println("Valoarea sumei de bani din cont: " + sum);
    }
}
