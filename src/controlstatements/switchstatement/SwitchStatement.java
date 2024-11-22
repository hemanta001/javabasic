package controlstatements.switchstatement;

public class SwitchStatement {
    public void executeSwitchOperation() {
        int day = 2;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Invalid day");
        }
    }

    public void withIfElse(){
        int day=2;
        if(day==1){
            System.out.println("Monday");
        }
        else if(day==2){
            System.out.println("Tuesday");
        }
        else if(day==3){
            System.out.println("Wednesday");
        }
        else {
            System.out.println("Invalid day");
        }
    }
}
