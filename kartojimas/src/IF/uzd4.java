package IF;

public class uzd4 {
    public static void main(String[] args) {
        int sk = 13;
        if (13 <= sk || sk<= 0) {
            System.out.println("netinkamas");
        } else if (sk % 2 == 1){
            switch (sk) {
                case 1:
                    System.out.println("saus");
                case 5:
                    System.out.println("geg");
            }

        } else if (sk % 2 == 0) {
            switch (sk) {
                case 2:
                    System.out.println("vasar");
            }

        }
    }
}
