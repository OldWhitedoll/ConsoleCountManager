package com.gitTest;

public class Account {
    public static void main(String[] args) {
        boolean isFlag = true;//控制循环结束的条件
        int balance = 10000;//初始金额
        String depositInfo = "";//收支说明

        while (isFlag) {
            System.out.println("-----------------简易收支软件-----------------\n");
            System.out.println("                 1 收支明细");
            System.out.println("                 2 登记收入");
            System.out.println("                 3 登记支出");
            System.out.println("                 4 退   出\n");
            System.out.print("                   请选择(1-4)：");
            char sel = Utility.readMenuSelection();//获取用户的选项

            switch (sel) {
                case '1':
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println("收支\t账户金额\t收支金额\t说  明");
                    System.out.println(depositInfo);
                    System.out.println("--------------------------------------------------");

                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    int income = Utility.readNumber();
                    if (income > 0) balance += income;
                    System.out.print("本次收支说明：");
                    String inDesc = Utility.readString();
                    depositInfo += "收入\t" + balance + "\t" + income + "\t\t" + inDesc + "\n";
                    System.out.println("---------------------登记完成---------------------");

                    break;
                case '3':
                    System.out.print("本次支出金额：");
                    int withdraw = Utility.readNumber();
                    if (withdraw > 0) balance -= withdraw;
                    System.out.print("本次只出说明：");
                    String outDesc = Utility.readString();
                    depositInfo += "支出\t" + balance + "\t" + withdraw + "\t\t" + outDesc + "\n";
                    System.out.println("---------------------登记完成---------------------");

                    break;
                case '4':
                    System.out.println("\n确认是否退出(Y/N):");
                    char isEnsure = Utility.readConfirmSelection();
                    if (isEnsure == 'Y') isFlag = false;

                    break;
            }


        }
    }
}
