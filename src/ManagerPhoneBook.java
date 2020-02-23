import java.util.Scanner;

public class ManagerPhoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.insertPhone("dun", "1");
        phoneBook.insertPhone("aun", "2");
        phoneBook.insertPhone("bun", "3");
        phoneBook.insertPhone("cun", "4");

        int choose  = 0;

        while(true){
            showMenu();
            String name = null;
            String phone = null;
            choose = sc.nextInt();
            switch(choose){
                case 1:
                    System.out.println("Nhap ten:");
                    name = sc.next();
                    System.out.println("Nhap sdt");
                    phone = sc.next();
                    phoneBook.insertPhone(name,phone);
                    break;
                case 2:
                    System.out.println("Nhap ten:");
                    name = sc.next();
                    System.out.println("Nhap sdt muon thay doi: ");
                    phone = sc.next();
                    phoneBook.updatePhone(name,phone);
                    break;
                case 3:
                    System.out.println("Nhap ten:");
                    name = sc.next();
                    phoneBook.removePhone(name);
                    break;
                case 4:
                    showPhoneBook(phoneBook);
                    break;
                case 5:
                    phoneBook.sortPhone();
                    showPhoneBook(phoneBook);
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }


    }

    public static void showMenu(){
        System.out.println("1. Them moi 1 nguoi vao danh ba");
        System.out.println("2. Sua thong tin sdt");
        System.out.println("3. Xoa so nay");
        System.out.println("4. Hien thi danh ba");
        System.out.println("5. Hien thi danh ba sap xep theo ten");
    }

    public static void showPhoneBook(PhoneBook phoneBook){
        for(Phone each : phoneBook.phoneList){
            if(each != null)
                System.out.printf("{%s,%s} \t",each.getName(),each.getPhone());
        }
        System.out.println();
    }
}
