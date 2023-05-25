public class App {
    public static void main(String[] args) throws Exception{
        //AreaBox
        Box b1 = new Box(1);

        //Pilota
        Pilota p1 = new Pilota("Xie");
        Pilota p2 = new Pilota("Pan");
        Pilota p3 = new Pilota("Lin");
        Pilota p4 = new Pilota("Wang");
        //Monoposto
        Monoposto m1 = new Monoposto(b1, 69, "China", p1);
        Monoposto m2 = new Monoposto(b1, 42, "Giappone", p2);
        Monoposto m3 = new Monoposto(b1, 18, "Nepal", p3);
        Monoposto m4 = new Monoposto(b1, 4, "Niger", p4);

        m1.start();
        m2.start();
        m3.start();
        m4.start(); 

        m1.join();
        m2.join();
        m3.join();
        m4.join();
    }
}
