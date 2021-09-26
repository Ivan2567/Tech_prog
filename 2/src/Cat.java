public class Cat implements Action
{
    //public void k (int k) { };
    public int jump (int hei)
    {
        if ((hei > 0) && (hei <= 1)) {
            System.out.println("Кот успешно перепрыгнул " + hei + " метров");
        }
        else {System.out.println("Кот не смог перепрыгнуть " + hei + " метров"); hei = hei * -1; }
        return hei;
    };
    public int run (int dist)
    {
        if ((dist > 0) && (dist <= 60)) {
            System.out.println("Кот успешно пробежал " + dist + " метров");
        }
        else {System.out.println("Кот не смог пробежать " + dist + " метров"); dist = dist * -1;}
        return dist;
    };
}
