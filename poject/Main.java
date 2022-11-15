public class Main {
    public static void main(String[] args) throws InterruptedException{


        Phone phone=new Phone("87757829408","iphone","Baha","black","8403033203","250gramm");
        Phone phone2=new Phone("87715891973","recovery","Arys","black","8403033203","204gramm");
        Phone phone3=new Phone("87015161114","xaml","Anatoly","black","8403033203","1000gramm");
        Phone phone4=new Phone("87079802070","iphone","Kirill","black","870551312","2020gramm");
        Phone phone5=new Phone("8442433243","samsung","Arys2","black","8707564245","2030gramm");

        Phone phone6 =new Phone("38838383","robert","x5","220");
        Phone phone7 =new Phone("82323323","s3");
        System.out.println(phone.getColorPhone());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getRecieverPhone());
        System.out.println(phone4.getWeight());
        System.out.println(phone5.getModel());
        System.out.println(phone.getRecieverPhone());
        phone.setColorPhone("white");
        phone2.setModel("bukigang");
        phone3.setWeight("230");

        phone2.recieveCall("Tubz","87777777777");
        phone2.sendMessage();
    }
}