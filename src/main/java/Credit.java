public class Credit {
    private Client client;
    private static double age=0.25;
    private static double debt=0.60;
    private static double children=0.45;

    public Credit() {
    }

    public static boolean assess(Client client) {
        double certanty=0;
        if(client.getAge()>=18)
            certanty+=age;
        if(client.getDebt()==0)
            certanty+=debt;
        if(client.getnChildren()<3)
            certanty+=children;
        if(certanty>=0.60)
            return true;
        return false;
    }
}
