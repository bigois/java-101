package br.com.bigois.comparable;

public class ComparableApp {
    public static void main(String[] args) {
        ListExamples arrayListExamples = new ListExamples();

        arrayListExamples.sortStringList();
        System.out.println("=".repeat(60));

        arrayListExamples.sortBankAccountListByAccountType();
        System.out.println("=".repeat(60));

        arrayListExamples.sortBankAccountListByBalance();
        System.out.println("=".repeat(60));

        arrayListExamples.sortBankAccountListById();
        System.out.println("=".repeat(60));
    }
}
