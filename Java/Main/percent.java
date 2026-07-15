import java.util.*;;
public class percent {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter total value");
        float total=ip.nextFloat();
        System.out.println("Enter obtained value");
        float obtained=ip.nextFloat();
        float percent=obtained/total*100;
        System.out.println("percent value is "+percent+"%");
    }
}
