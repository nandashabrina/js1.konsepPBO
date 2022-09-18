public class Mobil {
    public String merekMobil;
    private int gearMobil = 0;
    private boolean isOn = true;

    public boolean nyalakanMesin(){
        return isOn = true;
    }

    public void gantiGear(int value){
            gearMobil = value;
            System.out.println("Gear berganti menjadi " + gearMobil);
    }

    public boolean matikanMesin(){
        return isOn = false;
    }

    public void printStatus(){
        if(isOn == true){
            System.out.println("Mobil " + merekMobil + " dalam keadaan menyala, dengan posisi gear : " + gearMobil);
        }else if(isOn == false){
            System.out.println("Mobil " + merekMobil + " dalam keadaan mati");
        }
    }
}
