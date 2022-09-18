public class Motor {
    public String merekMotor;
    private int kecepatanMotor;
    private boolean isOn = true;

    public boolean nyalakanMesin(){
        return isOn = true;
    }

    public void tambahKecepatan(int value){
        if(nyalakanMesin()){
            kecepatanMotor += value;
            System.out.println("Kecepatan motor saat ini : " + kecepatanMotor);
        }else if(matikanMesin()){
            kecepatanMotor += 0;
            System.out.println("Mesin belum menyala, tidak bisa menambah kecepatan");
        }
    }

    public boolean matikanMesin(){
        return isOn = false;
    }

    public void printStatus(){
        if(isOn == true){
            System.out.println("Motor " + merekMotor + " dalam keadaan menyala, dengan kecepatan : " + kecepatanMotor);
        }else if(isOn == false){
            System.out.println("Motor " + merekMotor + " dalam keadaan mati");
        }
    }
}
