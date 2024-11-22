
public class Test
{
    public static void main(String[] args)
    {
        GenerickySeznam<Pes> soupis = new GenerickySeznam();
        soupis.add(new Pes("Ben", 4));
        soupis.add(new Pes("Rex", 12));
        soupis.add(new Pes("Alík", 8));
        soupis.add(new Pes("Karl von Bahnhof", 11));
        Pes pes = soupis.getUzel(0);
        for (int i=0; i<soupis.getDelka();i++) {
            pes = soupis.getUzel(i);
            System.out.println(pes.getJmeno());
        }
            
    }
}
