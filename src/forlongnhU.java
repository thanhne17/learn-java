public class forlongnhU {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
//            n
            for (int j = 1; j <= 6; j++) {
                if (
                        (j == 1 || j == 6 || i==j)
                ) {
                    System.out.print("❤️" + "\t");
                } else {
                    System.out.print(" " + "\t");
                }
            }

//            tg
//            for (int j = 1; j <= i; j++) {
//                    System.out.print("❤️" + "\t");
//            }

//            g
            for (int j = 1; j <= 7; j++) {
                if (((j == 3 || j == 4 ) && i == 1) ||
                        ((j == 2 || j == 5) && i == 2) ||
                        ((j == 2) && i == 3) ||
                        ((j == 2 || j == 4 || j == 5) && i == 4) ||
                        ((j == 2 || j == 5) && i == 5) ||
                        ((j == 2 || j == 5) && i == 6) ||
                        ((j == 3 || j == 4) && i == 7)
                ) {
                    System.out.print("❤️" + "\t");
                } else {
                    System.out.print(" " + "\t");
                }
            }

//            t
            for (int j = 1; j <= 7; j++) {
                if (
                        ((j == 3 || j == 4 || j == 5|| j == 2|| j == 6) && i == 1) ||
                                j==4
                ) {
                    System.out.print("❤️" + "\t");
                } else {
                    System.out.print(" " + "\t");
                }
            }

//            h
            for (int j = 1; j <= 7; j++) {
                if (
                        ((j == 3 || j == 4 || j == 5|| j == 6) && i == 4) ||
                                j==3 || j==6
                ) {
                    System.out.print("❤️" + "\t");
                } else {
                    System.out.print(" " + "\t");
                }
            }

//            a
            for (int j = 1; j <= 7; j++) {
                if (
                        (j == 4 && (i == 4 || i==1)) ||
                                (j==3 && (i == 4 || i==2 )) ||
                                (j==5 && (i == 4 || i==2 )) ||
                                (j==2 && (i == 4 || i==5 || i==6 || i ==7|| i ==3)) ||
                                (j==6 && (i == 4 || i==5 || i==6 || i ==7|| i ==3))
                ) {
                    System.out.print("❤️" + "\t");
                } else {
                    System.out.print(" " + "\t");
                }
            }

//            n
            for (int j = 1; j <= 6; j++) {
                if (
                        (j == 1 || j == 6 || i==j)
                ) {
                    System.out.print("❤️" + "\t");
                } else {
                    System.out.print(" " + "\t");
                }
            }

//            h
            for (int j = 1; j <= 7; j++) {
                if (
                        ((j == 3 || j == 4 || j == 5|| j == 6) && i == 4) ||
                                j==3 || j==6
                ) {
                    System.out.print("❤️" + "\t");
                } else {
                    System.out.print(" " + "\t");
                }
            }
            System.out.println(" ");
        }
    }
}
