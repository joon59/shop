import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("----menu-----");
        System.out.println("hamberger ราคา 50 = 1");
        System.out.println("HotDog ราคา 20 = 2");
        System.out.println("SauSages ราคา 20 = 3");
        System.out.println("Popcorn ราคา15 = 4");
        System.out.println("Cake ราคา 60 = 5");
        System.out.println("===Stop menu = 6===");

        int Hamburger = 1;
        int HotDog = 2;
        int SauSages = 3;
        int Popcorn = 4;
        int Cake = 5;

        int list1 = 50;
        int list2 = 20;
        int list3 = 20;
        int list4 = 15;
        int list5 = 60;

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("---Enter your menu---");
        int menu = sc.nextInt();
        for (int menunum = menu; menunum !=6;) {
            if (menunum == Hamburger) {
                System.out.println("---your menu---");
                System.out.println("Hamburger " + list1 + " บาท");
                num1 = num1 + 1;

            }
            if (menunum == HotDog) {
                System.out.println("---your menu---");
                System.out.println("HotDog " + list2 + " บาท");
                num2 = num2 + 1;
            }
            if (menunum == SauSages) {
                System.out.println("---your menu---");
                System.out.println("SauSages " + list3 + " บาท");
                num3= num3 + 1;
            }
            if (menunum == Popcorn) {
                System.out.println("---your menu---");
                System.out.println("Popcorn " + list4 + " บาท");
                num4= num4 + 1;
            }
            if (menunum == Cake) {
                System.out.println("---your menu---");
                System.out.println("Cake " + list5 + " บาท");
                num5 = num5 + 1;
            }

            if (num1 > 0){
                System.out.println("Hamburger จำนวน" + num1);
            }
            if (num2 > 0){
                System.out.println("HotDog จำนวน" + num2);
            }
            if (num3 > 0){
                System.out.println("Popcorn จำนวน" + num3);
            }
            if (num4 > 0){
                System.out.println("SauSages จำนวน" + num4);
            }
            if (num5 > 0){
                System.out.println("cake จำนวน" + num5);
            }

           int all = num1*list1 + num2*list2 + num3*list3 + num4*list4 + num5*list5;

            System.out.println("ราคารวม" +  all + "บาท");
            menunum = sc.nextInt();
        }
    }
}