package tankas;

public class Tankas {
     static int x = 0;
    static int y = 0;
    static String kryptis;
    static int sK;
    static int sP;
    static int sA;
    static int sD;

    public void pirmyn() {
        y += 1;
        kryptis = "pasisukes i prieki";
        System.out.println("tankas pajudejo i prieki");
    }
    public void atgal() {
        y -= 1;
        kryptis = "pasisukes atgal";
    }
    public void kaire() {
        x -= 1;
        kryptis = "pasisukes i kaire";
    }
    public void desine() {
        x += 1;
        kryptis = "pasisukes i desine";
    }
    public void suvis() {
        if (kryptis == "pasisukes i prieki" ) {
            System.out.println("Suvis i priekis");
            sP += 1;
        } else if (kryptis == "pasisukes atgal") {
            System.out.println("Suvis atgal");
            sA += 1;
        } else if (kryptis == "pasisukes i kaire") {
            System.out.println("Suvis i kaire");
            sK += 1;
        } else if (kryptis == "pasisukes i desine") {
            System.out.println("Suvis i desine");
            sD += 1;
        }

    }
    public String info() {
        return "Dabartines kordinates: x:" + x + " y:"+ y + "\n Kryptis: " + kryptis + "\n Suviu skicius i puses: " + "atgal: " + sA + " , prieki: " + sP
                + " , kaire: " + sK + " , desine: " + sD;
    }
    public int getY() {
        return y;
    }
    public int getX() {
        return x;
    }
    public String getKryptis() {return kryptis;}
    public int getsD() {return sD;}
    public int getsK() {return sK;}
    public int getsP() {return sP;}
    public int getsA() {return sA;}
}
