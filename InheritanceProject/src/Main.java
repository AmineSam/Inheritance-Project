public class Main {

    public static void main(String[] args) {

        Employee amine = new Employee("Amine", "11/11/1988",
                "01/01/2020");
        System.out.println(amine);
        System.out.println("Age = " + amine.getAge());
        System.out.println("Pay = " + amine.collectPay());

        SalariedEmployee yassine = new SalariedEmployee("Yassine", "11/11/1990",
                "03/03/2020", 35000);
        System.out.println(yassine);
        System.out.println("Amine's Paycheck = $" + yassine.collectPay());

        yassine.retire();
        System.out.println("Amine's Pension check = $" + yassine.collectPay());

        HourlyEmployee hamid = new HourlyEmployee("Hamid", "05/05/1970",
                "03/03/2021", 15);
        System.out.println(hamid);
        System.out.println("Hamid's Paycheck = $" + hamid.collectPay());
        System.out.println("Hamid's Holiday Pay = $" + hamid.getDoublePay());
    }
}
