public interface PhoneFunction {
    abstract void insertPhone(String name, String phone);
    abstract void removePhone(String name);
    abstract void updatePhone(String name, String phone);
    abstract Phone searchPhone(String name);
    abstract void sortPhone();
}
