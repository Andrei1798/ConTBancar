public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        ContBankExtd c1 = new ContBankExtd(50000, 23.24);
        c1.addLunarInterest();
        c1.afs();
        System.out.println();
        System.out.println();
    }
}
