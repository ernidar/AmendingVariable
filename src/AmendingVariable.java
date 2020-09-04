public class AmendingVariable {

        public static void main(String[] args)
        {
            double income = 62000;

            double incomeSecond = income + (income * 10/100);
            System.out.println("Annual Income on the second year : " + incomeSecond);

            double IncomeThird =incomeSecond + (incomeSecond * 10/100);
            System.out.println("Annual Income on the third year : " + IncomeThird );

            double IncomeFourth = IncomeThird + (IncomeThird * 10/100);
            System.out.println("Annual Income on the fourth year : " + IncomeFourth);

            double IncomeFifth = IncomeFourth + (IncomeFourth * 10/100);
            System.out.println("Annual Income on the fifth year : " + IncomeFifth);

//        for (int i=2; i<=5; i++) {
//            double newIncome = income + (income * 10/100);
//
//            System.out.println("Annual Income on the year "+i+ " = " + newIncome);
//        }
        }

}
