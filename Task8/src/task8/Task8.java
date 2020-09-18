
package task8;

public class Task8 {

    public static void main(String[] args) {
        Patient p1 = new Patient("Shaza","AlQays",0001,2020);
        Recipe r1 = new Recipe("001");
        Recipe r2 = new Recipe("002");
        EBS ebs1 = new EBS();
        System.out.println(p1.getProtocolNo());
    }
    
}
