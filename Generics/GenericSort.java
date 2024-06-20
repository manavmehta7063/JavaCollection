public class GenericSort{
    public static void main(String[] args) {
        Integer[] i = {12,11,10,13,15};
        String[] s = {"Tom","Susan","King"};
        Character[] c = {'a','A','J','r'};
        Double[] d = {10.2,1.3,-3.4};

        sort(i);
        sort(s);
        sort(c);
        sort(d);

        System.out.print("Sorted Integer objects: ");
        printList(i);
        System.out.print("Sorted Double objects: ");
        printList(d);
        System.out.print("Sorted Character objects: ");
        printList(c);
        System.out.print("Sorted String objects: ");
        printList(s);
    }

    public static <E extends Comparable<E>> void sort(E[] list){
        E currentMin;
        int currentMinIndex;

        for (int i = 0; i < list.length-1; i++) {
            currentMin = list[i];
            currentMinIndex = i;

            for (int j = i+1; j < list.length; j++) {
                if(currentMin.compareTo(list[i])>0){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void printList(Object[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}