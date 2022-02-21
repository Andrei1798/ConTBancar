public class ContBankExtd extends ContBank{
    double anInterest;

    public ContBankExtd(int sum, double anInterest){
        super(sum);
        this.anInterest = anInterest;
    }


    public void addLunarInterest(){
        int currentSum = getSum();
        System.out.println("Suma din cont: " + currentSum);
        float anInt = (float) (currentSum * (anInterest/100));
        System.out.println("Dobanda lunara: " + anInt/12);
        currentSum += anInt/12;
        System.out.println("Valoarea contului dupa trecerea unei luni: " + currentSum);
    }

    public void afs() {
        System.out.println("Valoarea sumei de bani din cont: " + getSum());
        System.out.println("Dobanda anuala: " + anInterest);
    }
}
