public class TestClass {
    public static void main(String[] args) {
       Motor mt = new Motor();
       mt.merekMotor = "PCX 150";
       mt.nyalakanMesin();
       mt.tambahKecepatan(30);
       mt.printStatus();
       mt.matikanMesin();
       mt.printStatus();
    
       System.out.println();
       Mobil mb = new Mobil();
       mb.merekMobil = "Wuling";
       mb.nyalakanMesin();
       mb.gantiGear(3);
       mb.printStatus();
       mb.matikanMesin();
       mb.printStatus();

       System.out.println();
       LampuKamar lk = new LampuKamar();
       lk.setJenis("LED");
       lk.nyalakanLampu();
       lk.printData();
       lk.matikanLampu();
       lk.printData();

       System.out.println();
       LampuBelajar lb = new LampuBelajar();
       lb.setJenis("LED");
       lb.setDerajat(90);
       lb.nyalakanLampu();
       lb.printData();
       lb.matikanLampu();
       lb.printData();
    }
}
