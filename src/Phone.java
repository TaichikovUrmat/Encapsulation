import java.util.Arrays;

public class Phone {
    private String brand;
    private String model;
    private int  price;
    private String phonesUserName;
    private Contact[] contacts;

    public Phone(String brand, String model, int price, String phonesUserName, Contact[] contacts) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.phonesUserName = phonesUserName;
        this.contacts = contacts;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public String getPhonesUserName() {
        return phonesUserName;
    }

    public Contact[] getContacts() {
        return contacts;
    }
    ///// set ///////////


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPhonesUserName(String phonesUserName) {
        this.phonesUserName = phonesUserName;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }
//
//    public String getInfo() {
//        return "Phone{" +
//                "brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", price=" + price +
//                ", phonesUserName='" + phonesUserName + '\'' +
//                ", contacts=" + Arrays.toString(contacts) +
//                '}';
//    }
    public void  getInfo(){
        System.out.println(
                "\n name : " + brand +
                "\n dateOfBirth : " + model+
                "\n phoneNumber : " + price+
                "\n nationality : " + phonesUserName +
                "\n nationality : " + Arrays.toString(contacts));
    }

    public void getContactCount(){
        System.out.println("Contacts for user: "+ phonesUserName);
        for (Contact contact : contacts){
            System.out.println("Name: " + contact.getContactName() + ", Phone: " + contact.getPhoneNumber());
        }
        System.out.println("Total contacts: " + contacts.length);

    }
}
