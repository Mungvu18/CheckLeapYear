import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Moi ban nhap nam can kiem tra");
        int year = s.nextInt();
        if(year%400==0||(year%4==0&&year%100!=0)){
            System.out.println(year +"la nam nhuan");
        } else{
            System.out.println(year +"khong phai la nam nhuan");
        }
    }
}
