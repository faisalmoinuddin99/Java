/*
DEFAULT  METHODS:
 */

interface Camera {
    void takeSnap();
    void recordVideo();

    private void zoomIn(){
        System.out.println("Zooming IN....");
    }
    default void record4kVideo(){
        zoomIn();
        System.out.println("Record basic 4k video");
    }

}
interface wifi {
    String[] getNetworks();
    void connectingToNetwork(String network);
}

interface GPS {
    void setLocation(String location);
    void getLocation();
}
class CellPhone{

    void callNumber(int number){
        System.out.println("Calling to " + number);
    }

    void pickCall(){
        System.out.println("Connecting....");
    }
}

class SmartPhone extends CellPhone implements  Camera, wifi{

    @Override
    public void takeSnap() {
        System.out.println("Picture Clicked");
    }

    @Override
    public void recordVideo() {
        System.out.println("Video Recording Started");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting list of networks:");
        String [] networkList = {"Mayank4G", "Anjali5G","Airtel2G"};
        return networkList;
    }

    @Override
    public void connectingToNetwork(String network) {

    }
//    @Override
//    public void record4kVideo(){
//        System.out.println("Record 4k video with addition features");
//    }
}

public class Main {
    public static void main(String[] args) {
        SmartPhone samsung = new SmartPhone() ;
        samsung.callNumber(100);  // Calling to 100
        samsung.pickCall(); // Connecting....

        samsung.takeSnap(); // Picture Clicked
        samsung.recordVideo(); // Video Recording Started

       String[] arr =  samsung.getNetworks();
       for(String network : arr){
           System.out.println(network);
       }
       /*
       Getting list of networks:
        Mayank4G
        Anjali5G
        Airtel2G
        */
       samsung.record4kVideo(); // Default Method

        /*
        Zooming IN....
        Record basic 4k video
         */

        // Reference Name of Interface
        Camera nikon = new SmartPhone();
        nikon.takeSnap(); // Picture Clicked
        nikon.record4kVideo();

    }
}