package module1.lecture1.module1.lecture2.lecture2_3;

public class MainEmployee {
    public static void main(String[] args) {
        Office office1 = new Office("Bob", "Doy", 45, "higher", "TeamLeader", "office", 1);
        office1.workASATeamLeader();
        office1.worksFullTime();
        System.out.println();

        Office office2 = new Office("Eva", "Sem", 25, "higher", "accountant", "accounting", 2);
        office2.workAsANAccountant();
        office2.worksInShifts();
        System.out.println();

        Shop shop1 = new Shop("Dima", "Podol", 35, "higher", "Director", "Dnipro", "morning", 1);
        shop1.worksInShifts();
        shop1.worksAsADirector();
        System.out.println();

        Shop shop2 = new Shop("Sasha", "Skalun", 30, "higher", "Salesman", "Dnipro", "full time", 3 );
        shop2.sellsGoods();
        shop2.worksFullTime();
        System.out.println();

        Shop shop3 = new Shop("Nadia", "Lid", 36, "higher", "cashier", "Dnipro","full time", 2);
        shop3.worksAtTheCheckout();
        shop3.worksFullTime();
        System.out.println();
    }
}
