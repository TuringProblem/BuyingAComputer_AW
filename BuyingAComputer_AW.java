public class BuyingAComputer_AW {
    public static void main(String[] args) {

        double gigOfRam, screenSize, terraBytesOfStorage, mhzProcessorSpeed;

        gigOfRam = 16;
        screenSize = 13;
        terraBytesOfStorage = 1;
        mhzProcessorSpeed = 2;

        //if statement for yogi, Boo-Boo, wile E. Coyote, and Roadrunner

        if (gigOfRam >= 16 && screenSize == 13 && terraBytesOfStorage == 1 && mhzProcessorSpeed == 2){
            System.out.println("Yogi buy a computer.");
        } else{
            System.out.println("Yogi do not but a computer.");
        }

        if (gigOfRam <= 32 && (screenSize == 13 || screenSize == 15) && terraBytesOfStorage >= 1 && mhzProcessorSpeed >= 2) {
            System.out.println("Boo-Boo buy a computer.");
        } else {
            System.out.println("Boo-Boo do not buy a computer.");
        }

        if (gigOfRam > 0 && (screenSize == 13 || screenSize == 15) && (terraBytesOfStorage == 1 || terraBytesOfStorage == 2) && (mhzProcessorSpeed == 1 || mhzProcessorSpeed == 2)) {

            System.out.println("Wile E. Coyote buy a computer");

        } else {
            System.out.println("Wile E. Coyote do not buy a computer");

        }

        if (gigOfRam >= 16 && screenSize >= 13 && terraBytesOfStorage >= 1 && mhzProcessorSpeed >= 2){
            System.out.println("Roadrunner buy a computer.");
        } else {
            System.out.println("Roadrunner do not buy a computer.");
        }


    }

}