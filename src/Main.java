interface Phone {
    int price = 50;
    void openCamera();
    void clickPhoto();
}

interface Media {
    default void onRadio() // Default method
    {
        System.out.println("Playing radio");
    }
    void watchYouTube(); // abstract method
}

interface Internet {
    default void chrome(){
        System.out.println("Google");
    }
}

class Apple implements Phone, Media, Internet{

    @Override
    public void openCamera() {
        System.out.println("opening camera");
    }

    @Override
    public void clickPhoto() {
        System.out.println("clicked photo");
    }



    @Override
    public void watchYouTube() {
        System.out.println("Gaming Videos");
    }
}

public class Main {
    public static void main(String[] args) {
        Phone p = new Apple(); // Phone Reference pointing to Apple Object
        p.clickPhoto(); // clicked photo
        p.openCamera(); //
        System.out.println("Phone[interface] ref: "+ p.price); // 50

        Apple iphone11 = new Apple();
        System.out.println("Apple[class] ref: " + iphone11.price); // 50
        iphone11.onRadio(); // Playing radio
        iphone11.watchYouTube(); // Gaming Videos
        iphone11.chrome(); // Google

    }
}