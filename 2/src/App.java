public class App
 {
     public static void main(String[] args)
    {
        Action[] ochered = new Action[3];
        ochered[0] = new Cat();
        ochered[1] = new Human();
        ochered[2] = new Robot();

        Rundist[] dbariers = new Rundist[3];
        dbariers[0] = new Rundist();
        dbariers[1] = new Rundist();
        dbariers[2] = new Rundist();

        Wall[] wbariers = new Wall[3];
        wbariers[0] = new Wall();
        wbariers[1] = new Wall();
        wbariers[2] = new Wall();

        for (int i = 0; i <= 2; i++)
        {
            for (int j = 0; j <= 2; j++)
            {
                //ochered[i].jump(wbariers[j].h(j + 1));

                if(ochered[i].jump(wbariers[j].h(j + 1)) < 0)
                {
                    System.out.println("Участнк №" + (i + 1) + " Сошел с дистанции");
                    break;
                }
                //ochered[i].run(dbariers[j].d((j + 1) * 60));
                if(ochered[i].run(dbariers[j].d((j + 1) * 60)) < 0)
                {
                    System.out.println("Участнк №" + (i + 1) + " Сошел с дистанции");
                    break;
                }
            }
        }
    }
}

