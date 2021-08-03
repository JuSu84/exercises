package cwiczenia31do60.cwicz43;

public class App {

    public static void main(String[] args) {

        int[] tab = {1, 6, 3, 8, 2, 9, 4};

        Sortable sortable = new Sortable() {
            @Override
            public int[] sort(int[] tab) {
                for (int i = 0; i < tab.length; i++) {
                    for (int j = 0; j < tab.length - 1; j++) {
                        if (tab[j] > tab[j + 1]) {
                            int temp = tab[j + 1];
                            tab[j + 1] = tab[j];
                            tab[j] = temp;
                        }
                    }
                }
                    return tab;
            }

        } ;
        sortable.sort(tab);
        for (int i : tab) {
            System.out.print(i);
        }
    }


}
