public class LampuKamar {
    private String jenisLampu;
    private boolean isOn = true;

    public void setJenis(String value){
        jenisLampu = value; 
    }

    public boolean nyalakanLampu(){
        return isOn = true;
    }

    public boolean matikanLampu(){
        return isOn = false;
    }

    public void printData(){
        System.out.println("Lampu      : " + jenisLampu);
        if(isOn == true){
            System.out.println("Dalam kondisi menyala");
        }else if(isOn == false){
            System.out.println("Dalam kondisi mati");
        }
    }
}
