public class PhoneBook extends Phone implements PhoneFunction{
    public Phone[] phoneList = new Phone[10];
    public int listIndex = 0;

    public PhoneBook() {
    }

    @Override
    public void insertPhone(String name, String phone) {
        if(listIndex < phoneList.length){
            phoneList[listIndex] = new Phone(name,phone);
            listIndex++;
        } else
            System.out.println("Danh ba da day khong the them");
    }

    @Override
    public void removePhone(String name) {
        boolean isRemove = false;
        for(int i = 0; i < listIndex; i++){
            if(phoneList[i].getName().equals(name)){
                sortANullElement(i);
                isRemove = true;
                break;
            }
        }
        if(isRemove){
            listIndex--;
            System.out.println("Da xoa");
        } else
            System.out.println("So nay khong ton tai");
    }

    @Override
    public void updatePhone(String name, String phone) {
        boolean isUpdate = false;
        for(int i = 0; i < listIndex; i++){
            if(phoneList[i].getName().equals(name)) {
                phoneList[i].setPhone(phone);
                isUpdate = true;
                break;
            }
        }
        if(isUpdate){
            System.out.println("Da cap nhap");
        } else
            System.out.println("So lien lac khong ton tai");
    }

    @Override
    public Phone searchPhone(String name) {
        for(int i = 0; i < listIndex; i++){
            if(phoneList[i].getName().equals(name)){
                return phoneList[i];
            }
        }
        return null;
    }

    @Override
    public void sortPhone() {
        int i = 0;
        int j = 0;
        while(i < listIndex){
            j = i;
            while(j < listIndex){
                if(phoneList[i].getName().charAt(0) > phoneList[j].getName().charAt(0)){
                    Phone tmp;
                    tmp = phoneList[i];
                    phoneList[i] = phoneList[j];
                    phoneList[j] = tmp;
                }
                j++;
            }
            i++;
        }
    }

    private void sortANullElement(int index) {
        for(int j = index; j < listIndex - 1; j++){
            phoneList[j] = phoneList[j + 1];
            if(j + 1 == listIndex - 1){
                phoneList[j + 1] = null;
            }
        }
    }

}
